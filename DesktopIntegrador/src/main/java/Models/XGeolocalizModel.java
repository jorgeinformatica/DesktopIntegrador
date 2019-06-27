package Models;

import java.util.Date;

public class XGeolocalizModel implements java.io.Serializable {

    private int id;
    private XDependienteModel XDependienteModel;
    private Double latitud;
    private Double longitud;
    private Date fechaHora;

    public XGeolocalizModel() {
    }

    public XGeolocalizModel(int id, XDependienteModel XDependienteModel) {
        this.id = id;
        this.XDependienteModel = XDependienteModel;
    }

    public XGeolocalizModel(int id, XDependienteModel XDependienteModel, Double latitud, Double longitud, Date fechaHora) {
        this.id = id;
        this.XDependienteModel = XDependienteModel;
        this.latitud = latitud;
        this.longitud = longitud;
        this.fechaHora = fechaHora;
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

    public Double getLatitud() {
        return this.latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return this.longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public Date getFechaHora() {
        return this.fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    @Override
    public String toString() {
        return "Dependiente= " + XDependienteModel + ", latitud=" + latitud + ", longitud=" + longitud + ", Fecha=" + fechaHora;
    }
}
