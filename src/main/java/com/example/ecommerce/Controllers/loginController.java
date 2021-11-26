package com.example.ecommerce.Controllers;

import com.example.ecommerce.DB.insertData;
import com.example.ecommerce.Helpers.authlogin;
import com.example.ecommerce.Helpers.response;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class loginController {

    @PostMapping("/login")
    public response login(@RequestBody authlogin credentials) {
        return insertData.userLogin(credentials);
    }

    @GetMapping("/allUser")
    public response getallUsers() {
        return insertData.meow();
    }
}
