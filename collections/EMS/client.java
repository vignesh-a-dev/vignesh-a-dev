package collections.EMS;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import collections.listex;

public class client {
    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream out = null;


    public client(String address, int port) {
        try {
            socket = new Socket(address, port);
            System.out.println("Connected");

            input = new DataInputStream(System.in);
            out = new DataOutputStream(socket.getOutputStream());

            out.writeUTF("Hello from client!!");
            // Scanner while loop --> reading output --> to the console

            Scanner sc = new Scanner(System.in);
            String msg = "";
            while (!msg.equals("end")) {
                System.out.print("Enter the msg: ");
                msg = sc.nextLine();

                out.writeUTF(msg);
            }
            sc.close();
            input.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        client c = new client("127.0.0.1", 9000);
    }
}
