package com.inf323.backend_pingpong.dao;

import com.inf323.backend_pingpong.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserDAO extends JpaRepository<User, Long> {
  @Query("SELECT u FROM User u WHERE u.username = :username")
  User findByUsername(String username);
}
