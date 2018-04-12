package edu.qd.hds.grading.dao.admin;

import edu.qd.hds.grading.dao.BaseDao;
import edu.qd.hds.grading.domain.Complaint;
import edu.qd.hds.grading.domain.Payment;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminPaymentDao extends BaseDao<Payment> {

    @Deprecated
    int updateOne(Complaint complaint);

    @Deprecated
    int deleteByDTO(Complaint complaint);

}
