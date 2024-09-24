package ConstructorPack;

public class ConstructorOverLoading {

	int id;
	String name;
	int age;
	
	ConstructorOverLoading(int i, String n,int a)
	{
		id=i;
		name=n;
		age=a;
	}
	
	void display()
	{
		System.out.println(id+""+name+""+age);
	}
	public static void main(String[] args) 
	{
		ConstructorOverLoading st=new ConstructorOverLoading(1, " Sandy ", 24);
		ConstructorOverLoading st1=new ConstructorOverLoading(2, " Santhosh ", 24);
		st.display();
		st1.display();

	}

}
