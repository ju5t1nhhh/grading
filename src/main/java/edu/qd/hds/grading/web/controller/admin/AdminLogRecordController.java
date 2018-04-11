package edu.qd.hds.grading.web.controller.admin;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin/logrecord")
public class AdminLogRecordController {

    @PostMapping("/")
    @ApiOperation("查看日志记录")
    public void listLogs() {}

}
