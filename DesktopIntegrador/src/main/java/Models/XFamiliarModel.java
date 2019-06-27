package Models;

import java.util.HashSet;
import java.util.Set;

public class XFamiliarModel implements java.io.Serializable {

    private int id;
    private XDireccionModel XDireccionModel;
    private XPersonaModel XPersonaModel;
    private Boolean llaves;
    private String relacion;
    private String observaciones;
    private Set XContactofamiliarModels = new HashSet(0);

    public XFamiliarModel() {
    }

    public XFamiliarModel(int id, XDireccionModel XDireccionModel, XPersonaModel XPersonaModel) {
        this.id = id;
        this.XDireccionModel = XDireccionModel;
        this.XPersonaModel = XPersonaModel;
    }

    public XFamiliarModel(int id, XDireccionModel XDireccionModel, XPersonaModel XPersonaModel, Boolean llaves, String relacion, String observaciones, Set XContactofamiliarModels) {
        this.id = id;
        this.XDireccionModel = XDireccionModel;
        this.XPersonaModel = XPersonaModel;
        this.llaves = llaves;
        this.relacion = relacion;
        this.observaciones = observaciones;
        this.XContactofamiliarModels = XContactofamiliarModels;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public XDireccionModel getXDireccionModel() {
        return this.XDireccionModel;
    }

    public void setXDireccionModel(XDireccionModel XDireccionModel) {
        this.XDireccionModel = XDireccionModel;
    }

    public XPersonaModel getXPersonaModel() {
        return this.XPersonaModel;
    }

    public void setXPersonaModel(XPersonaModel XPersonaModel) {
        this.XPersonaModel = XPersonaModel;
    }

    public Boolean getLlaves() {
        return this.llaves;
    }

    public void setLlaves(Boolean llaves) {
        this.llaves = llaves;
    }

    public String getRelacion() {
        return this.relacion;
    }

    public void setRelacion(String relacion) {
        this.relacion = relacion;
    }

    public String getObservaciones() {
        return this.observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Set getXContactofamiliarModels() {
        return this.XContactofamiliarModels;
    }

    public void setXContactofamiliarModels(Set XContactofamiliarModels) {
        this.XContactofamiliarModels = XContactofamiliarModels;
    }

    @Override
    public String toString() {
        return this.XPersonaModel.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this.toString().toLowerCase().contains(((String) obj).toLowerCase())) {
            return true;
        }
        return false;
    }
}
