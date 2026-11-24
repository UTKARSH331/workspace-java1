package com.stream.api.p1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindAllDuplicatesInaListDriverP2 {
public static void main(String[] args) {
	List<Integer> l1 = Arrays.asList(1,34,34,2,5,6,33,789,89,2,9,1);
	Set<Integer> l22 = l1.stream().filter(n -> Collections.frequency(l1, n) > 1).collect(Collectors.toSet());
	System.out.println("l22 : " + l22);
}

}
