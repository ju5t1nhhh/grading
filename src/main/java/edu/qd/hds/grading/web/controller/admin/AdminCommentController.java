package edu.qd.hds.grading.web.controller.admin;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin/comment")
public class AdminCommentController {

    @PostMapping("/{post:\\d+}/{cmt:\\d+}")
    @ApiOperation("删除评论")
    public void deleteComment() {}

}
