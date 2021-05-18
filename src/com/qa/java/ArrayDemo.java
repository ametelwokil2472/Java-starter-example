package com.qa.java;

public class ArrayDemo {
	public static void main(String[] args) {
        int[] anArray = {7 , 6, 10, 28, 55, 40, 89, 19,10, 19};        // declare an array of integers

        
        // assign a value to each array element and print 
        for (int i = 0; i < anArray.length; i++) {
           
            System.out.print(anArray[i] + " ");
            
        }
        for(int j = 0; j<  anArray.length; j++ ) {
        	System.out.println(anArray[j]*10);
        }
        System.out.println();
    }
	
}