package com.michaud.othello.persistence;

import com.michaud.othello.OthelloBoardDAO;
import com.michaud.othello.model.OthelloBoard;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class InMemoryOthelloBoardDAO implements OthelloBoardDAO {

    private static final Map<String, OthelloBoard> BOARD_CACHE = new HashMap<>();

    @Override
    public OthelloBoard createOthelloBoard() {
        OthelloBoard othelloBoard = new OthelloBoard();
        othelloBoard.setId(UUID.randomUUID().toString());
        BOARD_CACHE.put(othelloBoard.getId(), othelloBoard);
        return othelloBoard;
    }

    @Override
    public OthelloBoard getOthelloBoardById(String id) {
        return BOARD_CACHE.get(id);
    }

    @Override
    public List<OthelloBoard> getOthelloBoards() {
        return new ArrayList<>(BOARD_CACHE.values());
    }
}
