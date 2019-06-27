package Utils;

import java.util.ArrayList;
import javax.swing.AbstractListModel;

/**
 *
 * @author Yop
 */
public class ModelList extends AbstractListModel {

    private ArrayList<Object> lista = new ArrayList<>();

    @Override
    public int getSize() {
        return lista.size();
    }

    @Override
    public Object getElementAt(int index) {
        Object ob = lista.get(index);
        return ob.toString();
    }

    public void addObject(Object ob) {
        lista.add(ob);
        this.fireIntervalAdded(this, 0, getSize() + 1);
    }

    public void deleteObject(int index) {
        lista.remove(index);
        this.fireIntervalRemoved(index, 0, getSize() - 1);
    }

    public Object getObject(int index) {
        return lista.get(index);
    }

    public ArrayList<Object> getLista() {
        return lista;
    }

    public boolean clearList() {
        return this.lista.removeAll(lista);
    }
}
