package com.bnp.coding.Coding.Challenge.model;

import com.bnp.coding.Coding.Challenge.util.Player;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Move {
    private int row;
    private int column;
    private Player player;
}
