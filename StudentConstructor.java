package ConstructorPack;

public class StudentConstructor {

	int id;
	String name;
	public StudentConstructor(int i, String n) 
	{
		id=i;
		name=n;
	}
	void display()
	{
		System.out.println(id+""+name);
	}
	
	public static void main(String[] args) 
	{
		StudentConstructor sc=new StudentConstructor(101, " Sandy");
		StudentConstructor sc1=new StudentConstructor(102, " Basith");
		StudentConstructor sc2=new StudentConstructor(103, " Vishwa");
		sc.display();
		sc1.display();
		sc2.display();
	
	}

}
