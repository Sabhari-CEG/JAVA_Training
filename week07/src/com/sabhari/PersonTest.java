package com.sabhari;

import java.io.*;
import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        byte i;
        System.out.println("Enter the valid number\n1.Add a football player\n2.Add a cricketer\n");
        i = input.nextByte();
        if(i == 1){
            System.out.println("Enter the player name , age , height , weight , team name , uniform no , no of goals");
            String name = input.next();
            int age = input.nextInt();
            double height = input.nextDouble();
            double weight = input.nextDouble();
            String team = input.next();
            int no = input.nextInt();
            int goals = input.nextInt();
            FootballPlayer fp = new FootballPlayer(name,age,height,weight,team,no,goals);
            //String t = fp.toString();
            PersonTest.Writeintofile(fp);
        }

        else if(i == 2){
            System.out.println("enter the player name, age , height , weight , country name , role , no of wickets , no of runs");
            String name = input.next();
            int age = input.nextInt();
            double height = input.nextDouble();
            double weight = input.nextDouble();
            String country = input.next();
            String role = input.next();
            int noOfWick = input.nextInt();
            int noOfRuns = input.nextInt();
            Cricketer ck = new Cricketer(name,age,height,weight,country,role,noOfWick,noOfRuns);
            //String t = ck.toString();
            PersonTest.Writeintofile(ck);
        }

    }
    public static void Writeintofile(Person obj) throws IOException {
        FileOutputStream out = null;
        FileInputStream in = null;
        ObjectOutputStream objout = null;
        ObjectInputStream objin = null;
        Person data = null;
        try{
            out = new FileOutputStream("G:\\java\\week07\\src\\com\\sabhari\\obj.txt",true);
            in = new FileInputStream("G:\\java\\week07\\src\\com\\sabhari\\obj.txt");
            objout = new ObjectOutputStream(out);
            objin = new ObjectInputStream(in);
            System.out.println("serialized object is sent to the file");
            objout.writeObject(obj);
            System.out.println("The object that is deserialized is");
            data = (Person) objin.readObject();
            System.out.println(data.toString());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            out.close();
            objout.close();
            in.close();
            objin.close();
        }



        }
}
