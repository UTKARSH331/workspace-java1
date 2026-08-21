package com.cricbuzz;

public class Cricbuzz {
	
	private String userName;
	private int scoreCard;
	private String emailId;
	
	static
	{
	   System.out.println("SIB");
	}
	
	
	{
		System.out.println("IIb");
		
	}
	
	public Cricbuzz(int _scoreCard) 
	{
		this.scoreCard = _scoreCard;
		System.out.println("user-1");
	}
	
	public Cricbuzz(String _userName, int _scoreCard, String _emailId) 
	{
		super();
		this.userName = _userName;
		this.scoreCard = _scoreCard; 
		this.emailId = _emailId;
		System.out.println("user-2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cricbuzz user1 = new Cricbuzz(5664);
		

		Cricbuzz user2 = new Cricbuzz("hgfvhgh", 65776, "yfuy");
		
        System.out.println("main method");
	}

}
