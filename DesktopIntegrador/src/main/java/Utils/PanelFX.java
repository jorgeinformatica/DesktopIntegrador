package Utils;

import java.awt.Dimension;
import java.net.MalformedURLException;
import java.net.URL;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class PanelFX extends JFXPanel {

    //Variable encargada de renderizar la web
    private WebEngine engine;

    public PanelFX(int ancho, int alto) {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                WebView view = new WebView();
                engine = view.getEngine();
                setScene(new Scene(view));
            }
        });
        initUI(ancho, alto);
    }

    //Metodo para cargar la URL de la pagina web
    public void loadURL(final String url) {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                String tmp = toURL(url);
                if (tmp == null) {
                    tmp = toURL(url);
                }
                engine.load(tmp);
            }
        });
    }

    //Metodo para parsear la String a URL
    private String toURL(String str) {
        try {
            return new URL(str).toExternalForm();
        } catch (MalformedURLException exception) {
            return null;
        }
    }

    private void initUI(int ancho, int alto) {
        this.setMaximumSize(new Dimension(ancho, alto));
        this.setMinimumSize(new Dimension(ancho / 10, alto / 10));
        setVisible(true);
    }

    public WebEngine getEngine() {
        return engine;
    }
}
