module com.example.contabanco {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.contabanco to javafx.fxml;
    exports com.example.contabanco;
}