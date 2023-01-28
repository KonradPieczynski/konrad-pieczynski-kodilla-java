package com.kodilla.rps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RpsTestSuite {
    @Test
    void testWinConditionRock() {
        //Given
        GameLogic gameLogic = new GameLogic();
        String playerMove = "rock";
        String aiMove = "scissors";
        //When
        boolean returnedWin = gameLogic.checkPlayerWin(playerMove, aiMove);
        //Then
        assertTrue(returnedWin);
    }
    @Test
    void testWinConditionPaper() {
        //Given
        GameLogic gameLogic = new GameLogic();
        String playerMove = "paper";
        String aiMove = "rock";
        //When
        boolean returnedWin = gameLogic.checkPlayerWin(playerMove, aiMove);
        //Then
        assertTrue(returnedWin);
    }
    @Test
    void testWinConditionScissors() {
        //Given
        GameLogic gameLogic = new GameLogic();
        String playerMove = "scissors";
        String aiMove = "paper";
        //When
        boolean returnedWin = gameLogic.checkPlayerWin(playerMove, aiMove);
        //Then
        assertTrue(returnedWin);
    }
    @Test
    void testLoseConditionRock() {
        //Given
        GameLogic gameLogic = new GameLogic();
        String playerMove = "rock";
        String aiMove = "paper";
        //When
        boolean returnedWin = gameLogic.checkPlayerWin(playerMove, aiMove);
        //Then
        assertFalse(returnedWin);
    }
    @Test
    void testLoseConditionPaper() {
        //Given
        GameLogic gameLogic = new GameLogic();
        String playerMove = "paper";
        String aiMove = "scissors";
        //When
        boolean returnedWin = gameLogic.checkPlayerWin(playerMove, aiMove);
        //Then
        assertFalse(returnedWin);
    }
    @Test
    void testLoseConditionScissors() {
        //Given
        GameLogic gameLogic = new GameLogic();
        String playerMove = "scissors";
        String aiMove = "rock";
        //When
        boolean returnedWin = gameLogic.checkPlayerWin(playerMove, aiMove);
        //Then
        assertFalse(returnedWin);
    }
}
