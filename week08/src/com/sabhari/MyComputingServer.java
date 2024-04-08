package com.sabhari;

import javax.xml.crypto.Data;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyComputingServer {
    public static void main(String[] args){
        try{
            System.out.println("Server started");
            ServerSocket sos = new ServerSocket(5000);
            Socket soc = sos.accept();
            System.out.println("Server accepcts from " + soc.getRemoteSocketAddress());

            DataInputStream dis = new DataInputStream(soc.getInputStream());
            int sum = 0,i=1,temp;
            String t;
            while(i<=10){
                t = dis.readUTF();
                System.out.println("The number is \n" +t);
                temp = Integer.parseInt(t);
                sum += temp;
                i++;
            }
            System.out.println("The calculated and sent back is "+sum);
            DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
            String res = Integer.toString(sum);
            dos.writeUTF(res);
            dos.flush();
            dos.close();
            sos.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
