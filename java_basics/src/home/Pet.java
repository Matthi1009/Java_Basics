package home;

public class Pet {
	// Fields
		private String name;
		private int age;
		private String type;
		private int hairlenght;
		private String eyecolor;
		
	// Constructor
		
		public Pet(String name, int age, String type, boolean hair, String eyecolor) {
			setAge(age);
			setHairlenght(hairlenght);
			this.eyecolor = eyecolor;
			this.name = name;
			this.type = type;
			
		}
		
	// Getter (Accessor)
		public int getAge() {
			return age;
		}
		
		public String getName() {
			return name;
		}
		
		public String getEyecolor() {
			return eyecolor;
		}
		
		public int getHair() {
			return hairlenght;
		}
		
		public String getType() {
			return type;
		}
		
	// Setter (Mutator)
			
		public void setAge(int age) {
			this.age = age;
		}
		
		public void setHairlenght(int hairlenght) {
			this.hairlenght = hairlenght;
		}
		
		
		
		
		
		public void greaterAge(int increase) {
			if(age >= 10) {
				System.out.println("Das Haustier ist älter als 10");
			}
		}
		
		
		public void longerHair(int increase) {
			hairlenght += increase;
			System.out.printf("Die Haare sind %dcm viel länger und jetzt %dcm lang", increase, hairlenght);
		}
		
		public void shorterHair(int decrease) {
			hairlenght -= decrease;
			System.out.printf("Die Haare sind %dcm viel kürzer und jetzt %dcm lang", decrease, hairlenght);
		}
		
		
		public void differentType(String type) {
			if (type.equals("Hund")) {
				System.out.println("Cool");
			}
		}
		
						
	}






