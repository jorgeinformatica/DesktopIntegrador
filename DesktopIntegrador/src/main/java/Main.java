
import Controller.BLogic;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * @author vesprada
 */
public class Main {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.seaglasslookandfeel.SeaGlassLookAndFeel");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            System.out.println("NO SE ENCUENTRA EL TEMA ESCOGIDO" + e.getMessage());
        }
        BLogic controller = new BLogic();
    }

}
