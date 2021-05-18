package com.qa.java.StringDemo;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myStr1 = "yesterday it was raining ";
		String myStr2 = "today it is sunny, ";
		String myFull = myStr2.concat(myStr1);
		System.out.println(myFull);
		String upper = myFull.toUpperCase();
		System.out.println(upper);
		
		String mySubString1 = myStr2.substring(0, 11);
		 String mySubString2 = myStr1.substring(16, 24);
		 System.out.println(mySubString1 + mySubString2);
		
		String myStrir3 = "Amet Fatim hanna mame";
		System.out.println(myStrir3.length());
		
		StringCount.toVerticalWords("Ametelwokil");
		String st1 = "My name is Ametelwokil";
		String st2 = "name";
				
		System.out.println(StringCount.toMessage(st1, st2));
		

}
}
