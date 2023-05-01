package com.bnp.coding.Coding.Challenge.model;

import com.bnp.coding.Coding.Challenge.util.Player;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter
@Setter
public class TicTacToeGame {

    private int id;
    private Player[][] board;
    private Player winner;
    private boolean isDraw;
    private List<Move> moves;
    private Player nextPlayer;

}
