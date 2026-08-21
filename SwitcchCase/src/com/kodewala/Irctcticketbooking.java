package com.kodewala;

public class Irctcticketbooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ticketsstr  = args[0];
		
		int tickets = Integer.parseInt(ticketsstr);
		String Usertype  = args[1];
		Irctcticketbooking.Ticketnumbers(tickets, Usertype );

	}
	private static void Ticketnumbers(int tickets, String Usertype ) 
	{
		
		String refrences;
		switch (Usertype.toLowerCase()) {
		case "agent":
			if (tickets > 0) 
			{
				refrences = "user type is agent ";
			} else {
				refrences = "not known ";
			}
			break;
		case "retail":
			if (tickets >0 && tickets <= 6) 
			{
				refrences = "user type is retail ";
			} else {
				refrences = "user type is not available  ";
			}
			break;
			default:
				refrences = "usertype is not available  ";
		}
		
		System.out.println(refrences);
	
	}
	
	

}
