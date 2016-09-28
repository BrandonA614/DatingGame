import java.util.Scanner;
public class Display
	{
		static int ageInput2;
		static String initialInput2;
		
		public static void main(String[] args)
			{
					System.out.println("Welcome to Brandon's Dating Game!" );
					System.out.println("To Start, please pick what is most important to you" );
					System.out.println("Your choices are : Age, Height, or Location");
					Scanner initialInput = new Scanner(System.in);
					initialInput2 = initialInput.nextLine();
					Candidates.People();
					input();
				//
				
				

			}
		public static void redo(){
			System.out.println("Hopefully, one of these choices are better!");
			Candidates.printJenn();
			Candidates.printMadison();
			Candidates.printJennifer();
			Candidates.printKatarina();
			Candidates.printRebecca();
			System.out.println("Which one would you choose?");
			System.out.println("If you would like to go back, please type 'Go Back'");
			Scanner input = new Scanner(System.in);
			String input2 = input.nextLine();
			if(input2.equals("Go Back") || input2.equals("go back") || input2.equals("go Back")){
				System.out.println("Your choices are : Age, Height, or Location");
				Scanner initialInput = new Scanner(System.in);
				initialInput2 = initialInput.nextLine();
				input();
				
			}
			
			
		}
		
			
		public static void input(){
			//			 _
			//		   // \\
			//		  //===\\	
			//		 //		\\
			
			if(initialInput2.equalsIgnoreCase("age")){
					System.out.println("What Age are you looking for?");
					Scanner ageInput = new Scanner(System.in);
					ageInput2 = ageInput.nextInt();
				
				
				
				if(ageInput2 > 30){
					System.out.println("Your choices are : " );
					System.out.println("________________");
					
					Candidates.printSamantha();
					Candidates.printMaddy();
					Candidates.printMarsha();
					
					System.out.println("Which one would you like to go on a date with? ");
					
					
					System.out.println("If none, please type 'None' ");
					
					Scanner input = new Scanner(System.in);
					String input2 = input.nextLine();
					if(input2.equals("None") || input2.equals("none")){
						redo();
						
					}
			}	else if(ageInput2 < 30){
				
					System.out.println("Your choices are : ");
					System.out.println("________________");
					
					Candidates.printJean();
					Candidates.printBrooke();		
					
					System.out.println("Which one would you like to go on a date with? ");
					System.out.println("If none, please type 'None' ");
					Scanner input = new Scanner(System.in);
					String input2 = input.nextLine();
					if(input2.equals("None") || input2.equals("none")){
						redo();
					}
			}	
				
		}
			
			//			||	 ||
			//			||===||
			//			||	 ||
			
			
			if(initialInput2.equalsIgnoreCase("Height")){
				System.out.println("Around what Height are you looking for? ");
				Scanner heightInput = new Scanner(System.in);
				String heightInput2 = heightInput.nextLine();
				
				
				if(heightInput2.equals("5'2") || heightInput2.equals("52") || heightInput2.equals("5 2") ||
				   heightInput2.equals("5'1") || heightInput2.equals("51") || heightInput2.equals("5 1") ||
				   heightInput2.equals("5'0") || heightInput2.equals("50") || heightInput2.equals("5 0") ||
				   heightInput2.equals("4 11") || heightInput2.equals("411") || heightInput2.equals("4 11")
																											)
					{
						Candidates.printJean();
						Candidates.printBrooke();
						Candidates.printMaddy();
						
						System.out.println("Which one would you like to go on a date with? ");
						System.out.println("If none, please type 'None' ");
						Scanner input = new Scanner(System.in);
						String input2 = input.nextLine();
						if(input2.equals("None") || input2.equals("none")){
							redo();
							
						}
						
					}
					
	
				
				
			}
			
		if(initialInput2.equals("Location")){
			System.out.println("Your options for location are : ");
			Candidates.printLocations();
			System.out.println("Which of these locations are satisfactory? ");
			Scanner locationInput = new Scanner(System.in);
			String locationInput2 = locationInput.nextLine();
			for(Choice C : Candidates.Choices){
				if(C.getLocation().equals(locationInput2)){
					
					
				}
					
				
			}
		}
			
	}
				
				
			
		}
