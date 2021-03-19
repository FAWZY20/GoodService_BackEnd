package com.example.goodservice.controller;

import com.example.goodservice.Service.UserService;
import com.example.goodservice.model.UserRegister;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
public class UserRegisterController {

    @Autowired
    private UserService service;

    @PostMapping("/register")
    public UserRegister registerUser(@RequestBody UserRegister user) throws Exception {
        String tempEmail = user.getEmail();
        if(tempEmail != null && !"".equals(tempEmail))
        {
            UserRegister userobj = (UserRegister) service.fetchUserByEmail(tempEmail);
            if(userobj != null) {
                throw  new Exception("utilisateur avec"+tempEmail+"existe déjà");
            }
        }
        UserRegister userObj = null;
        userObj = (UserRegister) service.saveUser(user);
        return (UserRegister) userObj;
    }

    @PostMapping("/login")
    public UserRegister loginUser(@RequestBody UserRegister userRegister) throws Exception {
        String tempEmail = userRegister.getEmail();
        String tempPass = userRegister.getMdp();
        UserRegister userObj = null;
        if(tempEmail != null && tempPass != null) {
           userObj = (UserRegister) service.fetchUserByEmailAndMdp(tempEmail, tempPass);
        }
        if(userObj == null ) {
            throw new Exception("Bad credentials");
        }
        return (UserRegister) userObj;
    }

}
