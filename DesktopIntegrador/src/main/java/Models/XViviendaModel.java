package Models;

public class XViviendaModel implements java.io.Serializable {

    private int id;
    private XDependienteModel XDependienteModel;
    private XDireccionModel XDireccionModel;
    private String name;
    private Boolean habitual;
    private String modoAcceso;

    public XViviendaModel() {
    }

    public XViviendaModel(int id, XDependienteModel XDependienteModel, XDireccionModel XDireccionModel) {
        this.id = id;
        this.XDependienteModel = XDependienteModel;
        this.XDireccionModel = XDireccionModel;
    }

    public XViviendaModel(XDireccionModel XDireccionModel, String name, Boolean habitual, String modoAcceso) {
        this.XDireccionModel = XDireccionModel;
        this.name = name;
        this.habitual = habitual;
        this.modoAcceso = modoAcceso;
    }

    public XViviendaModel(int id, XDependienteModel XDependienteModel, XDireccionModel XDireccionModel, String name, Boolean habitual, String modoAcceso) {
        this.id = id;
        this.XDependienteModel = XDependienteModel;
        this.XDireccionModel = XDireccionModel;
        this.name = name;
        this.habitual = habitual;
        this.modoAcceso = modoAcceso;

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

    public Boolean getHabitual() {
        return this.habitual;
    }

    public void setHabitual(Boolean habitual) {
        this.habitual = habitual;
    }

    public String getModoAcceso() {
        return this.modoAcceso;
    }

    public void setModoAcceso(String modoAcceso) {
        this.modoAcceso = modoAcceso;
    }

    @Override
    public String toString() {
        return name;
    }

}
