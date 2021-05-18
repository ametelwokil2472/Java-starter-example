package com.qa.java;

public class LoopFlowChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     for ( int A = 100; A < 200; A++) {
    	// System.out.println(A);
     }
     for ( int A = 100; A<=200; A++) {
    	 if (A%2==0)
    	 System.out.println(A);
     }
     getTenTims();
	}
	public static void getTenTims() {
		int  iteration = 1;
	      while(iteration<=10)
	       {
	           int count= 1;
	           while(count<=10)
	           {
	               System.out.print(count + " ");
	               count++;
	           }
	           System.out.print("\n");
	           iteration++;
	       }
	    }
	}
	