package com.sabhari;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;

public class Client1 {

	public static void main(String[] args) throws IOException {
		String library = "Main Central  Library";
		String LenderName = "Ravi";
		ArrayList<Integer> BooksBorrowed = new ArrayList<Integer>();
		//The int parameter of BooksBorrowed indicates the ISSCN code of book
		BooksBorrowed.add(12345);
		BooksBorrowed.add(18963);
		BooksBorrowed.add(98201);
		System.out.println("Client started to send data.....");
		Socket soc = new Socket("localhost",5000);
		System.out.println("Client connected to " + soc.getRemoteSocketAddress());
		DataOutputStream out = new DataOutputStream(soc.getOutputStream());
		out.writeUTF(library);
		out.writeUTF(LenderName);
		out.writeUTF(String.valueOf(BooksBorrowed.size()));
		for (int i = 0; i < BooksBorrowed.size(); i++) {
			out.writeUTF(String.valueOf(BooksBorrowed.get(i)));
		}
		System.out.println("sent to server succesfully...");
		out.flush();
		out.close();
		soc.close();
	}
}


