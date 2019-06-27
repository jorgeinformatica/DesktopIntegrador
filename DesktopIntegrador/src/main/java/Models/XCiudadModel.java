package Models;

import java.util.HashSet;
import java.util.Set;

public class XCiudadModel implements java.io.Serializable {

    private int id;
    private XProvinciaModel XProvinciaModel;
    private String name;
    private String cp;
    private Set XDireccionModels = new HashSet(0);
    private Set XOfrecerrcModels = new HashSet(0);

    public XCiudadModel() {

    }

    public XCiudadModel(int id, XProvinciaModel XProvinciaModel, String name) {
        this.id = id;
        this.XProvinciaModel = XProvinciaModel;
        this.name = name;
    }

    public XCiudadModel(int id, XProvinciaModel XProvinciaModel, String name, String cp, Set XDireccionModels, Set XOfrecerrcModels) {
        this.id = id;
        this.XProvinciaModel = XProvinciaModel;
        this.name = name;
        this.cp = cp;
        this.XDireccionModels = XDireccionModels;
        this.XOfrecerrcModels = XOfrecerrcModels;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public XProvinciaModel getXProvinciaModel() {
        return this.XProvinciaModel;
    }

    public void setXProvinciaModel(XProvinciaModel XProvinciaModel) {
        this.XProvinciaModel = XProvinciaModel;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCp() {
        return this.cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public Set getXDireccionModels() {
        return this.XDireccionModels;
    }

    public void setXDireccionModels(Set XDireccionModels) {
        this.XDireccionModels = XDireccionModels;
    }

    public Set getXOfrecerrcModels() {
        return this.XOfrecerrcModels;
    }

    public void setXOfrecerrcModels(Set XOfrecerrcModels) {
        this.XOfrecerrcModels = XOfrecerrcModels;
    }

    @Override
    public String toString() {
        return  name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.toString().toLowerCase().contains(((String)obj).toLowerCase())) {
            return true;
        }
        return false;
    }
}
