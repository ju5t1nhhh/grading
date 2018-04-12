package edu.qd.hds.grading.dao.admin;

import edu.qd.hds.grading.dao.BaseDao;
import edu.qd.hds.grading.domain.Complaint;
import edu.qd.hds.grading.domain.SensitiveWord;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminSensitiveWordDao extends BaseDao<SensitiveWord> {

    @Deprecated
    int updateOne(Complaint complaint);

}
