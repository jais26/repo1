package Classes;

import java.util.Scanner;

public class Swaping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter two names");
		
		System.out.println("Name is ");
		String name = sc.next();
		System.out.println("Surname is ");
		String surname = sc.next();
//		String swap = sc.next();

		System.out.println("First number is ");
		int a = sc.nextInt();
		System.out.println("Second number is ");
		int b = sc.nextInt();
		
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		String swap = name;
		name = surname;
		surname = swap;
		
		System.out.println("print swap string values " +name+ " - " +surname);
		System.out.println("print swap interger value " +a+ " - " +b);
	}

}
