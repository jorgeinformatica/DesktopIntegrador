package Models;

import java.util.Date;

public class XEstadoModel implements java.io.Serializable {

    private int id;
    private XDependienteModel XDependienteModel;
    private Date fechaHora;
    private Date fechaHoraInicio;
    private String descripcion;

    public XEstadoModel() {
    }

    public XEstadoModel(int id, XDependienteModel XDependienteModel) {
        this.id = id;
        this.XDependienteModel = XDependienteModel;
    }

    public XEstadoModel(int id, XDependienteModel XDependienteModel, Date fechaHora, Date fechaHoraInicio, String descripcion) {
        this.id = id;
        this.XDependienteModel = XDependienteModel;
        this.fechaHora = fechaHora;
        this.fechaHoraInicio = fechaHoraInicio;
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

    public Date getFechaHora() {
        return this.fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Date getFechaHoraInicio() {
        return this.fechaHoraInicio;
    }

    public void setFechaHoraInicio(Date fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Dependiente=" + XDependienteModel + ", Fecha Apunte=" + fechaHora + ", Fecha Inicio=" + fechaHoraInicio + ", Descripcion=" + descripcion;
    }
}
