package Models;

import java.util.Date;

public class XAlarmaModel implements java.io.Serializable {

    private int id;
    private XAsistenteModel XAsistenteModel;
    private XDependienteModel XDependienteModel;
    private Date fechaHora;
    private String descripcion;
    private String tipo;

    public XAlarmaModel() {
    }

    public XAlarmaModel(XAsistenteModel XAsistenteModel, XDependienteModel XDependienteModel, Date fechaHora) {
        this.XAsistenteModel = XAsistenteModel;
        this.XDependienteModel = XDependienteModel;
        this.fechaHora = fechaHora;
    }

    public XAlarmaModel(int id, XAsistenteModel XAsistenteModel, XDependienteModel XDependienteModel, Date fechaHora, String descripcion, String tipo) {
        this.id = id;
        this.XAsistenteModel = XAsistenteModel;
        this.XDependienteModel = XDependienteModel;
        this.fechaHora = fechaHora;
        this.descripcion = descripcion;
        this.tipo = tipo;
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

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
