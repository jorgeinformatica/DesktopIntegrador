package Controller;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yop
 */
public class AppServer extends Thread {

    private static final int PORT = 4444;
    private ServerSocket server;
    private BLogic controller;
    private int count;
    public AppServer(BLogic controller) {
        count=1;
        this.controller = controller;
        try {
            server = new ServerSocket(PORT);
        } catch (IOException ex) {
            Logger.getLogger(AppServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                Socket socket=server.accept();
                new ResponseServer(socket, controller,"Alarma N_"+count++).start();
            } catch (IOException ex) {
                Logger.getLogger(AppServer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static int getPORT() {
        return PORT;
    }

    public ServerSocket getServer() {
        return server;
    }

}
