package edu.qd.hds.grading.web.controller;


import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @PostMapping("/validateCode")
    @ApiOperation("验证码")
    public void validateCode() {}

    @PostMapping("/email")
    @ApiOperation("邮箱验证码")
    public void email() {}

    @PostMapping("/register")
    @ApiOperation("注册")
    public void regist() {
    }

    @PostMapping("/login")
    @ApiOperation("登录")
    public void login() {

    }

    @PostMapping("/modify/email")
    @ApiOperation("修改邮箱")
    public void modifyEmail() {}

    @PostMapping("/modify/pwd")
    @ApiOperation("修改密码")
    public void modifyPwd() {}

}
