package com.sabhari.RMI;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class ClientRMI {
    private ClientRMI(){}
    public static void main(String[] args) throws Exception {
        Registry registry = LocateRegistry.getRegistry(null);
        CalcI stub = (CalcI) registry.lookup("calc");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers");
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.println("Their sum is "+stub.add(x,y));
        System.out.println("Their difference is "+stub.sub(x,y));
    }
}
