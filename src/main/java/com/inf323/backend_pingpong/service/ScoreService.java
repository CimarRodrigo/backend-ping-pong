package com.inf323.backend_pingpong.service;

import java.util.List;

import com.inf323.backend_pingpong.dto.ScoreRequestDTO;
import com.inf323.backend_pingpong.dto.ScoreResponseDTO;

public interface ScoreService {
  ScoreResponseDTO createScore(ScoreRequestDTO scoreRequestDTO);

  List<ScoreResponseDTO> getScores(Long idUser);
}
