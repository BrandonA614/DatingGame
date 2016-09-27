
public class Choice
	{
		private String name;
		private String height;
		private int age;
		private int weight;
		private String location;
		
		 
		Choice(String n, int a, String h, String l){
			name = n;
			age = a;	
			height = h;
			location =l;
			
			
		}
		
		public String getLocation(){
			return location;
			
		}
		
		public int getAge(){
			return age;
			
		}
		
		public String getName(){
			return name;
			
		}
		
		public String getHeight(){
			return height;
		}
		
	}
