package Models;

import java.util.HashSet;
import java.util.Set;

public class XRecursocomModel implements java.io.Serializable {

    private int id;
    private String name;
    private String descripcion;
    private Set XOfrecerrcModels = new HashSet(0);

    public XRecursocomModel() {
    }

    public XRecursocomModel(int id) {
        this.id = id;
    }

    public XRecursocomModel(int id, String name, String descripcion, Set XOfrecerrcModels) {
        this.id = id;
        this.name = name;
        this.descripcion = descripcion;
        this.XOfrecerrcModels = XOfrecerrcModels;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Set getXOfrecerrcModels() {
        return this.XOfrecerrcModels;
    }

    public void setXOfrecerrcModels(Set XOfrecerrcModels) {
        this.XOfrecerrcModels = XOfrecerrcModels;
    }

    @Override
    public String toString() {
        return id + ": " + name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.toString().toLowerCase().contains(((String) obj).toLowerCase())) {
            return true;
        }
        return false;
    }
}
