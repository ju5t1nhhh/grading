package edu.qd.hds.grading.web.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/message")
public class MessageController {

    @PostMapping("/")
    @ApiOperation("查看站内信")
    public void listMessage() {}

}
