package org.example.demoapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
//implementirajte repositorij
public class BookRepositoryImpl implements BookRepository {
    private Connection connection;
    public BookRepositoryImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Book> findAll() {
        List<Book> books = new ArrayList<>();
        String query = "SELECT * FROM `knjiga`"; /// napišite sql upit za dohvaćanje svih knjiga
        try (PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String author = resultSet.getString("Author");
                String title = resultSet.getString("Title");
                books.add(new Book(id, title, author));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return books;
    }

    @Override
    public Book findById(int id) {
        String query = "SELECT * FROM `knjiga` WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String author = resultSet.getString("Author");
                String title = resultSet.getString("Title");
                return new Book(id, title, author);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void save(Book book) {
        String query = "INSERT INTO `knjiga` (Author, Title) VALUES (?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setString(1, book.getAuthor());
            preparedStatement.setString(2, book.getTitle());
            preparedStatement.executeUpdate();


            ResultSet keys = preparedStatement.getGeneratedKeys();
            if (keys.next()) {
                book.setId(keys.getInt(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteById(int id) {
        String query = "DELETE FROM `knjiga` WHERE id = ?"; /// napisite prepared sql za brisanje knjige po idu
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            System.out.println("Knjiga s ID=" + id + " obrisana.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}