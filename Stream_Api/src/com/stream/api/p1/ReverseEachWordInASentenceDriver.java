package com.stream.api.p1;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ReverseEachWordInASentenceDriver {
	public static void main(String[] args) {
		String senetence = "Kodeala Academy";
//	List<Character> s22 = 	senetence.
//	System.out.println("s22 : " + s22 );
		String revSenetnce = Arrays.stream(senetence.split(" ")).map( w -> new StringBuilder().reverse().toString()).collect(Collectors.joining());
		System.out.println(revSenetnce);
	}

}
