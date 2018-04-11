package edu.qd.hds.grading.web.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/likes")
public class LikesController {

    @PostMapping("/add")
    @ApiOperation("添加点赞")
    public void addLikes() {}

    @PostMapping("/cancel")
    @ApiOperation("取消点赞")
    public void cancelLikes() {}

    @PostMapping("/list")
    @ApiOperation("查看我的点赞")
    public void listLikes() {}

}
