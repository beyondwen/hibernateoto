package com.wenhao.hibernateoto.domain;

import javax.persistence.*;

/**
 * Created by lenovo on 2016/09/25.
 */
public class QQ {
    private Long id;
    private String qqNumber;
    private QQZone zone;

    public QQZone getZone() {
        return zone;
    }

    public void setZone(QQZone zone) {
        this.zone = zone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQqNumber() {
        return qqNumber;
    }

    public void setQqNumber(String qqNumber) {
        this.qqNumber = qqNumber;
    }
}
