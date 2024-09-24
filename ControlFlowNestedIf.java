package ConstructorPack;

//import java.util.Scanner;

public class ControlFlowNestedIf {
	//static Scanner sc = new Scanner(Sysetm.in);
	public static void main(String args[]) {
		
		//System.out.println("Enter The Number: ");
		//int avg=sc.nextInt();
		
		int avg=99;
		if(avg<50) 
		{
			System.out.println("You are Fail");
		}
		
		else if(avg>=50 && avg<=60)
		{
			System.out.println("You are D Grade");
		}
		
		else if(avg>60 && avg<=70)
		{
			System.out.println("You are C Grade");
		}
		
		else if(avg>70 && avg<=80)
		{
			System.out.println("You are B Grade");
		}
		
		else if(avg>80 && avg<=90)
		{
			System.out.println("You are A Grade");
		}
		
		else if(avg>90 && avg<=100)
		{
			System.out.println("You are O Grade");
		}
		
		else {
			System.out.println("Invalid");
		}
		
		int age=20, weight=49;
		
		if(age>=18)
		{
			if(weight>50)
			System.out.println("You are eligible to donate blood");
			else
			{
				System.out.println("You must be more than 50kgs to donate blood");
			}
		}
		
		else 
		{
			System.out.println("You are not eligible to donate blood");
		}
		
	}
}
