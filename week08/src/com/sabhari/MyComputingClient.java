package com.sabhari;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class MyComputingClient {

    public static void main(String[] args) {
	try{
        System.out.println("Client started");
        Socket soc = new Socket("localhost",5000);
        System.out.println("Client gets connected to " + soc.getRemoteSocketAddress());
        DataOutputStream out = new DataOutputStream(soc.getOutputStream());
        Scanner input = new Scanner(System.in);
        int i = 1;
        String k;
        while(i <= 10){
            System.out.printf("Enter %d th number\n",i);
            k = input.next();
            out.writeUTF(k);
            i++;
        }
        DataInputStream ans = new DataInputStream(soc.getInputStream());
        String sum = ans.readUTF();
        System.out.println("The sum of ten  numbers are " +sum);
        out.flush();
        out.close();
        soc.close();
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    }
}
