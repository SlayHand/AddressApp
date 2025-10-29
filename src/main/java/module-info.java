module com.example.addressapp1 {
    requires javafx.controls;
    requires javafx.fxml;

    // FXML refleksioon
    opens ch.makery.address to javafx.fxml;
    opens ch.makery.address.view to javafx.fxml; // ⬅️ lisa see

    // Avalik API (nt MainApp)
    exports ch.makery.address;
}