package com.map.questions.identityhashmapdemo.main_work;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
public class IdentityHashMapForRefrences {

		public static void main(String[] args) {
			String k1 = new String("Key");
			String k2 = new String("Key");
			Map<String , Integer> m1 = new IdentityHashMap<String, Integer>();
			m1.put(k1, 2);
			m1.put(k2, 3);
			System.out.println(m1);
			System.out.println(System.identityHashCode(k1));
			System.out.println(System.identityHashCode(k2));
			System.out.println(k1.hashCode());
			System.out.println(k2.hashCode());
	}

	
}
