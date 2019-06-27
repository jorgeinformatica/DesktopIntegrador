package Models;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class XAvisoModel implements java.io.Serializable {

    private int id;
    private XDependienteModel XDependienteModel;
    private String tipo;
    private String name;
    private Date fecDesde;
    private Date fecHasta;
    private String periodicidad;
    private Boolean recibido;
    private Integer tomas;
    private Integer tomas_constantes;
    private Boolean llamada;
    private Set XLlamadaModels = new HashSet(0);

    public XAvisoModel() {
    }

    public XAvisoModel(int id, XDependienteModel XDependienteModel, Date fecDesde) {
        this.id = id;
        this.XDependienteModel = XDependienteModel;
        this.fecDesde = fecDesde;
    }

    public XAvisoModel(int id, XDependienteModel XDependienteModel, String tipo, String name, Date fecDesde, Date fecHasta, String periodicidad, Boolean recibido, Integer tomas, Set XLlamadaModels) {
        this.id = id;
        this.XDependienteModel = XDependienteModel;
        this.tipo = tipo;
        this.name = name;
        this.fecDesde = fecDesde;
        this.fecHasta = fecHasta;
        this.periodicidad = periodicidad;
        this.recibido = recibido;
        this.tomas = tomas;
        this.XLlamadaModels = XLlamadaModels;
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

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getFecDesde() {
        return this.fecDesde;
    }

    public void setFecDesde(Date fecDesde) {
        this.fecDesde = fecDesde;
    }

    public Date getFecHasta() {
        return this.fecHasta;
    }

    public void setFecHasta(Date fecHasta) {
        this.fecHasta = fecHasta;
    }

    public String getPeriodicidad() {
        return this.periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    public Boolean getRecibido() {
        return this.recibido;
    }

    public void setRecibido(Boolean recibido) {
        this.recibido = recibido;
    }

    public Integer getTomas() {
        return this.tomas;
    }

    public void setTomas(Integer tomas) {
        this.tomas = tomas;
    }

    public Set getXLlamadaModels() {
        return this.XLlamadaModels;
    }

    public void setXLlamadaModels(Set XLlamadaModels) {
        this.XLlamadaModels = XLlamadaModels;
    }

    public Integer getTomas_constantes() {
        return tomas_constantes;
    }

    public void setTomas_constantes(Integer tomas_constantes) {
        this.tomas_constantes = tomas_constantes;
    }

    public Boolean getLlamada() {
        return llamada;
    }

    public void setLlamada(Boolean llamada) {
        this.llamada = llamada;
    }

}
