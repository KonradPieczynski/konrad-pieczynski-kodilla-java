package com.kodilla.sudoku;

import static com.kodilla.sudoku.SudokuRunner.EMPTY;

public class SudokuElement {
    private int value = EMPTY;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
