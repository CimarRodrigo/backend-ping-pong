package com.inf323.backend_pingpong.service;

import com.inf323.backend_pingpong.dto.UserRequestDTO;
import com.inf323.backend_pingpong.dto.UserResponseDTO;

public interface UserService {
  UserResponseDTO createUser(UserRequestDTO userRequestDTO);

  UserResponseDTO login(UserRequestDTO userRequestDTO);
}
