package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User steven = new Millenials("steven");
        User john = new YGeneration("john");
        User max = new ZGeneration("max");
        //When
        //Then
        assertEquals("Facebook",steven.sharePost());
        assertEquals("Twitter",john.sharePost());
        assertEquals("Snapchat",max.sharePost());
    }
    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User steven = new Millenials("steven");
        //When
        steven.setSocialPublisher(new SnapchatPublisher());
        //Then
        assertEquals("Snapchat",steven.sharePost());
    }
}
