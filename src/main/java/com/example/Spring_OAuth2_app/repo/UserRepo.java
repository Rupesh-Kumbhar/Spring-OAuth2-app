package com.example.Spring_OAuth2_app.repo;

import com.example.Spring_OAuth2_app.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users,Integer> {

    Users findByUsername(String username);

}
