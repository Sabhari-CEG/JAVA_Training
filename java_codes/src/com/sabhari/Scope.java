package com.sabhari;

//private class PriClass{
  //  static void display(){
    //    System.out.println("Private class method");
    //}
//}

class PriMet{
    private static void PrivateMethod(){
        System.out.println("This is a private method");
    }
}

class PriVAr{
    private int a = 35;
}
public class Scope {
    public static void main(String[] args) {
       PriVAr variable = new PriVAr();
        System.out.println(variable.PriVAr);


        PriMet method = new PriMet();
        method.PrivateMethod();

        //PriClass cls = new PriClass();
      //  cls.display();
    }
}