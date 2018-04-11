package edu.qd.hds.grading.web.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/score")
public class ScoreController {

    @PostMapping("/add")
    @ApiOperation("添加打分")
    public void addScore() {}

    @PostMapping("/list")
    @ApiOperation("查看打分")
    public void listScore() {}

}
