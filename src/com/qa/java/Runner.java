package com.qa.java;

public class Runner {

	public static void main(String[] args) {
		
System.out.println(UniqueSum.uniquesum(1, 2, 3));
System.out.println(UniqueSum.uniquesum(3, 3, 3));
System.out.println(UniqueSum.uniquesum(1, 1, 2));
		
	
      
 //Result class
 
Results.displayOverallPassMark();
System.out.println(FlowCharts.getAnumber(7, 9, false)); 

 
		
System.out.println(BlackJack.blackjack(21, 21));	
		

//FlowCharts.flowchart(6000);

//Loop.Numbers();



System.out.println(Taxes.getNetIncome(60000)); 
System.out.println(Taxes.getTax(60000));


//Calculator CLASS
//     int result = Calculator.add(6, 9);
//     System.out.println(result);
//   int sum =  Calculator.add(10, 20);
//   System.out.println(sum);
//   
//	int product = Calculator. mult(34, 89);
//	System.out.println(product);
//	
//	int diffr = Calculator.sub(7, 9);
//	System.out.println(diffr);
//	
//       Calculator.div(1, 4);	
	 
	}

}
