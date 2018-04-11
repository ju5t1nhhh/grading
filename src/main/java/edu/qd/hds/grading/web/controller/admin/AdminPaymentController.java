package edu.qd.hds.grading.web.controller.admin;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin/pay")
public class AdminPaymentController {

    @PostMapping("/list")
    @ApiOperation("查看充钱历史")
    public void listPayment() {}

}
