package edu.qd.hds.grading.dao.admin;

import edu.qd.hds.grading.domain.Comment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AdminCommentDaoTest {

    @Autowired
    private AdminCommentDao adminCommentDao;

    @Test
    public void insertOne() throws Exception {

    }

    @Test
    public void updateOne() throws Exception {

    }

    @Test
    public void deleteByDTO() throws Exception {
        Comment comment = new Comment();
        comment.setPost(1);
        comment.setCmtid(1);
        int rows = adminCommentDao.deleteByDTO(comment);
        System.out.println("delete:" + rows);
    }

    @Test
    public void selectByDTO() throws Exception {
//        Comment comment = new Comment();
//        comment.setCreatime(new Timestamp(10000000));
//        Comment[] comments = adminCommentDao.selectByDTO(comment);
//        for( Comment cmt: comments )
//            System.out.println(cmt);
    }


}