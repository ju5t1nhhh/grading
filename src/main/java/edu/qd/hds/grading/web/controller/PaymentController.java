package edu.qd.hds.grading.web.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pay")
public class PaymentController {

    @PostMapping("/add")
    @ApiOperation("充钱")
    public void addPayment() {}

    @PostMapping("/list")
    @ApiOperation("查看充钱历史")
    public void listPayment() {}

}
