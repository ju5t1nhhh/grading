package edu.qd.hds.grading.web.controller.admin;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin/complaint")
public class AdminComplaintController {

    @PostMapping("/")
    @ApiOperation("查看投诉")
    public void listComplaints() {}

}
