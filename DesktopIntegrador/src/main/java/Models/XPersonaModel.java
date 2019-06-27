package Models;

import java.util.HashSet;
import java.util.Set;

public class XPersonaModel implements java.io.Serializable {

    private int id;
    private String name;
    private String apellido1;
    private String apellido2;
    private String dni;
    private String telefono;
    private String email;
    private Set XDependienteModels = new HashSet(0);
    private Set XAsistenteModels = new HashSet(0);
    private Set XFamiliarModels = new HashSet(0);

    public XPersonaModel() {

    }

    public XPersonaModel(int id, String name, String apellido1, String apellido2, String dni, String telefono, String email) {
        this.id = id;
        this.name = name;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
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

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set getXDependienteModels() {
        return XDependienteModels;
    }

    public void setXDependienteModels(Set XDependienteModels) {
        this.XDependienteModels = XDependienteModels;
    }

    public Set getXAsistenteModels() {
        return XAsistenteModels;
    }

    public void setXAsistenteModels(Set XAsistenteModels) {
        this.XAsistenteModels = XAsistenteModels;
    }

    public Set getXFamiliarModels() {
        return XFamiliarModels;
    }

    public void setXFamiliarModels(Set XFamiliarModels) {
        this.XFamiliarModels = XFamiliarModels;
    }

    @Override
    public String toString() {
         return name + " " + apellido1 + " " + apellido2 + " - " + dni ;
    }
    
}
