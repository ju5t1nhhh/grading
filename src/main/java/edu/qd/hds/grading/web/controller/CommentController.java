package edu.qd.hds.grading.web.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/comment")
public class CommentController {

    @GetMapping("/{post:\\d+}")
    @ApiOperation("获取评论" )
    public void getComments() {}

    @PostMapping("/{post:\\d+}")
    @ApiOperation("添加评论" )
    public void addComment() {}

    @PostMapping("/{post:\\d+}/{cmt:\\d+}")
    @ApiOperation("删除评论" )
    public void deleteComment() {}

}
