package com.example.lv10;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import java.time.Year;

public class LibraryController {

    @FXML private TableView<Book> availableBooksTable;
    @FXML private TableColumn<Book, String> titleColAvailable;
    @FXML private TableColumn<Book, String> authorColAvailable;
    @FXML private TableColumn<Book, Integer> yearColAvailable;
    private ObservableList<Book> availableBooks;

    @FXML private TableView<Book> borrowedBooksTable;
    @FXML private TableColumn<Book, String> titleColBorrowed;
    @FXML private TableColumn<Book, String> authorColBorrowed;
    @FXML private TableColumn<Book, Integer> yearColBorrowed;

    private ObservableList<Book> borrowedBooks;
    @FXML private TextField titleInput;
    @FXML private TextField authorInput;
    @FXML
    private void addNewBook() {
        String title = titleInput.getText().trim();
        String author = authorInput.getText().trim();

        if (title.isEmpty() || author.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Upozorenje");
            alert.setHeaderText(null);
            alert.setContentText("Molimo unesite i naslov i autora knjige.");
            alert.showAndWait();
            return;
        }

        int currentYear = Year.now().getValue();
        Book newBook = new Book(title, author, currentYear);
        availableBooks.add(newBook);


        titleInput.clear();
        authorInput.clear();
    }
    public void initialize() {

        titleColAvailable.setCellValueFactory(new PropertyValueFactory<>("title"));
        authorColAvailable.setCellValueFactory(new PropertyValueFactory<>("author"));
        yearColAvailable.setCellValueFactory(new PropertyValueFactory<>("year"));
        titleColBorrowed.setCellValueFactory(new PropertyValueFactory<>("title"));
        authorColBorrowed.setCellValueFactory(new PropertyValueFactory<>("author"));
        yearColBorrowed.setCellValueFactory(new PropertyValueFactory<>("year"));


        availableBooks = FXCollections.observableArrayList(
                new Book("Na Drini ćuprija", "Ivo Andrić", 1945),
                new Book("Zločin i kazna", "F. M. Dostojevski", 1866)
        );

        borrowedBooks = FXCollections.observableArrayList(
                new Book("1984", "George Orwell", 1949),
                new Book("Mali princ", "Antoine de Saint-Exupéry", 1943)
        );

        availableBooksTable.setItems(availableBooks);
        borrowedBooksTable.setItems(borrowedBooks);
    }

    @FXML
    private void borrowSelectedBook() {
        Book selected = availableBooksTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            availableBooks.remove(selected);
            borrowedBooks.add(selected);
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Upozorenje");
            alert.setHeaderText(null);
            alert.setContentText("Niste odabrali nijednu knjigu za posudbu.");
            alert.showAndWait();
        }
    }
}