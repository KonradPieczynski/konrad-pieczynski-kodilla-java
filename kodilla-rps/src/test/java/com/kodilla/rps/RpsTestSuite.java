package com.kodilla.rps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RpsTestSuite {
    @Test
    void testWinConditionRock() {
        //Given
        GameLogic gameLogic = new GameLogic();
        gameLogic.toggleRules();
        String playerMove = MoveList.ROCK.getValue();
        String aiMove = MoveList.SCISSORS.getValue();
        String aiMove2 = MoveList.LIZARD.getValue();
        //When
        boolean returnedWin = gameLogic.checkPlayerWin(playerMove, aiMove);
        boolean returnedWin2 = gameLogic.checkPlayerWin(playerMove, aiMove2);
        //Then
        assertTrue(returnedWin);
        assertTrue(returnedWin2);
    }
    @Test
    void testWinConditionPaper() {
        //Given
        GameLogic gameLogic = new GameLogic();
        gameLogic.toggleRules();
        String playerMove = MoveList.PAPER.getValue();
        String aiMove = MoveList.ROCK.getValue();
        String aiMove2 = MoveList.SPOCK.getValue();
        //When
        boolean returnedWin = gameLogic.checkPlayerWin(playerMove, aiMove);
        boolean returnedWin2 = gameLogic.checkPlayerWin(playerMove, aiMove2);
        //Then
        assertTrue(returnedWin);
        assertTrue(returnedWin2);
    }
    @Test
    void testWinConditionScissors() {
        //Given
        GameLogic gameLogic = new GameLogic();
        gameLogic.toggleRules();
        String playerMove = MoveList.SCISSORS.getValue();
        String aiMove = MoveList.PAPER.getValue();
        String aiMove2 = MoveList.LIZARD.getValue();
        //When
        boolean returnedWin = gameLogic.checkPlayerWin(playerMove, aiMove);
        boolean returnedWin2 = gameLogic.checkPlayerWin(playerMove, aiMove2);
        //Then
        assertTrue(returnedWin);
        assertTrue(returnedWin2);
    }
    @Test
    void testWinConditionLizard() {
        //Given
        GameLogic gameLogic = new GameLogic();
        gameLogic.toggleRules();
        String playerMove = MoveList.LIZARD.getValue();
        String aiMove = MoveList.PAPER.getValue();
        String aiMove2 = MoveList.SPOCK.getValue();
        //When
        boolean returnedWin = gameLogic.checkPlayerWin(playerMove, aiMove);
        boolean returnedWin2 = gameLogic.checkPlayerWin(playerMove, aiMove2);
        //Then
        assertTrue(returnedWin);
        assertTrue(returnedWin2);
    }
    @Test
    void testWinConditionSpock() {
        //Given
        GameLogic gameLogic = new GameLogic();
        gameLogic.toggleRules();
        String playerMove = MoveList.SPOCK.getValue();
        String aiMove = MoveList.SCISSORS.getValue();
        String aiMove2 = MoveList.ROCK.getValue();
        //When
        boolean returnedWin = gameLogic.checkPlayerWin(playerMove, aiMove);
        boolean returnedWin2 = gameLogic.checkPlayerWin(playerMove, aiMove2);
        //Then
        assertTrue(returnedWin);
        assertTrue(returnedWin2);
    }
    @Test
    void testLoseConditionRock() {
        //Given
        GameLogic gameLogic = new GameLogic();
        gameLogic.toggleRules();
        String playerMove = MoveList.ROCK.getValue();
        String aiMove = MoveList.PAPER.getValue();
        String aiMove2 = MoveList.SPOCK.getValue();
        //When
        boolean returnedWin = gameLogic.checkPlayerWin(playerMove, aiMove);
        boolean returnedWin2 = gameLogic.checkPlayerWin(playerMove, aiMove2);
        //Then
        assertFalse(returnedWin);
        assertFalse(returnedWin2);
    }
    @Test
    void testLoseConditionPaper() {
        //Given
        GameLogic gameLogic = new GameLogic();
        gameLogic.toggleRules();
        String playerMove = MoveList.PAPER.getValue();
        String aiMove = MoveList.SCISSORS.getValue();
        String aiMove2 = MoveList.LIZARD.getValue();
        //When
        boolean returnedWin = gameLogic.checkPlayerWin(playerMove, aiMove);
        boolean returnedWin2 = gameLogic.checkPlayerWin(playerMove, aiMove2);
        //Then
        assertFalse(returnedWin);
        assertFalse(returnedWin2);
    }
    @Test
    void testLoseConditionScissors() {
        //Given
        GameLogic gameLogic = new GameLogic();
        gameLogic.toggleRules();
        String playerMove = MoveList.SCISSORS.getValue();
        String aiMove = MoveList.ROCK.getValue();
        String aiMove2 = MoveList.SPOCK.getValue();
        //When
        boolean returnedWin = gameLogic.checkPlayerWin(playerMove, aiMove);
        boolean returnedWin2 = gameLogic.checkPlayerWin(playerMove, aiMove2);
        //Then
        assertFalse(returnedWin);
        assertFalse(returnedWin2);
    }
    @Test
    void testLoseConditionLizard() {
        //Given
        GameLogic gameLogic = new GameLogic();
        gameLogic.toggleRules();
        String playerMove = MoveList.LIZARD.getValue();
        String aiMove = MoveList.ROCK.getValue();
        String aiMove2 = MoveList.SCISSORS.getValue();
        //When
        boolean returnedWin = gameLogic.checkPlayerWin(playerMove, aiMove);
        boolean returnedWin2 = gameLogic.checkPlayerWin(playerMove, aiMove2);
        //Then
        assertFalse(returnedWin);
        assertFalse(returnedWin2);
    }
    @Test
    void testLoseConditionSpock() {
        //Given
        GameLogic gameLogic = new GameLogic();
        gameLogic.toggleRules();
        String playerMove = MoveList.SPOCK.getValue();
        String aiMove = MoveList.LIZARD.getValue();
        String aiMove2 = MoveList.PAPER.getValue();
        //When
        boolean returnedWin = gameLogic.checkPlayerWin(playerMove, aiMove);
        boolean returnedWin2 = gameLogic.checkPlayerWin(playerMove, aiMove2);
        //Then
        assertFalse(returnedWin);
        assertFalse(returnedWin2);
    }
}
