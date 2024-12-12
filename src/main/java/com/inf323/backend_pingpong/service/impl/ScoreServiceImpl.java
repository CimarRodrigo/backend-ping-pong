package com.inf323.backend_pingpong.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.inf323.backend_pingpong.dao.ScoreDAO;
import com.inf323.backend_pingpong.dao.UserDAO;
import com.inf323.backend_pingpong.dto.ScoreRequestDTO;
import com.inf323.backend_pingpong.dto.ScoreResponseDTO;
import com.inf323.backend_pingpong.model.Score;
import com.inf323.backend_pingpong.model.User;
import com.inf323.backend_pingpong.service.ScoreService;

@Service
public class ScoreServiceImpl implements ScoreService {

  private final ScoreDAO scoreDAO;
  private final UserDAO userDAO;

  public ScoreServiceImpl(ScoreDAO scoreDAO, UserDAO userDAO) {
    this.scoreDAO = scoreDAO;
    this.userDAO = userDAO;
  }

  @Override
  public ScoreResponseDTO createScore(ScoreRequestDTO scoreRequestDTO) {

    User user = userDAO.findById(scoreRequestDTO.getUserId()).orElseThrow(() -> new RuntimeException("User not found"));

    Score score = new Score();
    score.setUser(user);
    score.setScore(scoreRequestDTO.getScore());

    Score scoreSaved = scoreDAO.save(score);
    return new ScoreResponseDTO(scoreSaved.getId(), scoreSaved.getUser().getId(), scoreSaved.getScore());
  }

  @Override
  public List<ScoreResponseDTO> getScores(Long idUser) {
    User user = userDAO.findById(idUser).orElseThrow(() -> new RuntimeException("User not found"));
    List<Score> scores = scoreDAO.findByUserId(user.getId());
    List<ScoreResponseDTO> scoreResponseDTOs = new ArrayList<>();
    for (Score score : scores) {
      scoreResponseDTOs.add(new ScoreResponseDTO(score.getId(),
          score.getScore(), score.getUser().getId()));
    }
    return scoreResponseDTOs;
  }

}
