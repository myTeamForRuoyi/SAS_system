package com.ruoyi.ceshi.mapper;

import java.util.List;
import com.ruoyi.ceshi.domain.User;

/**
 * 用户表Mapper接口
 * 
 * @author ruoyi
 * @date 2020-10-22
 */
public interface UserMapper 
{
    /**
     * 查询用户表
     * 
     * @param id 用户表ID
     * @return 用户表
     */
    public User selectUserById(Long id);

    /**
     * 查询用户表列表
     * 
     * @param user 用户表
     * @return 用户表集合
     */
    public List<User> selectUserList(User user);

    /**
     * 新增用户表
     * 
     * @param user 用户表
     * @return 结果
     */
    public int insertUser(User user);

    /**
     * 修改用户表
     * 
     * @param user 用户表
     * @return 结果
     */
    public int updateUser(User user);

    /**
     * 删除用户表
     * 
     * @param id 用户表ID
     * @return 结果
     */
    public int deleteUserById(Long id);

    /**
     * 批量删除用户表
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteUserByIds(String[] ids);
}
