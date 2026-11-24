package com.bit.manipulation.basic;

public class Driver {
	public int divide(int dividened, int divisior) {
		if(dividened == divisior) return 1;
		if(dividened == Integer.MIN_VALUE  && divisior == -1 ) return Integer.MAX_VALUE;
		if(divisior == 1) return dividened;
		boolean isPositive  = true;
		// updating the sign of quotients
		if( dividened >=0 && divisior <0) isPositive = false;
		if(dividened < 0 && divisior > 0) isPositive = false;
		long n = dividened;
		long d = divisior;
		n = Math.abs(n);
		d = Math.abs(d);
		long ans= 0, sum =0;
		while(sum + d <= n) {
			ans ++;
			sum += d;
		}
		if(ans > Integer.MAX_VALUE && isPositive) return Integer.MAX_VALUE;
		if(ans > Integer.MAX_VALUE && !isPositive) return Integer.MIN_VALUE;
		return isPositive? (int )ans: (int )(-1*ans);
				

        }
}