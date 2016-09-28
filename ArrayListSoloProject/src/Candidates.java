import java.util.ArrayList;

public class Candidates
{

	static ArrayList <Choice> Choices = new ArrayList <Choice>();
	
	public static void People(){
		
		
		Choices.add(new Choice("Marsha ", 35, "5'6","New York" , "Description here"));
		Choices.add(new Choice("Jean", 27, "5'2", "Denver", "Description here"));
		Choices.add(new Choice("Brooke", 29, "5'2", "Aurora","Description here"));
		Choices.add(new Choice("Samantha", 34, "5'8","Sheridan", "Descritption here"));
		Choices.add(new Choice("Maddy", 32, "4'11", "Longmont", "Description here"));
		Choices.add(new Choice("Katarina", 25, "5'3", "Denver", "Description here"));
		Choices.add(new Choice("Jenn", 35, "5'4", "Downtown" , "Description here"));
		Choices.add(new Choice("Madison", 22, "5'2","Aspen", "Description here" ));
		Choices.add(new Choice("Jennifer", 24, "5'6", "Arizona", "Description here"));
		Choices.add(new Choice("Rebecca",28, "6'0","Denver","Description here"));
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
		
	public static void printKatarina(){
		
		System.out.println(Choices.get(5).getName());
		System.out.println(Choices.get(5).getAge());
		System.out.println(Choices.get(5).getHeight());
		System.out.println(Choices.get(5).getLocation());
		System.out.println("________________");
	}
	
	public static void printJenn(){
		System.out.println(Choices.get(6).getName());
		System.out.println(Choices.get(6).getAge());
		System.out.println(Choices.get(6).getHeight());
		System.out.println(Choices.get(6).getLocation());
		System.out.println("________________");
	}
	public static void printMadison(){
		System.out.println(Choices.get(7).getName());
		System.out.println(Choices.get(7).getAge());
		System.out.println(Choices.get(7).getHeight());
		System.out.println(Choices.get(7).getLocation());
		System.out.println("________________");
	}
	public static void printJennifer(){
		System.out.println(Choices.get(8).getName());
		System.out.println(Choices.get(8).getAge());
		System.out.println(Choices.get(8).getHeight());
		System.out.println(Choices.get(8).getLocation());
		System.out.println("________________");
		
	}
	public static void printRebecca(){
		System.out.println(Choices.get(9).getName());
		System.out.println(Choices.get(9).getAge());
		System.out.println(Choices.get(9).getHeight());
		System.out.println(Choices.get(9).getLocation());
		System.out.println("________________");
		
	}
	public static void printLocations(){
		for(int i =0; i<Choices.size(); i++){
			System.out.println(Candidates.Choices.get(i).getLocation());
			System.out.println("_____________");
		}
	}
}
	
