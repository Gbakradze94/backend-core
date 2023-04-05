module com.example.backendcoretraining {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.backendcoretraining to javafx.fxml;
    exports com.example.backendcoretraining;
}