module eu.komaweb.trapter {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens eu.komaweb.trapter to javafx.fxml;
    exports eu.komaweb.trapter;
}