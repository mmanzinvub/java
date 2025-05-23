module org.example.demoapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.sql;
    requires mysql.connector.j;

    opens org.example.demoapp to javafx.fxml;
    exports org.example.demoapp;
}