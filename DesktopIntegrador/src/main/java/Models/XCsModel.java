package Models;

import java.util.HashSet;
import java.util.Set;

public class XCsModel implements java.io.Serializable {

    private int id;
    private XDireccionModel XDireccionModel;
    private String name;
    private String telefono;
    private Set XDependienteModels = new HashSet(0);

    public XCsModel() {
    }

    public XCsModel(int id, XDireccionModel XDireccionModel) {
        this.id = id;
        this.XDireccionModel = XDireccionModel;
    }

    public XCsModel(XDireccionModel XDireccionModel, String telefono, String name) {
        this.XDireccionModel = XDireccionModel;
        this.telefono = telefono;
        this.name = name;
    }

    public XCsModel(int id, XDireccionModel XDireccionModel, String name, String telefono, Set XDependienteModels) {
        this.id = id;
        this.XDireccionModel = XDireccionModel;
        this.name = name;
        this.telefono = telefono;
        this.XDependienteModels = XDependienteModels;
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

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Set getXDependienteModels() {
        return this.XDependienteModels;
    }

    public void setXDependienteModels(Set XDependienteModels) {
        this.XDependienteModels = XDependienteModels;
    }

    @Override
    public String toString() {
        return name;
    }

    public String datos() {
        String respuesta = name + ",";
        if (XDireccionModel != null) {
            respuesta += System.getProperty("line.separator") + XDireccionModel.getTipovia()
                    + " " + XDireccionModel.getDireccion() + ", num: " + XDireccionModel.getNum()+"."
                    + System.getProperty("line.separator") + XDireccionModel.getXCiudadModel().getName()
                    + " (" + XDireccionModel.getXCiudadModel().getXProvinciaModel().getName() + ").";
        }
        if (telefono != null) {
            respuesta += System.getProperty("line.separator") +"Telf. "+ telefono;
        }
        return respuesta;
    }

}
