package edu.qd.hds.grading.dao.admin;

import edu.qd.hds.grading.dao.BaseDao;
import edu.qd.hds.grading.domain.Complaint;
import edu.qd.hds.grading.domain.Post;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminPostDao extends BaseDao<Post> {

    @Deprecated
    int insertOne(Complaint complaint);

    @Deprecated
    int updateOne(Complaint complaint);

}
