package com.copy.on.write.arrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyOnWriteArrayList<String> ele = new CopyOnWriteArrayList<String>();
		ele.add("2");
		ele.add("5");
		ele.add("10");
		ele.add("6");
		ele.add("1");
		
	Iterator<String > itr = ele.iterator();
	while(itr.hasNext()) {
		String element = itr.next();
		
		System.out.println(element);
		ele.equals(itr);
	    
		ele.remove(2);
	}

	}

}
