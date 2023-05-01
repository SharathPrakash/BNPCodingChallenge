package com.bnp.coding.Coding.Challenge.controller;

import com.bnp.coding.Coding.Challenge.model.Game;
import com.bnp.coding.Coding.Challenge.model.TennisGame;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TennisGameController {

    private TennisGame game;

    public TennisGameController() {
        game = new TennisGame();
    }

    @GetMapping("/score")
    public TennisGame getScore() {
        return game;
    }

    @PostMapping("/player1")
    public void player1Scores() {
        if (game.getStatus().equals("in progress")) {
            updateScore(1);
        }
    }

    @PostMapping("/player2")
    public void player2Scores() {
        if (game.getStatus().equals("in progress")) {
            updateScore(2);
        }
    }

    private void updateScore(int player) {
        if (player == 1) {
            game.setPlayer1Score(game.getPlayer1Score() + 1);
        } else {
            game.setPlayer2Score(game.getPlayer2Score() + 1);
        }

        if (game.getPlayer1Score() >= 4 && game.getPlayer1Score() - game.getPlayer2Score() >= 2) {
            game.setStatus("player 1 wins");
        } else if (game.getPlayer2Score() >= 4 && game.getPlayer2Score() - game.getPlayer1Score() >= 2) {
            game.setStatus("player 2 wins");
        } else if (game.getPlayer1Score() == 4 && game.getPlayer2Score() == 4) {
            game.setStatus("deuce");
        } else if (game.getStatus().equals("deuce")) {
            if (game.getPlayer1Score() - game.getPlayer2Score() == 1) {
                game.setStatus("advantage player 1");
            } else if (game.getPlayer2Score() - game.getPlayer1Score() == 1) {
                game.setStatus("advantage player 2");
            }
        } else {
            game.setStatus("in progress");
        }
    }
}
