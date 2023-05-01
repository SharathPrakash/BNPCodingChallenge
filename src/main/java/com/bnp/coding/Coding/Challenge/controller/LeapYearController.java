package com.bnp.coding.Coding.Challenge.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeapYearController {

    @GetMapping("/leapYear/{year}")
    public String isLeapYear(@PathVariable int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            return "Year " + year + " is a leap year";
        } else {
            return "Year " + year + " is not a leap year";
        }
    }
}