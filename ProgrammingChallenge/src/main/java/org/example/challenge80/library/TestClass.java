package org.example.challenge80.library;

public class TestClass {
    public static void main(String[] args) {
        Book book = new Book();
        DVD dvd = new DVD(10);
        Magazine magazine = new Magazine();
        book.setIsbn("a-10-2201");
        System.out.println(book.getIsbn());
        book.returnItem();
        book.checkout();
    }
}
