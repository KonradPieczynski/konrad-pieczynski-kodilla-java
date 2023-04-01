package com.kodilla.sudoku;

import static com.kodilla.sudoku.SudokuRunner.BOARD_SIZE;
public class SudokuGame {

    boolean resolveSudoku(){
        return false;
    }

    private boolean checkRow(SudokuBoard board, int numberToCheck, int rowToCheck) {
        for (int column = 0; column < BOARD_SIZE; column++) {
            if (board.getSudokuBoard().get(column).getSudokuRow().get(rowToCheck).getValue() == numberToCheck) {
                return true;
            }
        }
        return false;
    }
    private boolean checkColumn(SudokuBoard board, int numberToCheck, int columnToCheck) {
        for (int row = 0; row < BOARD_SIZE; row++) {
            if (board.getSudokuBoard().get(columnToCheck).getSudokuRow().get(row).getValue() == numberToCheck) {
                return true;
            }
        }
        return false;
    }
    private boolean checkBox(SudokuBoard board, int number, int rowToCheck, int columnToCheck) {
        int boxRow = rowToCheck - rowToCheck % 3;
        int boxColumn = columnToCheck - columnToCheck % 3;

        for (int row = boxRow; row < boxRow + 3; row++) {
            for (int column = boxColumn; column < boxColumn + 3; column++) {
                if (board.getSudokuBoard().get(column).getSudokuRow().get(row).getValue() == number) {
                    return true;
                }
            }
        }
        return false;
    }
    private boolean isValid(SudokuBoard board, int number, int row, int column) {
        return !checkRow(board, number, row) &&
                !checkColumn(board, number, column) &&
                !checkBox(board, number, row, column);
    }
    public boolean solveBoard(SudokuBoard board) {
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int column = 0; column < BOARD_SIZE; column++) {
                if (board.getSudokuBoard().get(column).getSudokuRow().get(row).getValue() == -1) {
                    for (int numberToTry = 1; numberToTry <= BOARD_SIZE; numberToTry++) {
                        if (isValid(board, numberToTry, row, column)) {
                            board.getSudokuBoard().get(column).getSudokuRow().get(row).setValue(numberToTry);
                            if (solveBoard(board)) {
                                return true;
                            }
                            else {
                                board.getSudokuBoard().get(column).getSudokuRow().get(row).setValue(-1);
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
}
