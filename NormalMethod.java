package ConstructorPack;

public class NormalMethod {
	
	static int a=10;
	int b=20;
	void display()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	static void staticDisplay(int a,int b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NormalMethod nm=new NormalMethod();
		nm.display();
		// nm.staticDisplay();  //No need to call the obj explicitly
		staticDisplay(2,21);
		
		

	}

}
