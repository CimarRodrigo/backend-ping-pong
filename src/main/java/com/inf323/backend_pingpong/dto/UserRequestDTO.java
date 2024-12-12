package com.inf323.backend_pingpong.dto;

public class UserRequestDTO {
  private String username;
  private String email;
  private String password;

  public UserRequestDTO() {
  }

  public UserRequestDTO(String name, String email, String password) {
    this.username = name;
    this.email = email;
    this.password = password;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String name) {
    this.username = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
