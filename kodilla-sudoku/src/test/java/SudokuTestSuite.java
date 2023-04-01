import com.kodilla.sudoku.SudokuBoard;
import com.kodilla.sudoku.SudokuGame;
import org.junit.jupiter.api.Test;

import static com.kodilla.sudoku.SudokuRunner.BOARD_SIZE;

public class SudokuTestSuite {
    @Test
    void testDisplay(){
        //Given
        SudokuBoard sudokuBoard = new SudokuBoard();
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                sudokuBoard.getSudokuBoard().get(i).getSudokuRow().get(j).setValue(i);
            }
        }
        //When
        //Then
        System.out.println(sudokuBoard);
    }
    @Test
    void testSolveBoard(){
        //Given
        SudokuGame sudokuGame = new SudokuGame();
        SudokuBoard sudokuBoard = new SudokuBoard();
        sudokuBoard.getSudokuBoard().get(0).getSudokuRow().get(0).setValue(1);
        sudokuBoard.getSudokuBoard().get(1).getSudokuRow().get(0).setValue(4);
        sudokuBoard.getSudokuBoard().get(2).getSudokuRow().get(0).setValue(9);
        sudokuBoard.getSudokuBoard().get(6).getSudokuRow().get(0).setValue(5);
        sudokuBoard.getSudokuBoard().get(7).getSudokuRow().get(0).setValue(7);
        sudokuBoard.getSudokuBoard().get(8).getSudokuRow().get(0).setValue(2);

        sudokuBoard.getSudokuBoard().get(0).getSudokuRow().get(4).setValue(8);
        sudokuBoard.getSudokuBoard().get(1).getSudokuRow().get(4).setValue(9);
        sudokuBoard.getSudokuBoard().get(2).getSudokuRow().get(4).setValue(3);
        sudokuBoard.getSudokuBoard().get(6).getSudokuRow().get(4).setValue(6);
        sudokuBoard.getSudokuBoard().get(7).getSudokuRow().get(4).setValue(5);
        sudokuBoard.getSudokuBoard().get(8).getSudokuRow().get(4).setValue(7);

        sudokuBoard.getSudokuBoard().get(0).getSudokuRow().get(8).setValue(4);
        sudokuBoard.getSudokuBoard().get(1).getSudokuRow().get(8).setValue(6);
        sudokuBoard.getSudokuBoard().get(2).getSudokuRow().get(8).setValue(7);
        sudokuBoard.getSudokuBoard().get(6).getSudokuRow().get(8).setValue(9);
        sudokuBoard.getSudokuBoard().get(7).getSudokuRow().get(8).setValue(8);
        sudokuBoard.getSudokuBoard().get(8).getSudokuRow().get(8).setValue(3);

        //When
        //Then
        System.out.println("Given board:");
        System.out.println(sudokuBoard);
        sudokuGame.solveBoard(sudokuBoard);
        System.out.println("Solved board:");
        System.out.println(sudokuBoard);
    }
}
