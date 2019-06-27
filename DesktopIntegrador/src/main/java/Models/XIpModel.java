package Models;

/**
 *
 * @author yop
 */
public class XIpModel implements java.io.Serializable {

    private int id;
    private String ip;

    public XIpModel() {
       
    }

    public XIpModel(int id, String Ip) {
        this.id = id;
        this.ip = Ip;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String Ip) {
        this.ip = Ip;
    }

    @Override
    public String toString() {
        return "ip= " + ip;
    }

    
    
}
