package com.sabhari.RMI;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServerRMI extends CalcClass{
    public ServerRMI(){}
    public static void main(String[] args) throws RemoteException, MalformedURLException, AlreadyBoundException {
        CalcClass calculate = new CalcClass();
        CalcI stub = (CalcI) UnicastRemoteObject.exportObject(calculate,0);
        Registry registry = LocateRegistry.getRegistry();
        registry.bind("calc",stub);
        System.out.println("Server ready!!!");
    }
}
