package generaltasksforOOP;

import java.util.Arrays;
import java.util.Scanner;

public class Library {
    private Book[] books;

    //public Library(objectclassconstructors.Book[] book) {
    //}

    public Library(Book[] book) {
        this.books = book;
    }

    public void addBook(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Book Title: ");
        String title = input.nextLine();
        System.out.println("Enter Book Author: ");
        String author = input.nextLine();
        System.out.println("Enter Book Year: ");
        int year = input.nextInt();

       for (int i = 0; i < books.length; i++){
           if (books[i] == null){
              books[i] = new Book(title,author, year,true);
              break;
           }

       }
        System.out.println("Book added successfully");
    }

    public void showAvailableBooks() {
        boolean hasBook = false;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].isAvailable() == true) {
                if(!hasBook){
                    hasBook = true;
                }
                System.out.println(books[i]);

            }
        }
        if (hasBook == false) {
            System.out.println("No books available");
        }
    }

    @Override
    public String toString() {
        return "Library{" +
                "book=" + Arrays.toString(books) +
                '}';
    }

}

