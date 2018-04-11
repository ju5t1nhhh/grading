package edu.qd.hds.grading.web.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/favorite")
public class FavoriteController {

    @PostMapping("/add")
    @ApiOperation("添加收藏")
    public void addFavorite() {

    }

    @PostMapping("/cancel")
    @ApiOperation("取消收藏")
    public void cancelFavorite() {}

    @PostMapping("/list")
    @ApiOperation("查看收藏")
    public void listFavorite() {}

}
