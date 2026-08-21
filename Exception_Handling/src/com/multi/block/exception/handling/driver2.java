package com.multi.block.exception.handling;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.ObjectInputStream;


public class driver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try(ObjectInputStream ois = new ObjectInputStream (new FileInputStream("main.txt"));){
        	System.out.println("multi_catch block via try");
        } catch( ArithmeticException| NullPointerException | IOException e) {
        	System.out.println("maulti catch exception in catch");
        	e.printStackTrace();
        } 
	}

}
