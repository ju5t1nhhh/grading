package edu.qd.hds.grading.web.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/complaint")
public class ComplaintController {

    @PostMapping("/")
    @ApiOperation("新增投诉")
    public void addComplaint() {
    }

}
