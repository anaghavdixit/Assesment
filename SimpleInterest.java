package com.lulu.assesment;

public class SimpleInterest {
	/*Q1)WAP to find SI also display total amount to be paid after
	 *  Loan duration ends.(Take Static Initialization of various Variabes)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        float p=10000,r=20;
        int t=3;
         
        float SI=(p*t*r)/100;
        float amount=SI+p;
        System.out.println("Total Amount to be paid: " + amount);
	}

}
