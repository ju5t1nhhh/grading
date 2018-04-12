package edu.qd.hds.grading.dao.admin;

import edu.qd.hds.grading.dao.BaseDao;
import edu.qd.hds.grading.domain.Comment;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminCommentDao extends BaseDao<Comment> {

    @Deprecated
    int insertOne(Comment comment);

    @Deprecated
    int updateOne(Comment comment);

}
