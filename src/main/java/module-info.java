module com.example.turkischerikscha {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.turkischerikscha to javafx.fxml;
    exports com.example.turkischerikscha;
}