package com.inf323.backend_pingpong.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inf323.backend_pingpong.dto.UserRequestDTO;
import com.inf323.backend_pingpong.dto.UserResponseDTO;
import com.inf323.backend_pingpong.service.impl.UserServiceImpl;

@RestController
@RequestMapping("/auth")
public class UserController {
  private final UserServiceImpl userServiceImpl;

  public UserController(UserServiceImpl userServiceImpl) {
    this.userServiceImpl = userServiceImpl;
  }

  @PostMapping("/user")
  public ResponseEntity<UserResponseDTO> createUser(@RequestBody UserRequestDTO userRequestDTO) {
    try {
      return ResponseEntity.ok(userServiceImpl.createUser(userRequestDTO));
    } catch (Exception e) {
      return ResponseEntity.badRequest().build();
    }
  }

  @PostMapping("/login")
  public ResponseEntity<UserResponseDTO> login(@RequestBody UserRequestDTO userRequestDTO) {
    try {
      if (userServiceImpl.login(userRequestDTO) == null)
        return ResponseEntity.badRequest().build();
      return ResponseEntity.ok(userServiceImpl.login(userRequestDTO));
    } catch (Exception e) {
      return ResponseEntity.badRequest().build();
    }
  }
}
