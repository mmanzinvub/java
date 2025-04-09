public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Java Programiranje", "John Doe");
        Book book2 = new Book("Uvod u Algoritme", "Thomas H. Cormen");
        Book book3 = new Book("Čista arhitektura", "Robert C. Martin");
        Book book4 = new Book("Osnove baze podataka", "Elmasri & Navathe");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        System.out.println("\n--- Dostupne knjige nakon dodavanja ---");
        library.displayAvailableBooks();

        System.out.println("\n--- Posuđivanje knjige 'Java Programiranje' ---");
        library.borrowBook(book1, "Andrej Plenković", "02.04.2025");

        System.out.println("\n--- Dostupne knjige nakon posudbe ---");
        library.displayAvailableBooks();

        System.out.println("\n--- Posuđene knjige ---");
        library.displayBorrowedBooks();

        System.out.println("\n--- Vraćanje knjige 'Java Programiranje' ---");
        library.returnBook(book1, "Marta Šimić Mrzlečki");

        System.out.println("\n--- Dostupne knjige nakon vraćanja ---");
        library.displayAvailableBooks();

        System.out.println("\n--- Posuđene knjige nakon vraćanja ---");
        library.displayBorrowedBooks();

        System.out.println("\n--- Posuđivanje knjige 'Čista arhitektura' ---");
        library.borrowBook(book3, "Katarina Marincl", "03.04.2025");


        System.out.println("\n--- Dostupne knjige nakon posudbe dodatne knjige ---");
        library.displayAvailableBooks();

        System.out.println("\n--- Posuđene knjige nakon posudbe dodatne knjige ---");
        library.displayBorrowedBooks();
    }
}