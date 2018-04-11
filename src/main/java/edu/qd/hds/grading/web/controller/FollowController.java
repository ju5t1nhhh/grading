package edu.qd.hds.grading.web.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/follow")
public class FollowController {

    @PostMapping("/add")
    @ApiOperation("新增关注")
    public void addFollow() {}

    @PostMapping("/cancel")
    @ApiOperation("取消关注")
    public void cancelFollow() {}

    @PostMapping("/listFollowin")
    @ApiOperation("查看我的关注")
    public void listFollowin() {}

    @GetMapping("/listFollowers")
    @ApiOperation("查看谁关注我")
    public void listFollowers() {}

}
