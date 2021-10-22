package com.company;

class Library{
    String [] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }
    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+ " has been added!");
    }
    void showAvailableBooks(){
        System.out.println("\nAvailable Books are: ");
        for (String book : books){
            if (book == null){
                continue;
            }
            System.out.println("* "+ book);
        }
    }

    void issueBook(String book){
        for (int i=0;i<this.books.length;i++){
            if (this.books[i].equals(book)){
                System.out.println("\n"+book+" book has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println(book+" book does not exist");
    }
    void returnBook(String book){
        addBook(book);
    }
}

public class Project5_Library {
    public static void main(String[] args) {
        Library centralLibrary = new Library();
        centralLibrary.addBook("Think and grow rich");
        centralLibrary.addBook("Algorithms");
        centralLibrary.addBook("C++");
        centralLibrary.showAvailableBooks();

        centralLibrary.issueBook("C+++");
        centralLibrary.showAvailableBooks();
//        centralLibrary.returnBook("C++");
//        centralLibrary.showAvailableBooks();
    }
}
