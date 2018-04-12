package edu.qd.hds.grading.dao.admin;

import edu.qd.hds.grading.dao.BaseDao;
import edu.qd.hds.grading.domain.Complaint;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminComplaintDao extends BaseDao<Complaint> {

    @Deprecated
    int insertOne(Complaint complaint);

    @Deprecated
    int updateOne(Complaint complaint);

    @Deprecated
    int deleteByDTO(Complaint complaint);

}
