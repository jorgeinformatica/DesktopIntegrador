package Models;

import java.util.Date;

public class XLlamadaModel implements java.io.Serializable {

    private int id;
    private XAsistenteModel XAsistenteModel;
    private XAvisoModel XAvisoModel;
    private XDependienteModel XDependienteModel;
    private Date fechaHora;

    public XLlamadaModel() {
    }

    public XLlamadaModel(int id, XAsistenteModel XAsistenteModel, XAvisoModel XAvisoModel, XDependienteModel XDependienteModel) {
        this.id = id;
        this.XAsistenteModel = XAsistenteModel;
        this.XAvisoModel = XAvisoModel;
        this.XDependienteModel = XDependienteModel;
    }

    public XLlamadaModel(int id, XAsistenteModel XAsistenteModel, XAvisoModel XAvisoModel, XDependienteModel XDependienteModel, Date fechaHora) {
        this.id = id;
        this.XAsistenteModel = XAsistenteModel;
        this.XAvisoModel = XAvisoModel;
        this.XDependienteModel = XDependienteModel;
        this.fechaHora = fechaHora;

    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public XAsistenteModel getXAsistenteModel() {
        return this.XAsistenteModel;
    }

    public void setXAsistenteModel(XAsistenteModel XAsistenteModel) {
        this.XAsistenteModel = XAsistenteModel;
    }

    public XAvisoModel getXAvisoModel() {
        return this.XAvisoModel;
    }

    public void setXAvisoModel(XAvisoModel XAvisoModel) {
        this.XAvisoModel = XAvisoModel;
    }

    public XDependienteModel getXDependienteModel() {
        return this.XDependienteModel;
    }

    public void setXDependienteModel(XDependienteModel XDependienteModel) {
        this.XDependienteModel = XDependienteModel;
    }

    public Date getFechaHora() {
        return this.fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    @Override
    public String toString() {
        return "id=" + id + ", Asistente=" + XAsistenteModel + ", Aviso=" + XAvisoModel + ", Dependiente=" + XDependienteModel + ", Fecha=" + fechaHora;
    }
}
