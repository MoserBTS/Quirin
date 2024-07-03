module stage.bts.projet_genere.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens stage.bts.projet_genere.demo to javafx.fxml;
    exports stage.bts.projet_genere.demo;
}