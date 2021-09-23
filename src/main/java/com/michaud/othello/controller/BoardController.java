package com.michaud.othello.controller;

import com.michaud.othello.model.OthelloBoard;
import com.michaud.othello.persistence.InMemoryOthelloBoardDAO;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("boards")
@Component
public class BoardController {

    @Autowired
    private InMemoryOthelloBoardDAO inMemoryOthelloBoardDAO;

    @GetMapping()
    public List<OthelloBoard> getOthelloBoards() {
        return inMemoryOthelloBoardDAO.getOthelloBoards();
    }
    @PutMapping
    public OthelloBoard createOthelloBoard() {
        return inMemoryOthelloBoardDAO.createOthelloBoard();
    }
    @GetMapping("/{id}/")
    public OthelloBoard getOthelloBoardById(@NonNull @PathVariable String id) {
        return inMemoryOthelloBoardDAO.getOthelloBoardById(id);
    }
}
