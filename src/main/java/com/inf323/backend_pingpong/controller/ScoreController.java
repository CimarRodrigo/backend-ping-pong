package com.inf323.backend_pingpong.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inf323.backend_pingpong.dto.ScoreRequestDTO;
import com.inf323.backend_pingpong.dto.ScoreResponseDTO;
import com.inf323.backend_pingpong.service.impl.ScoreServiceImpl;

@RestController
@RequestMapping("/game")
class ScoreController {

  private final ScoreServiceImpl scoreService;

  public ScoreController(ScoreServiceImpl scoreService) {
    this.scoreService = scoreService;
  }

  @PostMapping("/score")
  public ResponseEntity<ScoreResponseDTO> createScore(@RequestBody ScoreRequestDTO scoreRequestDTO) {
    return ResponseEntity.ok(scoreService.createScore(scoreRequestDTO));
  }

  @GetMapping("/score/{idUser}")
  public ResponseEntity<List<ScoreResponseDTO>> getScores(@PathVariable Long idUser) {
    return ResponseEntity.ok(scoreService.getScores(idUser));
  }
}
