package com.wenhao.hibernateoto.dao;

import com.wenhao.hibernateoto.domain.QQ;
import com.wenhao.hibernateoto.domain.QQZone;
import com.wenhao.hibernateoto.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lenovo on 2016/09/25.
 */
public class DomainDaoTest {
    @Before
    public void create() throws Exception {
        Session session = HibernateUtils.getSession();
    }

    @Test
    public void save() throws Exception {
        Session session = HibernateUtils.getSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();
        QQ qq = new QQ();
        qq.setQqNumber("100000");
        QQZone qqZone = new QQZone();
        qqZone.setName("wenhao");
        session.save(qq);
        qq.setZone(qqZone);
        qqZone.setQq(qq);
        session.save(qqZone);
        transaction.commit();
        session.close();
    }


}