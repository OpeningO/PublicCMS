package com.publiccms.entities.sys;

// Generated 2016-3-4 18:33:25 by Hibernate Tools 4.3.1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.sanluan.common.source.entity.MyColumn;

/**
 * SysEmailToken generated by hbm2java
 */
@Entity
@Table(name = "sys_email_token")
public class SysEmailToken implements java.io.Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @MyColumn(title = "验证授权码")
    private String authToken;
    @MyColumn(title = "用户", condition = true)
    private int userId;
    @MyColumn(title = "邮件地址")
    private String email;    
    @MyColumn(title = "创建日期")
    private Date createDate;

    public SysEmailToken() {
    }

    public SysEmailToken(String authToken, int userId, String email, Date createDate) {
        this.authToken = authToken;
        this.userId = userId;
        this.email = email;
        this.createDate = createDate;
    }

    @Id
    @Column(name = "auth_token", unique = true, nullable = false, length = 40)
    public String getAuthToken() {
        return this.authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    @Column(name = "user_id", nullable = false)
    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Column(name = "email", nullable = false, length = 100)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date", nullable = false, length = 19)
    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

}
