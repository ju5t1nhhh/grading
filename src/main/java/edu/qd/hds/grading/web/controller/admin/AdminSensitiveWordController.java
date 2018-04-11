package edu.qd.hds.grading.web.controller.admin;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin/senword")
public class AdminSensitiveWordController {

    @PostMapping("/add")
    @ApiOperation("添加敏感词")
    public void addSenword() {}

    @PostMapping("/delete")
    @ApiOperation("删除敏感词")
    public void deleteSenword() {}

    @PostMapping("/update")
    @ApiOperation("修改敏感词")
    public void updateSenword() {}

    @PostMapping("/list")
    @ApiOperation("查看敏感词")
    public void listSenword() {}

}
