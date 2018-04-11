package edu.qd.hds.grading.web.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/post")
public class PostController {

    @PostMapping("/add")
    @ApiOperation("添加作品")
    public void addPost() {}

    @PostMapping("/delete")
    @ApiOperation("删除作品")
    public void deletePost() {}

    @GetMapping("/detail")
    @ApiOperation("作品详情")
    public void showPost() {}

    @GetMapping("/list")
    @ApiOperation("查看作品")
    public void listPost() {}

}
