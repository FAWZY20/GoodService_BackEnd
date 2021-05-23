package com.example.goodservice.service;


import com.example.goodservice.model.UserRegister;
import com.example.goodservice.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class UserService {

    @Autowired
    private UserRepository repo;

    public UserRegister saveUser(UserRegister userRegister) {
        return repo.save(userRegister);
    }

    public UserRegister fetchUserByEmail(String email)
    {
       return repo.findByEmail(email);
    }

   public UserRegister fetchUserByEmailAndMdp(String email, String mdp)
    {
        return repo.findUserByEmailAndMdp(email, mdp);
    }
}
