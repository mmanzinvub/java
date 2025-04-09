import java.util.Arrays;
import java.util.List;

public class Library {
    List<Book> books;
    List<BorrowedBook> borrowedBooks;

    //getteri
    public List<Book> getBooks() {
        return books;
    }

    public List<BorrowedBook> getBorrowedBooks() {
        return borrowedBooks;
    }

    //metode Library
    public void addBook(Book book) {
        books.add(book);
    }

    public void borrowBook(Book book, String borrowerName, String borrowDate) {
        if(books.contains(book)) {
            BorrowedBook borrowedBook 
        }
    }

    public void returnBook (Book book, String borrowerName) {

    }

    public void displayAvailableBooks () {
        if (books.isEmpty()) {
            System.out.println("Nema knjiga u knjiznici");
        }
        System.out.println("Dostupne knjige: ");
        for (Book book : books) {
            System.out.println("- " + book);
        }
    }

    public void displayBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println("Nema posudenih knjiga");
        }
        System.out.println("Posudene knjige: ");
        for (BorrowedBook borrowedBook : borrowedBooks) {
            System.out.println("- " + borrowedBook);
        }
    }

    private class BorrowedBook {
        private Book book;
        private String borrowerName;
        private String borrowDate;

        public BorrowedBook (Book book, String borrowerName, String borrowDate) {
            this.book = book;
            this.borrowerName = borrowerName;
            this.borrowDate = borrowDate;
        }

        //setteri
        public void setBorrowerName(String borrowerName) {
            this.borrowerName = borrowerName;
        }

        public void setBorrowDate(String borrowDate) {
            this.borrowDate = borrowDate;
        }

        //getteri
        public Book getBook() {
            return book;
        }

        public String getBorrowerName() {
            return borrowerName;
        }

        public String getBorrowDate() {
            return borrowDate;
        }

        //generated
        @Override
        public String toString() {
            return "BorrowedBook{" +
                    "book=" + book +
                    ", borrowerName='" + borrowerName + '\'' +
                    ", borrowDate='" + borrowDate + '\'' +
                    '}';
        }
    }


}
