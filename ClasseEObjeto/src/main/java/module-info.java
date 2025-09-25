module com.example.classeeobjeto {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.classeeobjeto to javafx.fxml;
    exports com.example.classeeobjeto;
}