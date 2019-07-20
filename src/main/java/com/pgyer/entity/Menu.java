package com.pgyer.entity;

import java.io.Serializable;

public class Menu implements Serializable {
    private Integer menuId;

    private String menuName;

    private String menuUpper;

    private String menuUrl;

    private static final long serialVersionUID = 1L;

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getMenuUpper() {
        return menuUpper;
    }

    public void setMenuUpper(String menuUpper) {
        this.menuUpper = menuUpper == null ? null : menuUpper.trim();
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl == null ? null : menuUrl.trim();
    }
}