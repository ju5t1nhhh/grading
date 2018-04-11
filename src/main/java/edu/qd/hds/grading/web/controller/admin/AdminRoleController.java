package edu.qd.hds.grading.web.controller.admin;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin/role")
public class AdminRoleController {

    @PostMapping("/add")
    @ApiOperation("添加角色")
    public void addRole() {}

    @PostMapping("/delete")
    @ApiOperation("删除角色")
    public void deleteRole() {}

    @PostMapping("/update")
    @ApiOperation("修改角色")
    public void updateRole() {}

    @PostMapping("/list")
    @ApiOperation("查看角色")
    public void listRoles() {}

}
