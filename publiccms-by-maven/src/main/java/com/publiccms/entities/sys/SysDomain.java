package com.publiccms.entities.sys;

// Generated 2016-1-20 11:01:19 by Hibernate Tools 4.3.1
import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sanluan.common.source.entity.MyColumn;

/**
 * SysDomain generated by hbm2java
 */
@Entity
@Table(name = "sys_domain")
public class SysDomain implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @MyColumn(title = "ID")
    private Integer id;
    @MyColumn(title = "域名")
    private String name;
    @MyColumn(title = "站点", condition = true)
    private int siteId;
    @MyColumn(title = "路径")
    private String path;
    @MyColumn(title = "登陆模板路径")
    private String loginPath;
    @MyColumn(title = "注册模板路径")
    private String registerPath;

    public SysDomain() {
    }

    public SysDomain(String name, int siteId) {
        this.name = name;
        this.siteId = siteId;
    }

    public SysDomain(String name, int siteId, String path, String loginPath, String registerPath) {
        this.name = name;
        this.siteId = siteId;
        this.path = path;
        this.loginPath = loginPath;
        this.registerPath = registerPath;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "site_id", nullable = false)
    public int getSiteId() {
        return this.siteId;
    }

    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }

    @Column(name = "path")
    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Column(name = "login_path")
    public String getLoginPath() {
        return this.loginPath;
    }

    public void setLoginPath(String loginPath) {
        this.loginPath = loginPath;
    }

    @Column(name = "register_path")
    public String getRegisterPath() {
        return this.registerPath;
    }

    public void setRegisterPath(String registerPath) {
        this.registerPath = registerPath;
    }

}
