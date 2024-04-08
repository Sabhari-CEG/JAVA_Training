package com.sabhari;
import java.io.*;
public class FileCopying {

    public static void main(String[] args) throws IOException{
        FileInputStream in = null;
        FileOutputStream out = null;

        try{
            in = new FileInputStream("G:\\java\\week07\\src\\com\\sabhari\\original.txt");
            out = new FileOutputStream("G:\\java\\week07\\src\\com\\sabhari\\copy.txt");
            int t;
            System.out.println("Contents that are copying");
            while((t = in.read()) != -1) {
                System.out.printf("%c",t);
                out.write(t);
            }
            System.out.println("copied to the destination file without any error");
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            in.close();
            out.close();
        }
    }
}
