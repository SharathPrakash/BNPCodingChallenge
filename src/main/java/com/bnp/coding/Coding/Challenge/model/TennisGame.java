package com.bnp.coding.Coding.Challenge.model;

public class TennisGame {

    private int player1Score;
    private int player2Score;
    private String status;

    public TennisGame() {
        this.player1Score = 0;
        this.player2Score = 0;
        this.status = "in progress";
    }

    public int getPlayer1Score() {
        return player1Score;
    }

    public void setPlayer1Score(int player1Score) {
        this.player1Score = player1Score;
    }

    public int getPlayer2Score() {
        return player2Score;
    }

    public void setPlayer2Score(int player2Score) {
        this.player2Score = player2Score;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
