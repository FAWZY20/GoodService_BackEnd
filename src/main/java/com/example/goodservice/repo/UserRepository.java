package com.example.goodservice.repo;


import com.example.goodservice.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    public UserEntity findByEmail(String email);
    public UserEntity findUserByEmailAndMdp(String email, String mdp);
}