package edu.qd.hds.grading.web.controller.admin;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @PostMapping("/login")
    @ApiOperation("管理员登录")
    public void login() {

    }

    @PostMapping("/add")
    @ApiOperation("新增管理员")
    public void add() {}

    @PostMapping("/delete")
    @ApiOperation("删除管理员")
    public void delete() {}

    @PostMapping("/modify")
    @ApiOperation("修改角色")
    public void changeRole() {}

    @PostMapping("/pwd")
    @ApiOperation("修改密码")
    public void changePwd() {}

    @PostMapping("/list")
    @ApiOperation("查看管理员列表")
    public void list() {}
}
