package com.example.ecommerce.Controllers;

import com.example.ecommerce.DB.insertData;
import com.example.ecommerce.Helpers.response;
import com.example.ecommerce.Helpers.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class registerController {
    @PostMapping("/register")
    public response register(@RequestBody user u) {
        return insertData.addUser(u);
    }
}
