package Utils;

import com.opencsv.CSVReader;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import jdk.nashorn.api.scripting.URLReader;

/**
 *
 * @author vesprada
 */
public class Utils {

    private final static String FILEMAP = "src/main/resources/Recursos/image.jpg";
    private final static String MAPS_KEY = "%20AIzaSyBXkyYwknSg-vZ446hxBHmVEMshcbujIyo";
    private final static URL FILE = Utils.class.getResource("/Recursos/Tipos_Via.csv");

    //Genera la estructura y modelo de la tabla
    public static TableModel buildTableModel(ResultSet rs) {
        Vector<String> columnNames = new Vector<>();
        Vector<Vector<Object>> data = new Vector<>();
        try {
            ResultSetMetaData metaData = rs.getMetaData();

            // Nombres de las columnas
            int columnCount = metaData.getColumnCount();
            for (int column = 1; column <= columnCount; column++) {
                columnNames.add(metaData.getColumnLabel(column));
            }

            // Datos
            while (rs.next()) {
                Vector<Object> vector = new Vector<>();
                for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                    vector.add(rs.getObject(columnIndex));
                }
                data.add(vector);
            }

        } catch (SQLException ex) {
            System.err.println("Error generando la tabla. " + ex.getMessage());
        }
        return new DefaultTableModel(data, columnNames);
    }

    //Ajusta automáticamente el tamaño de las columnas de la tabla
    public static void resizeColumnWidth(JTable table) {
        final TableColumnModel columnModel = table.getColumnModel();
        //Eliminamos de la vista la columna id, porque no tiene utilidad visualmente, pero si para la logica
        columnModel.removeColumn(table.getColumn("id"));
        for (int column = 0; column < table.getColumnCount(); column++) {
            int width = 15; // Min width
            for (int row = 0; row < table.getRowCount(); row++) {
                TableCellRenderer renderer = table.getCellRenderer(row, column);
                Component comp = table.prepareRenderer(renderer, row, column);
                width = Math.max(comp.getPreferredSize().width + 1, width);
            }
            if (width > 300) {
                width = 300;
            }
            columnModel.getColumn(column).setPreferredWidth(width);
        }
    }

    //Asigna automaticamente la letra del dni
    public static String laLetra(String numeracion) {
        String juegoCaracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
        int modulo = Integer.valueOf(numeracion) % 23;
        return numeracion + juegoCaracteres.charAt(modulo);
    }

    //Solo acepta numeros
    public static void soloNumeros(java.awt.event.KeyEvent evt) {
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9')) && (caracter != '\b')) {
            evt.consume();
        }
    }

    //Carga los tipos de vias de un CSV.
    public static ComboBoxModel<String> listaTipo() {
        DefaultComboBoxModel<String> vias = new DefaultComboBoxModel<>();
        String[] line;
        try {
            CSVReader reader = new CSVReader(new BufferedReader(new URLReader(FILE)));
            while ((line = reader.readNext()) != null) {
                if (line != null) {
                    for (String string : line) {
                        vias.addElement(string);
                    }
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("FICHERO NO ENCONTRADO. " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("ERROR DE ENTRADA/SALIDA. " + ex.getMessage());
        }
        return vias;
    }

    //Carga las coordenadas en el mapa de geolocalizacion
    public static void generatingMap(double lat, double lng, int zoom) {
        try {
            String imageUrl = "https://maps.googleapis.com/maps/api/staticmap?"
                    + "markers=icon:http://img.fenixzone.net/i/RUpTJIG.png|" + lat + "," + lng
                    + "&zoom=" + zoom + "&size=1612x1612" + "&scale=2" + "&maptype=roadmap" + "&key=" + MAPS_KEY + "&format=jpg";

            URL url = new URL(imageUrl);
            InputStream is = url.openStream();
            OutputStream os = new FileOutputStream(FILEMAP);

            byte[] b = new byte[2048];
            int length;

            while ((length = is.read(b)) != -1) {
                os.write(b, 0, length);
            }
            is.close();
            os.close();
        } catch (IOException e) {
            System.out.println("ERORR DE I/O. " + e.getMessage());
        }
    }
}
