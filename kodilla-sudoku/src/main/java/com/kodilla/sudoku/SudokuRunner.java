package com.kodilla.sudoku;

public class SudokuRunner {
    public final static int BOARD_SIZE = 9;
    public static void main(String[] args) {

        boolean gameFinished = false;
        while (!gameFinished) {
            SudokuGame theGame = new SudokuGame();
            gameFinished = theGame.resolveSudoku();
        }
    }
}
