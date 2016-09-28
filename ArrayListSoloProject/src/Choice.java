
public class Choice
	{
		
		private String name;
		private String height;
		private int age;
		private int weight;
		private String location;
		private String description;
		 
		Choice(String n, int a, String h, String l,String d){
			name = n;
			age = a;	
			height = h;
			location =l;
			description =d;
			
			
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
		public String getDescription(){
			return description;
		}
		
	}
