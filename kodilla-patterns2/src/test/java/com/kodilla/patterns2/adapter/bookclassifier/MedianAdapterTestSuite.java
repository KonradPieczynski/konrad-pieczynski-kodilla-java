package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    void publicationYearMedianTest(){
        //Given
        Set<Book> books = new HashSet<>();
        MedianAdapter medianAdapter = new MedianAdapter();
        Book book1 = new Book("Author 1","Title 1", 2001,"Signature 1");
        Book book2 = new Book("Author 2","Title 2", 2002,"Signature 2");
        Book book3 = new Book("Author 3","Title 3", 2003,"Signature 3");
        Book book4 = new Book("Author 4","Title 4", 2004,"Signature 4");
        Book book5 = new Book("Author 5","Title 5", 2005,"Signature 5");
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        //When
        int median = medianAdapter.publicationYearMedian(books);
        //Then
        assertEquals(2003, median);
    }
}
