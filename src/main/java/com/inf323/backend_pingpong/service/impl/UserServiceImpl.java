package com.inf323.backend_pingpong.service.impl;

import org.springframework.stereotype.Service;

import com.inf323.backend_pingpong.dao.UserDAO;
import com.inf323.backend_pingpong.dto.UserRequestDTO;
import com.inf323.backend_pingpong.dto.UserResponseDTO;
import com.inf323.backend_pingpong.model.User;
import com.inf323.backend_pingpong.service.UserService;

@Service
public class UserServiceImpl implements UserService {
  private final UserDAO userDAO;

  public UserServiceImpl(UserDAO userDAO) {
    this.userDAO = userDAO;
  }

  @Override
  public UserResponseDTO createUser(UserRequestDTO userRequestDTO) {
    User user = new User();
    user.setUsername(userRequestDTO.getUsername());
    user.setEmail(userRequestDTO.getEmail());
    user.setPassword(userRequestDTO.getPassword());
    User userSaved = userDAO.save(user);
    return new UserResponseDTO(userSaved.getId(), userSaved.getUsername(), userSaved.getEmail());
  }

  @Override
  public UserResponseDTO login(UserRequestDTO userRequestDTO) {
    User user = userDAO.findByUsername(userRequestDTO.getUsername());
    if (user == null) {
      return null;
    }
    if (!user.getPassword().equals(userRequestDTO.getPassword())) {
      return null;
    }

    return new UserResponseDTO(user.getId(), user.getUsername(), user.getEmail());
  }

}
