package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoggerTestSuite {
    private static Logger logger;
    @BeforeAll
    public static void openLogger() {
        logger = Logger.INSTANCE;
    }
    @Test
    public void getLastLog(){
        //Given
        String logToSave = "log to save";
        //When
        logger.log(logToSave);
        String retrievedLog = logger.getLastLog();
        //Then
        assertEquals(logToSave,retrievedLog);
    }
}
