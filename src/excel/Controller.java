package excel;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    public Button btnFile;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btnFile.setOnMouseEntered(event -> {
            btnFile.setTextFill(Color.BLUE);
            btnFile.setPrefSize(btnFile.getWidth() * 1.2, btnFile.getHeight() * 1.2);
           // btnFile.relocate(btnFile.getLayoutX() - (btnFile.getWidth() * 0.1), btnFile.getLayoutY() - (btnFile.getHeight() * 0.1));
        });
        btnFile.setOnMouseExited(event -> {
            btnFile.setTextFill(Color.BLACK);
            btnFile.setPrefSize(btnFile.getWidth() * 5 / 6, btnFile.getHeight() * 5 / 6);
            //btnFile.relocate(btnFile.getLayoutX() + (btnFile.getWidth() * 0.1), btnFile.getLayoutY() + (btnFile.getHeight() * 0.1));
        });

        btnFile.setOnMouseClicked(event -> clickButton());
    }

    private void clickButton() {

    }
}
