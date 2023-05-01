package com.bnp.coding.Coding.Challenge.controller;

import com.bnp.coding.Coding.Challenge.model.Move;
import com.bnp.coding.Coding.Challenge.model.TicTacToeGame;
import com.bnp.coding.Coding.Challenge.util.Player;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/games")
public class TicTacToeGameController {
    private final List<TicTacToeGame> games = new ArrayList<>();
    private int nextId = 1;

    @PostMapping
    public ResponseEntity<TicTacToeGame> createGame() {
        TicTacToeGame game = new TicTacToeGame();
        game.setId(nextId++);
        game.setBoard(new Player[3][3]);
        game.setMoves(new ArrayList<>());
        game.setNextPlayer(Player.X);
        games.add(game);
        return ResponseEntity.ok(game);
    }

    @PostMapping("/{id}/moves")
    public ResponseEntity<TicTacToeGame> makeMove(@PathVariable int id, @RequestBody Move move) {
        TicTacToeGame game = findGameById(id);
        if (game == null) {
            return ResponseEntity.notFound().build();
        }
        if (game.getWinner() != null || game.isDraw()) {
            return ResponseEntity.badRequest().build();
        }
        if (move.getRow() < 0 || move.getRow() > 2 || move.getColumn() < 0 || move.getColumn() > 2) {
            return ResponseEntity.badRequest().build();
        }
        if (game.getBoard()[move.getRow()][move.getColumn()] != null) {
            return ResponseEntity.badRequest().build();
        }
        if (!move.getPlayer().equals(game.getNextPlayer())) {
            return ResponseEntity.badRequest().build();
        }
        game.getBoard()[move.getRow()][move.getColumn()] = move.getPlayer();
        game.getMoves().add(move);
        if (checkWin(game.getBoard(), move.getPlayer())) {
            game.setWinner(move.getPlayer());
        } else if (game.getMoves().size() == 9) {
            game.setDraw(true);
        } else {
            game.setNextPlayer(game.getNextPlayer() == Player.X ? Player.O : Player.X);
        }
        return ResponseEntity.ok(game);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TicTacToeGame> getGame(@PathVariable int id) {
        TicTacToeGame game = findGameById(id);
        if (game == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(game);
    }

    private TicTacToeGame findGameById(int id) {
        return games.stream().filter(g -> g.getId() == id).findFirst().orElse(null);
    }

    private boolean checkWin(Player[][] board, Player player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }
}
