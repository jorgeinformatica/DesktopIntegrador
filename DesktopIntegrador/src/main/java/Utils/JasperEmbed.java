package Utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 *
 * @author vesprada
 */
public class JasperEmbed {

    private final String INIT = "http:";
    private final String HOST = "//149.202.8.235";
    private final String PORT = ":8080";
    private final String REPOSITORY = "/jasperserver/rest_v2/reports/reports/grup2/";
    private final String ESPANSE = ".pdf";
    private final String USER = "j_username=grup2";
    private final String PASS = "j_password=Grupo-312";
    private final String FILE = "Informe.pdf";
    private final String METHOD = "GET";

    private String DOC;//nombre del informe que deseamos
    private URL url;
    private HttpURLConnection conection;

    public JasperEmbed(String DOC) throws MalformedURLException, IOException {
        this.DOC = DOC;
        SetUI();
    }

    private void SetUI() throws FileNotFoundException, MalformedURLException, IOException {
        OutputStream fos = null;
        int responseCode;
        File pdfFile = new File(FILE);
        fos = new FileOutputStream(pdfFile);
        url = new URL(INIT + HOST + PORT + REPOSITORY + DOC + ESPANSE + "?" + USER + "&" + PASS);
        conection = (HttpURLConnection) url.openConnection();
        conection.setRequestMethod(METHOD);
        responseCode = conection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            InputStream is = conection.getInputStream();
            while (is.available() > 0) {
                fos.write(is.read());
                fos.flush();
            }
        }
    }
}
