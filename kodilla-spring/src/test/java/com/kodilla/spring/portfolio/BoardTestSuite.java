package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class BoardTestSuite {
    @Autowired
    private Board board;
    @Test
    void testTaskAdd(){
        //Given
        String task1 = "task1";
        String task2 = "task2";
        String task3 = "task3";
        //When
        board.getDoneList().getTasks().add(task1);
        board.getToDoList().getTasks().add(task2);
        board.getInProgressList().getTasks().add(task3);
        //Then
        assertTrue(board.getDoneList().getTasks().contains(task1));
        assertFalse(board.getDoneList().getTasks().contains(task2));
        assertFalse(board.getDoneList().getTasks().contains(task3));

        assertTrue(board.getToDoList().getTasks().contains(task2));
        assertFalse(board.getToDoList().getTasks().contains(task1));
        assertFalse(board.getToDoList().getTasks().contains(task3));

        assertTrue(board.getInProgressList().getTasks().contains(task3));
        assertFalse(board.getInProgressList().getTasks().contains(task1));
        assertFalse(board.getInProgressList().getTasks().contains(task2));
    }
}
