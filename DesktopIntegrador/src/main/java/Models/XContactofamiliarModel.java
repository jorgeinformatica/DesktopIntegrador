package Models;

public class XContactofamiliarModel implements java.io.Serializable {

    private int id;
    private XDependienteModel XDependienteModel;
    private XFamiliarModel XFamiliarModel;
    private String disponibilidad;
    private String prioridad;

    public XContactofamiliarModel() {

    }

    public XContactofamiliarModel(int id, XDependienteModel XDependienteModel, XFamiliarModel XFamiliarModel) {
        this.id = id;
        this.XDependienteModel = XDependienteModel;
        this.XFamiliarModel = XFamiliarModel;
    }

    public XContactofamiliarModel(int id, XDependienteModel XDependienteModel, XFamiliarModel XFamiliarModel, String disponibilidad, String prioridad) {
        this.id = id;
        this.XDependienteModel = XDependienteModel;
        this.XFamiliarModel = XFamiliarModel;
        this.disponibilidad = disponibilidad;
        this.prioridad = prioridad;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public XDependienteModel getXDependienteModel() {
        return this.XDependienteModel;
    }

    public void setXDependienteModel(XDependienteModel XDependienteModel) {
        this.XDependienteModel = XDependienteModel;
    }

    public XFamiliarModel getXFamiliarModel() {
        return this.XFamiliarModel;
    }

    public void setXFamiliarModel(XFamiliarModel XFamiliarModel) {
        this.XFamiliarModel = XFamiliarModel;
    }

    public String getDisponibilidad() {
        return this.disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getPrioridad() {
        return this.prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

}
