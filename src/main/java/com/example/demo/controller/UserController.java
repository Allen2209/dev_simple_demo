
package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

@RestController
public class UserController {

    @GetMapping("/welcome")
    public String displayname(@RequestParam String username) {
        User user = new User();
        user.setUsername(username);
        return user.getUsername();
    }
}
