package ConstructorPack;
//Switch(expression)

enum Month{JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT,NOV,DEC;}
enum Bikes{HERO, HONDA, YAMAHA, BAJAJ, JAVA, BMW, SUZUKI, TVS};
public class SwitchCase {
	public static void main(String args[]) {
		
		int a=30;
		
		switch(a) {
		
		case 10:
			System.out.println("The value of a is 10");
			break;
		
		case 20:
			System.out.println("The value of b is 20");
			break;
			
		case 30:
			System.out.println("The value of c is 30");
			break;
			
		default:
			System.out.println("Invalid");
		
		}
		
		char attendance = 'P';
		
		switch(attendance) {
		
		case 'P':
			System.out.println("Present");
			break;
			
		case 'A':
			System.out.println("Absent");
			break;
			
		case 'O':
			System.out.println("On-Duty");
			break;
			
		default:
			System.out.println("Invalid");
		}
		
		
//SwitchString:
		String levelString="Expert";
		int level=3;
		//Used String in expression
		switch(levelString) {
		
		case "Beginner":level=1;
		break;
		
		case "Intermediate":level=2;
		break;
		
		case "Expert":level=3;
		break;
		
		default:level=0;
		break;
		}
		
		System.out.println("Your level is "+level);
		
//NestedSwitch:
		
		char branch='C';
		int collageYear=2;
		switch(collageYear)
		{
		case 1:
			System.out.println("English,Maths,Science");
			break;
			
		case 2:
			switch(branch) {
		case 'C':
		{
			System.out.println("Operating System, Java, Data Structure");
			break;
			}
		
		case 'E':
			System.out.println("Microprocessor, Logic Switching");
			break;
			
		case 'M':
			System.out.println("Manufacturing Machine");
			break;
		}
		break;
		
		case 3:
			switch(branch) {
			case 'C':
				System.out.println("Computer Organisation");
				break;
				
			case 'E':
				System.out.println("Electronics");
				break;
				
			case 'M':
				System.out.println("Mechanicak Department");
				break;
			}
		}
		
		
//Enumeration (It is a case used in the Switch)
		
//Enum will be used outside the class
		
		Month m=Month.MAY;
		System.out.println(m);
		
		Bikes b;
		b=Bikes.BMW;
		switch(b)
		{
		case HONDA:
			System.out.println("Hurray! You have chosen Honda!");
			break;
			
		case HERO:
			System.out.println("Hurray! You have chosen Hero!");
			break;
			
		case YAMAHA:
			System.out.println("Hurray! You have chosen Yamaha!");
			break;
			
		case BAJAJ:
			System.out.println("Hurray! You have chosen Bajaj!");
			break;
			
		case JAVA:
			System.out.println("Hurray! You have chosen JAVA!");
			break;
		
		case BMW:
			System.out.println("Hurray! You have chosen BMW!");
			break;
			
		case SUZUKI:
			System.out.println("Hurray! You have chosen Suzuki!");
			break;
			
		case TVS:
			System.out.println("Hurray! You have chosen TVS!");
			break;
			
		default:
			System.out.println("Hurray! You have not chosen in the list");
			break;
		}
	}
}
