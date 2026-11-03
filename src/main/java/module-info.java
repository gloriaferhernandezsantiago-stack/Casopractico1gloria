module com.mycompany.casopractico01gloria {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.casopractico01gloria to javafx.fxml;
    exports com.mycompany.casopractico01gloria;
}
