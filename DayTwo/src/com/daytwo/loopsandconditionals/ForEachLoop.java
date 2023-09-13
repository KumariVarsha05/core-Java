package com.daytwo.loopsandconditionals;

public class ForEachLoop {

	public static void main(String[] args) {

	    //for integer array
	     int a[]= {10,20,30,40,50};
	     
	     for(int i:a)
	     {
	    	System.out.println(i); 
	     }
	     System.out.println();
	     
	     
	    //for char array
	     char ch[]= {'j','a','v','a'};
	     
	     for(char i:ch)
	     {
	    	System.out.print(i); 
	     }
	     System.out.println();
	     System.out.println();

	     
	   //for String array
	     String s[]= {"Java","Programming","Learning"};
	     
	     for(String i:s)
	     {
	    	System.out.println(i); 
	     }

	}

}
