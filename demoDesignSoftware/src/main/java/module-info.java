module com.example.demodesignsoftware {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demodesignsoftware to javafx.fxml;
    exports com.example.demodesignsoftware;
}