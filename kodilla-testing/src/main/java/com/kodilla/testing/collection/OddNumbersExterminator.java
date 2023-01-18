package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers){
        ArrayList<Integer> myList = new ArrayList<Integer>();
             for (Integer integer : numbers) if (integer % 2 == 0) myList.add(integer);
        return myList;
    }
}
