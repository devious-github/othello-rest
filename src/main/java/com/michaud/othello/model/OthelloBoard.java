package com.michaud.othello.model;

import lombok.Data;
import lombok.NonNull;

@Data
public class OthelloBoard {

    private static final int BOARD_SIZE=8;

    private String id;
    private Piece[][] pieces;

    public OthelloBoard() {
        pieces = new Piece[BOARD_SIZE][BOARD_SIZE];
        for (int x=0; x<BOARD_SIZE; x++) {
            pieces[x] = new Piece[BOARD_SIZE];
            for (int y=0; y<BOARD_SIZE; y++) {
                pieces[x][y] = Piece.EMPTY;
            }
        }
    }

    public void move(@NonNull Piece piece, int x, int y) {
    }

}
