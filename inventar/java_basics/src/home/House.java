package home;



public class House {
	// Fields
		private String color;
		private int residents;
		private int area;
		private String material;
		private int rooms;
		
	// Constructor
		public House(String color, int residents, int area, String material, int rooms) {
			setColor(color);
			setResidents(residents);
			this.area = area;
			this.material = material;
			this.rooms = rooms;
			
		}
		
		
			
		
	// Getter (Accessor)
		public int getResident() {
			return residents;
		}
		
		public String getColor() {
			return color;
		}
		
		public int getArea() {
			return area;
		}
		
		public String getMaterial() {
			return material;
		}
		
		public int getRooms() {
			return rooms;
		}
		
	// Setter (Mutator)
		public void setColor(String color) {
			this.color = color;
			
		}
		
		public void setResidents(int residents) {
			this.residents = residents;
		}
		
	
		public void inhabited(int residents) {
			if (residents == 0) {
				System.out.println("In dem Haus wohnen keine Menschen");
			}else {
				System.out.printf("Es wohnen %d Bewohner im Haus", residents);
			}
		}
		
		public void areaFold(int area) {
			int num = 0;
			for (int i = 0; area < 20; i++) {
				area /= 2;
				num += 1;
				
				
				
			}
			System.out.printf("Du musst die Fläsche des Grundstücks %d mal falten damit sie kleiner als 10 ist.", num);
		}
		
		public void roomCalc(int rooms) {
			System.out.printf("Leider keine Idee mehr aber das haus hat %d Räume", rooms);
		}
		
		
		
		
	}

