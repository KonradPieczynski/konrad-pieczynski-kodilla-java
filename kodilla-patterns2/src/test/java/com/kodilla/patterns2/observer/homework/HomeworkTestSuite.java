package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HomeworkTestSuite {
    @Test
    public void testUpdate() {
        // Given
        Homework javaOneHomework = new JavaOneHomework();
        Homework javaTwoHomework = new JavaTwoHomework();
        Mentor johnSmith = new Mentor("John Smith");
        Mentor ivoneEscobar= new Mentor("Ivone Escobar");
        Mentor jessiePinkman = new Mentor("Jessie Pinkman");
        javaOneHomework.registerObserver(johnSmith);
        javaTwoHomework.registerObserver(ivoneEscobar);
        javaOneHomework.registerObserver(jessiePinkman);
        javaTwoHomework.registerObserver(jessiePinkman);
        // When
        javaOneHomework.addPost("loop 1");
        javaOneHomework.addPost("loop 2");
        javaTwoHomework.addPost("iteration 1");
        javaOneHomework.addPost("loop 3");
        javaTwoHomework.addPost("iteration 2");
        // Then
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(2, ivoneEscobar.getUpdateCount());
        assertEquals(5, jessiePinkman.getUpdateCount());
    }
}
