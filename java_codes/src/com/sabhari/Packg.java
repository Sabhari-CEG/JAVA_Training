package com.sabhari;

public class Packg{
    public static void main(String[] args){
        Check obj = new Check();
        Check.disp();
        System.out.println(obj.a);

    }
}
 class Check {
     static void disp(){
         System.out.println("Procted class method");

     }
     int a = 35;
}

