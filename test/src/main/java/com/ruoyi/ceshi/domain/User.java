package com.ruoyi.ceshi.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 用户表对象 user
 * 
 * @author ruoyi
 * @date 2020-10-22
 */
public class User extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 用户名 */
    @Excel(name = "用户名")
    private String userName;

    /** 密码 */
    @Excel(name = "密码")
    private String passWord;

    /** 创建人 */
    private String created;

    /** 创建时间 */
    private Date createdTime;

    /** 更改人 */
    private String update;

    /** 删除标志位 */
    private String del;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }
    public void setPassWord(String passWord) 
    {
        this.passWord = passWord;
    }

    public String getPassWord() 
    {
        return passWord;
    }
    public void setCreated(String created) 
    {
        this.created = created;
    }

    public String getCreated() 
    {
        return created;
    }
    public void setCreatedTime(Date createdTime) 
    {
        this.createdTime = createdTime;
    }

    public Date getCreatedTime() 
    {
        return createdTime;
    }
    public void setUpdate(String update) 
    {
        this.update = update;
    }

    public String getUpdate() 
    {
        return update;
    }
    public void setDel(String del) 
    {
        this.del = del;
    }

    public String getDel() 
    {
        return del;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userName", getUserName())
            .append("passWord", getPassWord())
            .append("created", getCreated())
            .append("createdTime", getCreatedTime())
            .append("update", getUpdate())
            .append("updateTime", getUpdateTime())
            .append("del", getDel())
            .toString();
    }
}
