package Model;

import Model.gameClasses.ClientHandler;

import java.io.InputStream;
import java.io.OutputStream;

public class HostCommunicationHandler implements ClientHandler {
    @Override
    public void handleClient(InputStream inFromclient, OutputStream outToClient) {

    }

    @Override
    public void close() {

    }
}
