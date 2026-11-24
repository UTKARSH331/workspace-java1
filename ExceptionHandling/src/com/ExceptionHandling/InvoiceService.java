package com.ExceptionHandling;

public class InvoiceService {
	// Get
	
	public void generateInvoiceservice() {
		
		try {
			connectDatabase();
			String name = "null";
			name.lastIndexOf("a");
			System.out.println("generating an invoices ");
			closeDbConnection();
		}
		catch(Exception e) {
			System.out.println("some exception ");
			e.printStackTrace();
		}
		finally {
			System.out.println("i am inside the finally");
		}
	}

	private void closeDbConnection() {
		// TODO Auto-generated method stub
		System.out.println("connection close to db");
		
	}

	private void connectDatabase() {
		// TODO Auto-generated method stub
		System.out.println("connectiing to db");
		
	}

}
