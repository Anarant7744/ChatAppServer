package main.java;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        ServerSocket socketListener = new ServerSocket(1234);
        while (true){
            Socket client = null;
            while (client == null){
                client = socketListener.accept();
                System.out.println("Client was connected");
            }
        }

        }
    }
