package com.library.library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testAddBook() {
        App.books.clear(); // reset

        App.addBook(1, "Java");

        assertEquals(1, App.books.size());
        assertEquals("Java", App.books.get(0).title);
    }

    @Test
    void testIssueBook() {
        App.books.clear();

        App.addBook(1, "Java");
        App.issueBook(1);

        assertTrue(App.books.get(0).issued);
    }

    @Test
    void testReturnBook() {
        App.books.clear();

        App.addBook(1, "Java");
        App.issueBook(1);
        App.returnBook(1);

        assertFalse(App.books.get(0).issued);
    }

    @Test
    void testBookNotFound() {
        App.books.clear();

        App.issueBook(99); // no crash = pass
    }
}
