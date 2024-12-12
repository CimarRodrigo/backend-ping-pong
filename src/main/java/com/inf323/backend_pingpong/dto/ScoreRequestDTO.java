package com.inf323.backend_pingpong.dto;

public class ScoreRequestDTO {
  private Long score;
  private Long userId;

  public ScoreRequestDTO() {
  }

  public ScoreRequestDTO(Long score, Long userId) {
    this.score = score;
    this.userId = userId;
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
