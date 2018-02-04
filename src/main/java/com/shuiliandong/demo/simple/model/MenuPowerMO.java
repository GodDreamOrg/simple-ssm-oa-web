package com.shuiliandong.demo.simple.model;

import java.io.Serializable;
import java.util.List;

public class MenuPowerMO implements Serializable {
    private static final long serialVersionUID = -272772091483015093L;

    private Long id;
    private Long parentId;
    private String name;
    private String desc;
    private Integer status;
    private Integer sortNo;
    private Integer type;
    private Integer flag;
    private String url;
    private String showName;

    private List<MenuPowerMO> childList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public List<MenuPowerMO> getChildList() {
        return childList;
    }

    public void setChildList(List<MenuPowerMO> childList) {
        this.childList = childList;
    }
}
