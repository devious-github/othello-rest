package com.michaud.othello;

import com.michaud.othello.model.OthelloBoard;

import java.util.List;

public interface OthelloBoardDAO {

    OthelloBoard createOthelloBoard();
    OthelloBoard getOthelloBoardById(String id);
    List<OthelloBoard> getOthelloBoards();

}
