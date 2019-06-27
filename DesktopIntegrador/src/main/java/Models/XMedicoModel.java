package Models;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class XMedicoModel implements java.io.Serializable {

    private int id;
    private String name;
    private String apellido1;
    private String apellido2;
    private String disponibilidad;
    private String telefono;
    private Set XDependienteModels = new HashSet(0);

    public XMedicoModel() {
    }

    public XMedicoModel(int id) {
        this.id = id;
    }

    public XMedicoModel(int id, String name, String apellido1, String apellido2, String disponibilidad, String telefono, Set XDependienteModels) {
        this.id = id;
        this.name = name;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.disponibilidad = disponibilidad;
        this.telefono = telefono;
        this.XDependienteModels = XDependienteModels;
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

    public String getApellido1() {
        return this.apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return this.apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDisponibilidad() {
        return this.disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
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
        return name + " " + apellido1 + " " + apellido2;
    }

    public String datos() {
        String respuesta = name + "," + System.getProperty("line.separator") + apellido1 + " " + apellido2+".";
        if (disponibilidad != null) {
            respuesta += System.getProperty("line.separator") + disponibilidad+".";
        }
        if (telefono != null) {
            respuesta += System.getProperty("line.separator") +"Telf."+ telefono;
        }
        return respuesta;
    }
}
