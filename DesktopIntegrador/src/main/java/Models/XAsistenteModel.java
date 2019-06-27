package Models;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class XAsistenteModel implements java.io.Serializable {

    private int id;
    private XPersonaModel XPersonaModel;
    private String password;
    private Set XLlamadaModels = new HashSet(0);
    private Set XAlarmaModels = new HashSet(0);

    public XAsistenteModel() {
    }

    public XAsistenteModel(int id, XPersonaModel XPersonaModel, String password) {
        this.id = id;
        this.XPersonaModel = XPersonaModel;
        this.password = password;
    }

    public XAsistenteModel(int id, XPersonaModel XPersonaModel, String password, Integer createUid, Date createDate) {
        this.id = id;
        this.XPersonaModel = XPersonaModel;
        this.password = password;

    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return XPersonaModel.toString();
    }

}
