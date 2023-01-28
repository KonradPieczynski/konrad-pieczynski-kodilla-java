package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage()
    {
        //Given
        int[] numbers = {10,5,2,4,3,1,6,8,7,9};

        //When
        double average = ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(5.5,average);
    }
}
