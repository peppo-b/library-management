package it.corso;

public class Main {
    public static void main(String[] args) {

        LibraryService libreria = new LibraryService();
        libreria.addBook( new Book((long)1, "titolo1", "Nicolò") );
        libreria.addBook( new Book((long)2, "titolo2", "Giacomo") );
        libreria.addBook( new Book((long)3, "titolo3", "Edoardo") );
        libreria.addBook( new Book((long)4, "titolo4", "Giovanna") );

        libreria.listBooks();

        Book b = libreria.findBook(1);
        System.out.println(b.toString());

    }
}