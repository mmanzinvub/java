module com.example.lv10 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lv10 to javafx.fxml;
    exports com.example.lv10;
}