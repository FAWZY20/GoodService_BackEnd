package com.example.goodservice.repo;

import com.example.goodservice.model.UserRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserRegister, String> {
    public UserRegister findByEmail(String email);
    public UserRegister findUserByEmailAndMdp(String email, String mdp);
}
