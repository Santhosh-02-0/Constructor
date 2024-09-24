package ConstructorPack;

public class MethodUsingSkeletonPara {

	public int subNumbers(int x,int y)
	{
		int sub=x-y;
		//return value
		return sub;
	}
	
	public int addNumbers(int x, int y)
	{
		int add=x+y;
		return add;
	}
	
	public int mulNumbers(int x, int y)
	{
		int mul=x*y;
		return mul;
	}
	
	public int divNumbers(int x, int y)
	{
		int div=x/y;
		return div;
	}
	public static void main(String[] args) 
	{
		int num1=4, num2=2;
		MethodUsingSkeletonPara obj = new MethodUsingSkeletonPara();
		//Calling the method
		int outcome=obj.subNumbers(num1, num2); //arguments
		int outcome1=obj.addNumbers(num1, num2);
		int outcome2=obj.mulNumbers(num1, num2);
		int outcome3=obj.divNumbers(num1, num2);
		System.out.println("The Result is :" +outcome);
		System.out.println("The Result is :" +outcome1);
		System.out.println("The Result is :" +outcome2);
		System.out.println("The Result is :" +outcome3);
	}

}
