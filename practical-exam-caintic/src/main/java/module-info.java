module org.rocs.pec {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.rocs.business.desktop.pec to javafx.fxml;
    exports org.rocs.business.desktop.pec;
    exports;
    opens to
}