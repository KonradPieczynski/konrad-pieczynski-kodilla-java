package com.kodilla.sudoku;

import java.util.Scanner;

public class TerminalInput {
    Scanner scanner = new Scanner(System.in);
    public String scanInput() {
        String input = "";
        input = scanner.nextLine();
        return input;
    }
}