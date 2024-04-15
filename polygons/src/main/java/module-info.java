module com.proferoman {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.base;

    opens com.proferoman to javafx.fxml;
    exports com.proferoman;
    exports com.proferoman.formas;
}
