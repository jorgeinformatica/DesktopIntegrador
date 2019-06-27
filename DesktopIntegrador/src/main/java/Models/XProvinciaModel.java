package Models;

import java.util.HashSet;
import java.util.Set;

public class XProvinciaModel implements java.io.Serializable {

    private int id;
    private String name;
    private Set XCiudadModels = new HashSet(0);

    public XProvinciaModel() {
    }

    public XProvinciaModel(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public XProvinciaModel(int id, String name, Set XCiudadModels) {
        this.id = id;
        this.name = name;
        this.XCiudadModels = XCiudadModels;
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

    public Set getXCiudadModels() {
        return this.XCiudadModels;
    }

    public void setXCiudadModels(Set XCiudadModels) {
        this.XCiudadModels = XCiudadModels;
    }

    @Override
    public String toString() {
        return name;
    }

}
