package com.kodewala.string.questions;
import java.util.ArrayList;

// it takes 1 hrs 
public class To_do_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ans = new ArrayList<>();
		
		
    int addTaskelement = Integer.parseInt(args[0]);
		
		for (int i =0; i<=addTaskelement; i++) {
			if(addTaskelement > 0) {
				ans.add(args[i]);
			}
		}
				//System.out.println(ans.add(s4str));
				System.out.println("Element_no " + ans);
				
			
		
	//	for deletion
		int remove_no = Integer.parseInt(args[addTaskelement+1]);
		ans.remove(remove_no);
		System.out.println("After_delete " + ans);
		
		// for  update 
		int updateNO = Integer.parseInt(args[addTaskelement+2]);
		
		String updateElement = args[addTaskelement+3];
		
		ans.set(updateNO, updateElement);
		System.out.println(" After update "+ans);
		
		// Count tasks
		
		int count = Integer.parseInt(args[ addTaskelement + 4]);
		System.out.println("count " + ans.size());
		
		// reverse tasks
		//String str = args[]
	//	StringBuffer ansReverse = new StringBuffer(ans).reverse().toString();
		//StringBuffer ansReverse = new StringBuffer (ans.get(i)).reverse(); 
		//String ansReverse = new StringBuffer(ans.get(i)).reverse().toString();
		for (int i = 0; i < ans.size(); i++) {
		    String reversed = new StringBuffer(ans.get(i)).reverse().toString();
		    System.out.println(reversed);
		}
		
		
		
		//Remove a task by name
		
		for(int i = 0; i<ans.size(); i++) {
			if(ans.remove("Buy_milk")) {
				System.out.println("removeed_success_fully ");
			} else {
				System.out.println("not_removeed_success_fully ");
			}
		}
		
		
		
		//String s1str =  args[0]; // buy_milk
	//	String s2str =  args[1]; // //buy_biscuit
		/*String s3str =  args[0]; // 5
		String s4str =  args[1]; // okk - done - bye */
		//int dleteItems = Integer.parseInt(args[2]);
		
		//int setItemsnumber = Integer.parseInt(args[3]);
		
	/*	String setItemsnames = args[4];
		ArrayList<String> ans = new ArrayList<>();
		
		int addTaskelement = Integer.parseInt(s3str);
		
		for (int i =0; i<=addTaskelement; i++) {
			if(addTaskelement > 0) {
				System.out.println(s4str = args[i]);
				System.out.println(ans.add(s4str));
				
			}
		}
		System.out.println(ans.remove(setItemsnumber));
		System.out.println(ans.set(setItemsnumber, setItemsnames));
		
		
		/*StringBuffer addTask = new StringBuffer(s4str);
		addTask.append(s4str);
		System.out.println(addTask);
		//addTask.append(s2str);
	//	System.out.println(addTask);
	//	addTask.append(s4str);
		//System.out.println(addTask);*/ 
		
		
		

	}

}
