package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        //Given
        Book book1 = new Book("Test1","A", LocalDate.now());
        Book book2 = new Book("Test2","B", LocalDate.now());
        Book book3 = new Book("Test3","C", LocalDate.now());
        Library library = new Library("Library 1");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library clonedLibrary2 = null;
        try {
            clonedLibrary2 = library.deepCopy();
            clonedLibrary2.setName("Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //When
        library.getBooks().remove(book3);
        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(clonedLibrary2);
        assertEquals(2, library.getBooks().size());
        assertEquals(2, clonedLibrary.getBooks().size());
        assertEquals(3, clonedLibrary2.getBooks().size());
        assertEquals(library.getBooks(),clonedLibrary.getBooks());
        assertNotEquals(library.getBooks(), clonedLibrary2.getBooks());
    }
}
