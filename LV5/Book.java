public class Book {
    String title;
    String author;

    public Book (String title, String author) {
        this.title = title;
        this.author = author;
    }

    //setteri
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    //getteri
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    //generated
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
