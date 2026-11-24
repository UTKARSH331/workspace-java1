package e_comm.e_comm;

/**
 * Hello world!
 */

public class DiscountCalaculator{
	public int calculateDiscount(int amount, String type, int discount) {
		int finalAmount = 0;
		try{
		//	type = type.toLowerCase();
			switch(type){
			case "REGULAR":
				finalAmount = amount - (amount * discount ) /100;
				break;
				
			case "GOLD":
				finalAmount = amount - (amount * discount ) /100 - 100;
				break;
			case "PLATINUM":
				finalAmount = amount - (amount * discount ) /100 - 50;
				break;
		
				
			default :
				finalAmount = amount;
				break;
			}
			// he is doing some changes there 
		}catch(Exception e) {
				e.printStackTrace();
			}
			return finalAmount;
			
		}
		
	}
