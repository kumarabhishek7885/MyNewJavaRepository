package myPackage;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		int age;
		Scanner obj = new Scanner(System.in);
		
		char ch='i';
		
		do 
		{
			System.out.println("Enter your Age:");
			age=obj.nextInt();
			
			if(age<=0 || age>100)
			{
				System.out.println("Please Enter Valid Age");
			}
			else
			{
				System.out.println("Valid Age");
				ch = 'v';	
			}
		}while(ch!='v');
		obj.close();
		

	}

}
