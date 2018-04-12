package edu.qd.hds.grading.dao.admin;

import edu.qd.hds.grading.dao.BaseDao;
import edu.qd.hds.grading.domain.ComplaintPost;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminComplaintPostDao extends BaseDao<ComplaintPost> {

    @Deprecated
    int insertOne(ComplaintPost complaintPost);

    @Deprecated
    int deleteByDTO(ComplaintPost complaintPost);

}
