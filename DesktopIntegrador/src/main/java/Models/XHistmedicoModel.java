package Models;

public class XHistmedicoModel implements java.io.Serializable {

    private int id;
    private XDependienteModel XDependienteModel;
    private String name;
    private String descripcion;

    public XHistmedicoModel() {
    }

    public XHistmedicoModel(int id, XDependienteModel XDependienteModel) {
        this.id = id;
        this.XDependienteModel = XDependienteModel;
    }

    public XHistmedicoModel(int id, XDependienteModel XDependienteModel, String name, String descripcion) {
        this.id = id;
        this.XDependienteModel = XDependienteModel;
        this.name = name;
        this.descripcion = descripcion;

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

    @Override
    public String toString() {
        return descripcion;
    }

}
