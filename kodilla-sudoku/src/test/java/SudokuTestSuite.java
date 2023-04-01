import com.kodilla.sudoku.SudokuBoard;
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
}
