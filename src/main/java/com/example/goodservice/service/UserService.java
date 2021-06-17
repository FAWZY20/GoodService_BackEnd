package com.example.goodservice.service;


import com.example.goodservice.DTO.UserDTO;
import com.example.goodservice.model.UserEntity;
import com.example.goodservice.repo.UserRepository;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private DTOMapper mapper;

    @Autowired
    private UserRepository repo;

    public UserEntity saveUser(UserEntity userEntity) {

        return repo.save(userEntity);
    }

    public UserEntity fetchUserByEmail(String email) {
        return repo.findByEmail(email);
    }

    public UserEntity fetchUserByEmailAndMdp(String email, String mdp) {
        return repo.findUserByEmailAndMdp(email, mdp);
    }

    public List<UserEntity> getUser() {
        val entities = repo.findAll();
        return mapper.mapAsList(entities, UserEntity.class);
    }

    public UserEntity getUserById(int id) {
        Optional<UserEntity> optionalUser = repo.findById(id);
        return optionalUser.get();
    }
}
