package com.ExceptionHandling;

public class Driver {
	// when jvm crashes then no finnaly work
	public static void main(String[] args) {
		InvoiceService inv = new InvoiceService();
		inv.generateInvoiceservice();
	}

}
