package Models;

public class XOfrecerrcModel implements java.io.Serializable {

    private int id;
    private XCiudadModel XCiudadModel;
    private XRecursocomModel XRecursocomModel;
    private String telefono;
    private String email;

    public XOfrecerrcModel() {
    }

    public XOfrecerrcModel(int id) {
        this.id = id;
    }

    public XOfrecerrcModel(int id, XCiudadModel XCiudadModel, XRecursocomModel XRecursocomModel, String telefono, String email) {
        this.id = id;
        this.XCiudadModel = XCiudadModel;
        this.XRecursocomModel = XRecursocomModel;
        this.telefono = telefono;
        this.email = email;

    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public XCiudadModel getXCiudadModel() {
        return this.XCiudadModel;
    }

    public void setXCiudadModel(XCiudadModel XCiudadModel) {
        this.XCiudadModel = XCiudadModel;
    }

    public XRecursocomModel getXRecursocomModel() {
        return this.XRecursocomModel;
    }

    public void setXRecursocomModel(XRecursocomModel XRecursocomModel) {
        this.XRecursocomModel = XRecursocomModel;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
