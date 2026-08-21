package com.Serialization.src;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		Account acc = new Account(12000, "Utkarsh", "Abc", "BLR");
		ObjectOutputStream Oos = new ObjectOutputStream(new FileOutputStream("acc.ser"));
		Oos.writeObject(acc);

	}

}
