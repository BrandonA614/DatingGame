import java.util.ArrayList;

public class Candidates
{

	static ArrayList <Choice> Choices = new ArrayList <Choice>();
	
	public static void People(){
		
		
		Choices.add(new Choice("Marsha ", 35, "5'6","New York"));
		Choices.add(new Choice("Jean", 27, "5'2", "Denver"));
		Choices.add(new Choice("Brooke", 29, "5'2", "Aurora"));
		Choices.add(new Choice("Samantha", 34, "5'8","Sheridan"));
		Choices.add(new Choice("Maddy", 32, "4'11", "Longmont"));
		Choices.add(new Choice("Katarina", 25, "5'3", "Denver"));
		Choices.add(new Choice("Jenn", 35, "5 4", "Downtown"));
	}

	public static void printSamantha(){
		
		System.out.println(Choices.get(3).getAge());
		System.out.println(Choices.get(3).getName());
		System.out.println(Choices.get(3).getHeight());
		System.out.println(Choices.get(3).getLocation());
		System.out.println("________________");
		
		
	}
	
	
	public static void printMaddy(){
		System.out.println(Choices.get(4).getAge());
		System.out.println(Choices.get(4).getName());
		System.out.println(Choices.get(4).getHeight());
		System.out.println(Choices.get(4).getLocation());
		System.out.println("________________");
		
		
	}
	public static void printMarsha(){
		System.out.println(Choices.get(0).getName());
		System.out.println(Choices.get(0).getAge());
		System.out.println(Choices.get(0).getHeight());
		System.out.println(Choices.get(0).getLocation());
		System.out.println("________________");
	}
			
	public static void printJean(){
		System.out.println(Choices.get(1).getName());
		System.out.println(Choices.get(1).getAge());
		System.out.println(Choices.get(1).getHeight());
		System.out.println(Choices.get(1).getLocation());
		System.out.println("________________");
	}
	public static void printBrooke(){
		
		System.out.println(Choices.get(2).getName());
		System.out.println(Choices.get(2).getAge());
		System.out.println(Choices.get(2).getHeight());
		System.out.println(Choices.get(2).getLocation());
		System.out.println("________________");
	}
		
}
	
