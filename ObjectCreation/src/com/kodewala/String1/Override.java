package com.kodewala.String1;

public class Override {
	int amount = 200;

	 class test extends Object{
		public void doSOmething() {
			System.out.println("test.doSomething");
			System.out.println("test.doSomething amount "+ amount);
		}
	}
	class Account extends test{
		public void doSOmething() {
			amount = 300;
			System.out.println("test.doSomething ");
			System.out.println("test.doSomething amount "+ amount);
		}
	}
	class Account2 extends Account{
		public void doSOmething() {
			final int amount = 400;
			System.out.println("test.doSomething ");
			System.out.println("test.doSomething amount "+ amount);
		}
	}
	

}
