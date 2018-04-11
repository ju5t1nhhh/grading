package edu.qd.hds.grading.web.controller.admin;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/permission")
public class AdminPermissionController {

    @PostMapping("/add")
    @ApiOperation("添加权限")
    public void addPermission() {}

    @PostMapping("/delete")
    @ApiOperation("删除权限")
    public void deletePermission() {}

    @PostMapping("/update")
    @ApiOperation("更新权限")
    public void updatePermission() {}

    @PostMapping("/list")
    @ApiOperation("查看权限")
    public void listPermission() {}

}
