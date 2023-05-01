package com.bnp.coding.Coding.Challenge.controller;

import com.bnp.coding.Coding.Challenge.model.Game;
import org.springframework.web.bind.annotation.*;

@RestController
public class BowlingController {

    private Game game = new Game();

    @PostMapping("/roll")
    public void roll(@RequestBody int pins) {
        game.roll(pins);
    }

    @GetMapping("/score")
    public int score() {
        return game.score();
    }
}
