package org.example.demoapp;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.Connection;
import java.sql.DataTruncation;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/// Popravite u ovoj klasi nedostatke za fxml
public class LibraryController {
    @FXML private BookRepository bookRepository;
    @FXML private TableView<Book> availableBooksTable;
    @FXML private TableColumn<Book, String> titleColAvailable;
    @FXML private TableColumn<Book, String> authorColAvailable;
    @FXML private TableColumn<Book, Integer> idColAvailable;
    @FXML private ObservableList<Book> availableBooks;

    @FXML private TableView<Book> borrowedBooksTable;
    @FXML private TableColumn<Book, Integer> idColBorrowed;
    @FXML private TableColumn<Book, String> titleColBorrowed;
    @FXML private TableColumn<Book, String> authorColBorrowed;


    @FXML private ObservableList<Book> borrowedBooks;
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


        Book newBook = new Book(title, author);

        bookRepository.save(newBook);

        availableBooks.add(newBook);

        titleInput.clear();
        authorInput.clear();

        titleInput.clear();
        authorInput.clear();
    }
    @FXML String query = null;
    @FXML Connection connection = null;
    @FXML PreparedStatement preparedStatement = null;
    @FXML ResultSet resultSet = null;
    @FXML
    private void refreshData() {
        availableBooks.clear();
        try {
            List<Book> books = bookRepository.findAll();
            availableBooks.addAll(books);
            availableBooksTable.setItems(availableBooks);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void loadData() {

        titleColAvailable.setCellValueFactory(new PropertyValueFactory<>("title"));
        authorColAvailable.setCellValueFactory(new PropertyValueFactory<>("author"));
        idColAvailable.setCellValueFactory(new PropertyValueFactory<>("id"));
        titleColBorrowed.setCellValueFactory(new PropertyValueFactory<>("title"));
        authorColBorrowed.setCellValueFactory(new PropertyValueFactory<>("author"));

        idColBorrowed.setCellValueFactory(new PropertyValueFactory<>("id"));
        availableBooks = FXCollections.observableArrayList();
        borrowedBooks = FXCollections.observableArrayList();


        borrowedBooksTable.setItems(borrowedBooks);

        /// napravite konekciju na bazu
        DatabaseConnection connectNow = new DatabaseConnection();
        connection = connectNow.getConnection();

        /// kreirajte book repozitorij
        bookRepository = new BookRepositoryImpl(connection);

        refreshData();
    }
    @FXML
    public void initialize() {
        loadData();
    }
    @FXML
    private void deleteSelectedBook() {
        Book selected = availableBooksTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            int id = selected.getId();
            /// obrisite knjigu u bazi
            bookRepository.deleteById(id);
            ///  obrisite knjigu s observable liste
            availableBooks.remove(selected);

        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Upozorenje");
            alert.setHeaderText(null);
            alert.setContentText("Niste odabrali nijednu knjigu za brisanje.");
            alert.showAndWait();
        }
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
    @FXML
    private void returnSelectedBook() {
        Book selected = borrowedBooksTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            borrowedBooks.remove(selected);
            availableBooks.add(selected);
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Upozorenje");
            alert.setHeaderText(null);
            alert.setContentText("Niste odabrali nijednu knjigu za vraćanje.");
            alert.showAndWait();
        }
    }
}






































































//junije palmotic