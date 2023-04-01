package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.sudoku.SudokuRunner.BOARD_SIZE;

public class SudokuBoard {
    List<SudokuRow> sudokuBoard = new ArrayList<>(BOARD_SIZE);

    public SudokuBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            sudokuBoard.add(new SudokuRow());
        }
    }

    public List<SudokuRow> getSudokuBoard() {
        return sudokuBoard;
    }

    @Override
    public String toString() {
        StringBuilder boardToDisplay = new StringBuilder();
        for (int row = 0; row < BOARD_SIZE; row++) {
            if (row % 3 == 0 && row != 0) {
                for (int i = 0; i < BOARD_SIZE; i++) {
                    boardToDisplay.append("-");
                    if (i == BOARD_SIZE-1) boardToDisplay.append("\n");
                }
            }
            for (int column = 0; column < BOARD_SIZE; column++) {
                if (column % 3 == 0 && column != 0) {
                    boardToDisplay.append("|");
                }
                boardToDisplay.append(sudokuBoard.get(column).getSudokuRow().get(row).getValue());
            }
            boardToDisplay.append("\n");
        }
        return boardToDisplay.toString();
    }
}
