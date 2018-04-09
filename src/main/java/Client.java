package main.java;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        int port = 1234;
        try {
            Socket socket = new Socket("localhost", port);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            DataOutputStream oos = new DataOutputStream(socket.getOutputStream());
            DataInputStream ois = new DataInputStream(socket.getInputStream());
            {
                System.out.printf("Client connected to socket.");
                System.out.println();
                System.out.println("Client writing channel = oos & reading channel = ois initialized.");

                while (!socket.isOutputShutdown()) ;
                if (br.ready()) {
                    System.out.println("Client start writing in channel...");
                    Thread.sleep(200);
                    String client = br.readLine();
                    oos.writeUTF(client);
                }
            }
        }
        catch (Exception e){

        }
    }
}
