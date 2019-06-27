package Controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

/**
 *
 * @author Yop
 */
public class ResponseServer extends Thread {

    private JSONObject resp;
    private BufferedReader br;
    private BufferedWriter bw;
    private String jsonText;
    private String name;
    private Socket accept;
    private BLogic controller;

    public ResponseServer(Socket accept, BLogic controller, String name) {
        this.name = name;
        this.accept = accept;
        this.controller = controller;
    }

    @Override
    public void run() {
        try {
            br = new BufferedReader(new InputStreamReader(accept.getInputStream(), Charset.forName("UTF-8")));
            bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
            jsonText = br.readLine();
            resp = new JSONObject(jsonText);
            ControlTask control = new ControlTask(controller, accept, name, br, bw);
            controller.insertAlarm(resp, control);
            control.start();
        } catch (IOException ex) {
            Logger.getLogger(ResponseServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JSONException ex) {
            Logger.getLogger(ResponseServer.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

}
