package home;



public class Resident {
	// Fields
		private String name;
		private int age;
		private String haircolor;
		private int height;
		private String eyecolor;
		
	// Constructor
		
		public Resident(String name, int age, String haircolor, int height, String eyecolor) {
			setHaircolor(haircolor);
			setAge(age);
			this.eyecolor = eyecolor;
			this.name = name;
			this.height = height;
			
		}
		
		
			
		
	// Getter (Accessor)
		public int getAge() {
			return age;
		}
		
		public String getName() {
			return name;
		}
		
		public String getHaircolor() {
			return haircolor;
		}
		
		public int getHeight() {
			return height;
		}
		
		public String getEyecolor() {
			return eyecolor;
		}
		
	// Setter (Mutator)
		public void setHaircolor(String haircolor) {
			this.haircolor = haircolor;
			
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		
		
		
		
		public void greaterAge(int age) {
			if (age >= 18) {
				System.out.printf("Du bist jetzt 18 Jahren oder älter");
			}
		}
		
		
		public void biggerHeight(int increase) {
			height += increase;
			System.out.printf("Du bist ist jetzt %d jahre älter und %d jahre alt", increase, height);
		}
		
		public void smallerHeight(int decrease) {
			height -= decrease;
			System.out.printf("Du bist um %dcm kleiner und jetzt %dcm groß", decrease, height);
		}
		
		
		public void nameCalc(String name) {
			int namelenght = name.length();
			if (namelenght <= 6) {
				System.out.println("Du hast einen eher kurzen Namen");
			}else {
				System.out.println("Du hast einen eher langen Namen");
			}
		}
		
		
	}

