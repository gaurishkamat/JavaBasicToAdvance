package org.example;

class Book {
    static  int totalBooks;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static{
        totalBooks = 0;
    }

    {
        totalBooks++;
    }

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public Book( String isbn) {
        this.title = "Unknown";
        this.author = "Unknown";
        this.isbn = isbn;
    }

    static int getTotalBooks(){
        return totalBooks;
    }

    public void borrowBook(){
        if(this.isBorrowed){
            System.out.println("Book is already borrowed");
        }else{

            this.isBorrowed = true;
            System.out.println("You have borrowed a book!! Enjoy " + this.title);
        }
    }

    public void returnBook(){
        if(this.isBorrowed){
            this.isBorrowed = false;
            System.out.println("Thank you for returning the book! Please leave a review");
        }else{
            System.out.println("This book is already in the library");
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "J.K.Rowling", "121952");
        book1.borrowBook();
        book1.returnBook();

        Book book2 = new Book("Two States", "Chetan Bhagat", "129968");
        book1.borrowBook();
        book1.returnBook();

        int count = Book.getTotalBooks();
        System.out.println("Total number of books: " + count );
    }

}
