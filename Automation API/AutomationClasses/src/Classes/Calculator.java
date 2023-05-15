package Classes;

import java.util.Scanner;

public class Calculator {

	private static final Object Y = null;
	private static final Object N = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String yesno;
	do
	{
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter second number ");
		int num2 = sc.nextInt();
		System.out.println("Enter operator sybmbol + - * / %  ");
		String operator = sc.next();
		int result;
		switch(operator)
		{
		
		case "+" : result=num1+num2;
		         System.out.println("Additon is " +result );	
		         break;
		case "-" : result=num1-num2;
		         System.out.println("Additon is " +result );
		         break;
		case "*" : result=num1*num2;
		         System.out.println("Additon is " +result );
		         break;
		case "/" : result=num1/num2;
            	 System.out.println("Additon is " +result );
            	 break;
		case "%" : result=num1%num2;
		         System.out.println("Additon is " +result );
		         break;
		default : System.out.println("invalid operator");
		         break;
	}	
		System.out.println("Do you want to contineou (press Y for yes and N for no ");
		yesno=sc.next();
	}
	while(yesno.equals("Y") || yesno.equals("y"));

	}
	}
	
		
	
