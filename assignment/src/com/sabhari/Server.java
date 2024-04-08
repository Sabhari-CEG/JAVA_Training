package com.sabhari;
//server is designed to handel atleast 3 clients simultaneously

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.*;

public class Server extends Thread {
    private static ServerSocket sos;

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Server ready.....");
        sos = new ServerSocket(5000);
        Server thread1 = new Server();
        thread1.start();
        thread1.join();
        Server thread2 = new Server();
        thread2.start();
        thread2.join();
        Server thread3 = new Server();
        thread3.start();
        thread3.join();
        sos.close();
    }

    @Override
    public void run() {
        Socket soc = null;
        String Library = null;
        String LenderName = null;
        String url = "jdbc:mysql://localhost/java?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String UserName = "sabhari";
        String PassWord = "2000";
        try {
            soc = sos.accept();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Server accepcts from " + soc.getRemoteSocketAddress());
        DataInputStream dis = null;
        try {
            dis = new DataInputStream(soc.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Error in Registering jdbc");
        }


        try {
            Library = dis.readUTF();
            System.out.println("Library name = " + Library);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            LenderName = dis.readUTF();
            System.out.println("Lender name = " + LenderName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String cn = null;
        try {
            cn = dis.readUTF();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int count = Integer.parseInt(cn);
        String BookNo = "";
        for (int i = 0; i < count; i++) {
            String temp = null;
            try {
                temp = dis.readUTF();
                BookNo = BookNo + " " + temp;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
            System.out.println("Lended books = "+BookNo);
            String query = "INSERT INTO library (LibraryName, LenderName, BooksLended) VALUES (\"" + Library + "\",\"" + LenderName + "\",\""+BookNo+"\");";
        Connection con = null;
        try {
             con = DriverManager.getConnection(url,UserName,PassWord);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("Error in connecting to jdbc");
        }
        if (con != null)
            System.out.println("Succesfully connected to jdbc");
        Statement st = null;
        try {
             st = con.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("Error in statement");
        }
        int affected = 0;
        try {
            affected = st.executeUpdate(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("Error in entering into table");
        }
        System.out.println(affected + "rows were affected");
        try {
            st.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}

