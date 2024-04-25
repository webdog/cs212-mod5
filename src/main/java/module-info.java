module com.cs212.cs212mod5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cs212.cs212mod5 to javafx.fxml;
    exports com.cs212.cs212mod5;
}