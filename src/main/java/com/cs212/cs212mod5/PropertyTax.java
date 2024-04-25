package com.cs212.cs212mod5;

import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Button;


public class PropertyTax extends Application {
    @Override
    public void start(Stage stage) {
        Button calculatePropertyTax = new Button("Calculate Property Tax");
        Label actualValueLabel = new Label("Actual Value: ");
        Label assessmentValueLabel = new Label("Assessment Value: ");
        Label propertyTaxLabel = new Label("Property Tax: ");
        TextField inputPropertyValueTextFeld = new TextField();



    }

    public static void main(String[] args) {
        launch();
    }
}