module com.mservices {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mservices to javafx.fxml, javafx.graphics;
    exports com.mservices;
}