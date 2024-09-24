package ConstructorPack;

public class MethodFun {
	
	//Using static method
	private static int getSquare(int x) 
	{
		return x*x;
	}

	public static void main(String args[]) 
	{
		//access modifier returntype funname(int, int, String);
		//public void func(int, int);
		//void func(double);
		//void func(int);
		
		for(int i=1; i<=10; i++) 
		{
		
			//Direct Method call
			int result=getSquare(i);
			System.out.println("Square of i is " +i+"-> "+ result);
		}
		
		//Method call using obj
		MethodFun mf=new MethodFun();
		int number=mf.getSquare(11);
		System.out.println();
		System.out.println("The Value is " + number);
		
		
	}
}
