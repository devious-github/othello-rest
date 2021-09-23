package com.michaud.othello.model;

import lombok.Getter;
import lombok.NonNull;


public enum Piece {
    WHITE("W"),
    BLACK("B"),
    EMPTY(" ");

    @Getter
    private final String token;
    private Piece(@NonNull String token) {
        this.token = token;
    }
}
