package com.Serialization.src.desrilazation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.Serialization.src.Account;

public class Driver2 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ObjectInputStream Ois = new ObjectInputStream(new FileInputStream("acc.ser"));
		Account acc1 = (Account) Ois.readObject();
		System.out.println(acc1.getBalance1());

	}

}
