package org.example.challenge80.library;

public class LibraryItem {
    private String itemID;
    private String title;
    private String author;

    public void checkout(){
        System.out.println("Checked out!!");
    }

    public void returnItem() {
        System.out.println("Return item!!");
    }
}
