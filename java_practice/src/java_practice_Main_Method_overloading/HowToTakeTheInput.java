package java_practice_Main_Method_overloading;

import java.io.IOException;

public class HowToTakeTheInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		int c = 0;
		while((c = System.in.read())!='n') {
			sb.append(c);
			System.out.println(sb);
		}

	}

}
