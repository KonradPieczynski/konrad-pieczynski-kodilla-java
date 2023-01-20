package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {
    @BeforeEach
    void init(TestInfo testInfo) {
        String displayName = testInfo.getDisplayName();
//        String methodName = testInfo.getTestMethod().orElseThrow().getName();
        System.out.println("Testing: " + displayName);
    }
    @AfterEach
    void end(TestInfo testInfo) {
        String displayName = testInfo.getDisplayName();
//        String methodName = testInfo.getTestMethod().orElseThrow().getName();
        System.out.println("Ending test: " + displayName);
    }
    @DisplayName("Empty list - odd numbers exterminator")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        Assertions.assertTrue(oddNumbersExterminator.exterminate(List.of()).isEmpty());
    }

    @DisplayName ("Normal list - odd numbers exterminator")
    @Test
    void testOddNumbersExterminatorNormalList() {
        Integer[] integers = new Integer[]{1, 10, 11, 20, 30, 40, 41};
        Integer[] testValues = new Integer[]{10, 20, 30, 40};
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        Assertions.assertEquals(Arrays.asList(testValues), oddNumbersExterminator.exterminate(Arrays.asList(integers)));
    }
}
