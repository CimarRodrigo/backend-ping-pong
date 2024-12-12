package com.inf323.backend_pingpong.dao;

import com.inf323.backend_pingpong.model.Score;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ScoreDAO extends JpaRepository<Score, Long> {
  @Query("SELECT s FROM Score s WHERE s.user.id = :userId")
  List<Score> findByUserId(Long userId);
}
