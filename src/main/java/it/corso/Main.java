package it.corso;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        LibraryService libreria = new LibraryService();
        libreria.addBook( new Book(1, "titolo1", "Nicolò") );
        libreria.addBook( new Book(2, "titolo2", "Giacomo") );
        libreria.addBook( new Book(3, "titolo3", "Edoardo") );
        libreria.addBook( new Book(4, "titolo4", "Giovanna") );

    }
}