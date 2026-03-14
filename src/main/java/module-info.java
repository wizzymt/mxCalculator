module com.mservices {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens com.mservices to javafx.fxml;
    exports com.mservices;
}