package Models;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class XDependienteModel implements java.io.Serializable {

    private int id;
    private XCsModel XCsModel;
    private XMedicoModel XMedicoModel;
    private XPersonaModel XPersonaModel;
    private String password;
    private String genero;
    private Date fecNacim;
    private String nss;
    private Date fecAlta;
    private Set XLlamadaModels = new HashSet(0);
    private Set XAlarmaModels = new HashSet(0);
    private Set XViviendaModels = new HashSet(0);
    private Set XAvisoModels = new HashSet(0);
    private Set XEstadoModels = new HashSet(0);
    private Set XGeolocalizModels = new HashSet(0);
    private Set XHistmedicoModels = new HashSet(0);
    private Set XContactofamiliarModels = new HashSet(0);

    public XDependienteModel() {
    }

    public XDependienteModel(int id, XPersonaModel XPersonaModel, String password) {
        this.id = id;
        this.XPersonaModel = XPersonaModel;
        this.password = password;
    }

    public XDependienteModel(int id, XCsModel XCsModel, XMedicoModel XMedicoModel, XPersonaModel XPersonaModel, String password, String genero, Date fecNacim, String nss, Date fecAlta, Set XLlamadaModels, Set XAlarmaModels, Set XViviendaModels, Set XAvisoModels, Set XEstadoModels, Set XGeolocalizModels, Set XHistmedicoModels, Set XContactofamiliarModels) {
        this.id = id;
        this.XCsModel = XCsModel;
        this.XMedicoModel = XMedicoModel;
        this.XPersonaModel = XPersonaModel;
        this.password = password;
        this.genero = genero;
        this.fecNacim = fecNacim;
        this.nss = nss;
        this.fecAlta = fecAlta;
        this.XLlamadaModels = XLlamadaModels;
        this.XAlarmaModels = XAlarmaModels;
        this.XViviendaModels = XViviendaModels;
        this.XAvisoModels = XAvisoModels;
        this.XEstadoModels = XEstadoModels;
        this.XGeolocalizModels = XGeolocalizModels;
        this.XHistmedicoModels = XHistmedicoModels;
        this.XContactofamiliarModels = XContactofamiliarModels;
    }

    public XDependienteModel(XPersonaModel xPersonaModel) {
        this.XPersonaModel = xPersonaModel;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public XCsModel getXCsModel() {
        return this.XCsModel;
    }

    public void setXCsModel(XCsModel XCsModel) {
        this.XCsModel = XCsModel;
    }

    public XMedicoModel getXMedicoModel() {
        return this.XMedicoModel;
    }

    public void setXMedicoModel(XMedicoModel XMedicoModel) {
        this.XMedicoModel = XMedicoModel;
    }

    public XPersonaModel getXPersonaModel() {
        return this.XPersonaModel;
    }

    public void setXPersonaModel(XPersonaModel XPersonaModel) {
        this.XPersonaModel = XPersonaModel;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFecNacim() {
        return this.fecNacim;
    }

    public void setFecNacim(Date fecNacim) {
        this.fecNacim = fecNacim;
    }

    public String getNss() {
        return this.nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public Date getFecAlta() {
        return this.fecAlta;
    }

    public void setFecAlta(Date fecAlta) {
        this.fecAlta = fecAlta;
    }

    public Set getXLlamadaModels() {
        return this.XLlamadaModels;
    }

    public void setXLlamadaModels(Set XLlamadaModels) {
        this.XLlamadaModels = XLlamadaModels;
    }

    public Set getXAlarmaModels() {
        return this.XAlarmaModels;
    }

    public void setXAlarmaModels(Set XAlarmaModels) {
        this.XAlarmaModels = XAlarmaModels;
    }

    public Set getXViviendaModels() {
        return this.XViviendaModels;
    }

    public void setXViviendaModels(Set XViviendaModels) {
        this.XViviendaModels = XViviendaModels;
    }

    public Set getXAvisoModels() {
        return this.XAvisoModels;
    }

    public void setXAvisoModels(Set XAvisoModels) {
        this.XAvisoModels = XAvisoModels;
    }

    public Set getXEstadoModels() {
        return this.XEstadoModels;
    }

    public void setXEstadoModels(Set XEstadoModels) {
        this.XEstadoModels = XEstadoModels;
    }

    public Set getXGeolocalizModels() {
        return this.XGeolocalizModels;
    }

    public void setXGeolocalizModels(Set XGeolocalizModels) {
        this.XGeolocalizModels = XGeolocalizModels;
    }

    public Set getXHistmedicoModels() {
        return this.XHistmedicoModels;
    }

    public void setXHistmedicoModels(Set XHistmedicoModels) {
        this.XHistmedicoModels = XHistmedicoModels;
    }

    public Set getXContactofamiliarModels() {
        return this.XContactofamiliarModels;
    }

    public void setXContactofamiliarModels(Set XContactofamiliarModels) {
        this.XContactofamiliarModels = XContactofamiliarModels;
    }

    @Override
    public String toString() {
        return this.XPersonaModel.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this.toString().toLowerCase().contains(((String) obj).toLowerCase())) {
            return true;
        }
        return false;
    }
}
