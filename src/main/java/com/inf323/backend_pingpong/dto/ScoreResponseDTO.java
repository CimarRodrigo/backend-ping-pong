package com.inf323.backend_pingpong.dto;

public class ScoreResponseDTO {
  private Long id;
  private Long score;
  private Long userId;

  public ScoreResponseDTO() {
  }

  public ScoreResponseDTO(Long id, Long score, Long userId) {
    this.id = id;
    this.score = score;
    this.userId = userId;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getScore() {
    return score;
  }

  public void setScore(Long score) {
    this.score = score;
  }

  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }
}
