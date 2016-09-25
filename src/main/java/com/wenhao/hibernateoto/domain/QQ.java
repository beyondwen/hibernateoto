package com.wenhao.hibernateoto.domain;

import javax.persistence.*;

/**
 * Created by lenovo on 2016/09/25.
 */
@Entity
public class QQ {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String qqNumber;

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
