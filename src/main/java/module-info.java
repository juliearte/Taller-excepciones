module com.example.tallerexcepciones {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tallerexcepciones to javafx.fxml;
    exports com.example.tallerexcepciones;
}