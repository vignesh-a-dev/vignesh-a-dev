package collections.EMS;


import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server {
    private Socket socket = null;
    private DataInputStream input = null;
    private ServerSocket server = null;

    public server(int port) {
        try {
            server = new ServerSocket(port);
            System.out.println("Server started");
            System.out.println("Waiting for the client...");

            socket = server.accept(); // accept the clien to connect
            System.out.println("Client accepted");

            input = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            String msg = "";
            // Scanner while loop --> taking input --> sending to the client
            while (!(msg=input.readUTF()).equals("end")) {
                System.out.println(msg);
            }
            System.out.println("Connection closed");
            socket.close();
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        server s = new server(9000);
    }
}

