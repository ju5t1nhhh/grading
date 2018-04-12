package edu.qd.hds.grading.dao.admin;

import edu.qd.hds.grading.domain.Admin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AdminDaoTest {

    @Autowired
    private AdminDao adminDao;

    @Test
    public void insertOne() throws Exception {
        Admin admin = new Admin();
        admin.setLoginId("hst1123");
        admin.setPwd("wdwijdiwjdw");
        admin.setRole(1);
        int rows = adminDao.insertOne(admin);
        System.out.println("insert:" + rows);
    }

    @Test
    public void selectByDTO() throws Exception {
//        Admin admin = new Admin();
        Admin[] admins = adminDao.selectByDTO(null,0,1);
        for ( Admin adm: admins )
            System.out.println(adm);
    }

}