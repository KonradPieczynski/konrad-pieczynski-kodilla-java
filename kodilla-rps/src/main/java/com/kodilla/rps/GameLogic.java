package com.kodilla.rps;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GameLogic {
    int wins;
    int losses;
    int rounds;
    int currentRound;
    boolean end;
    String playerName = "";
    Scanner scanner = new Scanner(System.in);
    void NewGame(){
        wins = 0;
        losses = 0;
        currentRound = 0;
        rounds = 0;
        playerName = "";
        System.out.println("Starting new game.");
        while(playerName.equals(""))
        {
            System.out.println("Please enter your name: ");
            playerName = scanner.nextLine();
        }
        while(rounds == 0)
        {
            System.out.println("Please enter number of rounds in order to win: ");
            try {
                rounds = scanner.nextInt();
            }
            catch(InputMismatchException e) {
            System.out.println("Please enter a number!");
            }
            scanner.nextLine();
        }
    }
    void NextMove() {
        System.out.println();
        nextRound();
        System.out.print(playerName + ",enter your move (1)rock (2)paper (3)scissors (n)new game (x)exit: ");
        String input = scanner.nextLine();

        switch (input) {
            case "x" -> {
                System.out.println("Are you sure to exit? (y/n): ");
                if ("y".equals(scanner.nextLine())) end = true;
            }
            case "n" -> {
                System.out.println("Are you sure to start new game? (y/n): ");
                if ("y".equals(scanner.nextLine())) NewGame();
            }
            case "1", "2", "3" -> {
                String aiMove = getAiMove();
                if (MoveList.values()[Integer.parseInt(input)-1].getValue().equals(aiMove)) {
                    System.out.println("Tie!");
                } else if (checkPlayerWin(MoveList.values()[Integer.parseInt(input)-1].getValue(), aiMove)) {
                    System.out.println("You win round!");
                    wins++;
                } else {
                    System.out.println("You lose round!");
                    losses++;
                }
            }
            default -> System.out.println("Invalid input!");
        }
    }
    String getAiMove() {
        Random random = new Random();
        var nextRandom = random.nextInt(3);
        System.out.println("Ai move: " + MoveList.values()[nextRandom].getValue());
        return MoveList.values()[nextRandom].getValue();
    }
    void nextRound(){
    currentRound++;
        System.out.println("Current round: " + currentRound);
        System.out.println("Your wins: " + wins +"/"+rounds);
        System.out.println("Your loses: " + losses+"/"+rounds);
    }
    void checkFinalWin(){
        if (wins >= rounds) {
            System.out.println("You won game vs Ai! Game took " + currentRound +" rounds");
            NewGame();
        }
        if (losses >= rounds) {
            System.out.println("You lose game vs Ai! Game took " + currentRound +" rounds");
            NewGame();
        }
    }

    boolean checkPlayerWin(String playerMove, String aiMove) {
        return playerMove.equals(MoveList.ROCK.getValue()) && aiMove.equals(MoveList.SCISSORS.getValue())
                || (playerMove.equals(MoveList.PAPER.getValue()) && aiMove.equals(MoveList.ROCK.getValue()))
                || (playerMove.equals(MoveList.SCISSORS.getValue()) && aiMove.equals(MoveList.PAPER.getValue()));
    }
    public boolean isEnd() {
        return end;
    }

}
