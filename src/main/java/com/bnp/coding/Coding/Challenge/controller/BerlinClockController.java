package com.bnp.coding.Coding.Challenge.controller;

import com.bnp.coding.Coding.Challenge.model.BerlinClock;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BerlinClockController {

    @GetMapping("/berlinClock/{time}")
    public BerlinClock berlinClock(@PathVariable String time) {
        return new BerlinClock(time);
    }
}