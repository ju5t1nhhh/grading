package edu.qd.hds.grading.web.controller.admin;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin/section")
public class AdminSectionController {

    @PostMapping("/add")
    @ApiOperation("添加版区")
    public void addSection() {}

    @PostMapping("/delete")
    @ApiOperation("删除版区")
    public void deleteSection() {}

    @PostMapping("/update")
    @ApiOperation("修改版区")
    public void updateSection() {}

    @GetMapping("/list")
    @ApiOperation("查看版区")
    public void listSection() {}

}
