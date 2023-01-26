package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String myString, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(myString);
        System.out.println("Result of beautify equals: " + result);
    }
}
