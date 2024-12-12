package com.inf323.backend_pingpong.dto;

public class UserResponseDTO {
  private Long id;
  private String username;
  private String email;

  public UserResponseDTO() {
  }

  public UserResponseDTO(Long id, String name, String email) {
    this.id = id;
    this.username = name;
    this.email = email;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
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
}
