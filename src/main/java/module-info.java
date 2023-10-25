module com.fungame.tictactoe {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.fungame.tictactoe to javafx.fxml;
    exports com.fungame.tictactoe;
}