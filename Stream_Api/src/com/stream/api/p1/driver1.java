package com.stream.api.p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class driver1 {
	public static void main(String[] args) {
		List< Integer> l1 = Arrays.asList(1, 34, 55,78,91,012);
	int firstNo =	l1.stream().sorted((a,b) -> (b-a)).skip(1).findFirst().get();
	System.out.println(firstNo);
		
	}

}
