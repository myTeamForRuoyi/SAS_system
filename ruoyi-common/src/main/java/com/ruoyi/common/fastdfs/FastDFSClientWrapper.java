package com.ruoyi.common.fastdfs;

import java.io.*;
import java.net.URLEncoder;

import com.github.tobato.fastdfs.proto.storage.DownloadByteArray;
import com.github.tobato.fastdfs.service.TrackerClient;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.github.tobato.fastdfs.domain.StorePath;
import com.github.tobato.fastdfs.service.FastFileStorageClient;


/**
* @author hao
* FastDFS 的公用类
* */
@Component
public class FastDFSClientWrapper {

    @Autowired
    private FastFileStorageClient storageClient;


/**
 * 上传文件到服务器
 * @param file
 * @return String
 * */
    public String uploadFile(MultipartFile file) throws IOException {
        StorePath storePath = storageClient.uploadFile((InputStream) file.getInputStream(), file.getSize(), FilenameUtils.getExtension(file.getOriginalFilename()), null);
        return getResAccessUrl(storePath);
    }
    /**
     * 下载文件
     * @param fileInfo
     * @return byte[]
     * */
    public byte[] downLoadFile(FileInfo fileInfo) {

        try {
            String fileName = URLEncoder.encode(fileInfo.getName(), "UTF8");
            DownloadByteArray callback = new DownloadByteArray();
            String url = fileInfo.getFileUrl().replaceAll("http://119.3.101.139:8080/group1/", "");
//            url="M00/00/00/wKgAd1-Hq2OAcuVfAcuwoBlmW4U633.exe";
            byte[] bytes = storageClient.downloadFile("group1", url, callback);
            return bytes;
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 删除文件
     * @param filePath
     * */
    public void deleteFile(String filePath) {
        storageClient.deleteFile(filePath);

    }
    /**
     * 封装文件完整URL地址
     * @param storePath
     * */
    private String getResAccessUrl(StorePath storePath) {
        String fileUrl = "http://119.3.101.139:8080" + "/" + storePath.getFullPath();
        return fileUrl;
    }
}
