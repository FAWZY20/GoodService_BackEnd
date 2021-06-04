package com.example.goodservice.controller;

import com.example.goodservice.model.UserEntity;
import com.example.goodservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public List<UserEntity> getUser(){
        return service.getUser();
    }

    @GetMapping(value = "utilisateur/{id}")
    public UserEntity getUser(@PathVariable("id") int id){
        return service.getUserById(id);
    }

    @PostMapping("/inscription/utilisateur")
    public UserEntity registerUser(@RequestBody UserEntity user) throws Exception {
        String tempEmail = user.getEmail();
        if(tempEmail != null && !"".equals(tempEmail))
        {
            UserEntity userobj = (UserEntity) service.fetchUserByEmail(tempEmail);
            if(userobj != null) {
                throw  new Exception("utilisateur avec"+tempEmail+"existe déjà");
            }
        }
        UserEntity userObj = null;
        userObj = (UserEntity) service.saveUser(user);
        return (UserEntity) userObj;
    }

    @PostMapping("/connexion/utilisateur")
    public UserEntity loginUser(@RequestBody UserEntity userEntity) throws Exception {
        String tempEmail = userEntity.getEmail();
        String tempPass = userEntity.getMdp();
        UserEntity userObj = null;
        if(tempEmail != null && tempPass != null) {
           userObj = (UserEntity) service.fetchUserByEmailAndMdp(tempEmail, tempPass);
        }
        if(userObj == null ) {
            throw new Exception("Mauvaises qualifications");
        }
        return (UserEntity) userObj;
    }

}
