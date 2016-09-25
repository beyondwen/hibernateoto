package com.wenhao.hibernateoto.domain;

import javax.persistence.*;

/**
 * Created by lenovo on 2016/09/25.
 */
public class QQZone {
    private Long id;
    private String name;
    private QQ qq;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public QQ getQq() {
        return qq;
    }

    public void setQq(QQ qq) {
        this.qq = qq;
    }
}
