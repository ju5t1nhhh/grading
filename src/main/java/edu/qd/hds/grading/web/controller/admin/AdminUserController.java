package edu.qd.hds.grading.web.controller.admin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin/user")
public class AdminUserController {

    @PostMapping("/add")
    public void addUser() {}

    @PostMapping("/delete")
    public void deleteUser() {}

    @PostMapping("/update")
    public void updateUser() {}

    @PostMapping("/list")
    public void listUsers() {}

}
