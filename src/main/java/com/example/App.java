package com.example;

public class App 
{
    public static int add(int a,int b){
	return a+b;
    }
    
    public static int div(int a,int b){
	if(b==0){
	  throw new IllegalArgumentException("You cannot divide by zero");
        }
	return a/b;
    }
    public static void main( String[] args )
    {
        System.out.println( "Sum: "+add(2,3) );
	System.out.println("Div: "+div(6,2) );
    }
}
