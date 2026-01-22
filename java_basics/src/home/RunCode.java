package home;

public class RunCode {
	public static void main(String[] args) {
		House house = new House("grau", 1, 120, "bricks", 12);
		Resident residents = new Resident("Wetzi", 23, "brown", 173, "green");
		Property property = new Property(80, 6, 200, true, true);
		Pet pet = new Pet("Sigma", 3, "Hund", true, "blue");
		
		System.out.println("Haus: ");
		System.out.print(house.getResident() + " ");
		System.out.print(house.getColor() + " ");
		System.out.print(house.getArea() + " ");
		System.out.print(house.getMaterial() + " ");
		System.out.println(house.getRooms() + " ");
		System.out.println("Bewohner: ");
		System.out.print(residents.getName() + " ");
		System.out.print(residents.getAge() + " ");
		System.out.print(residents.getHaircolor() + " ");
		System.out.print(residents.getHeight() + " ");
		System.out.println(residents.getEyecolor() + " ");
		System.out.println("Grundstück: ");
		System.out.println(property.getArea());
		System.out.println(property.getGardenArea());
		System.out.println(property.getTrees());
		System.out.println(property.getPool());
		System.out.println(property.getGardenShed());
		System.out.println("Haustier: ");
		System.out.println(pet.getAge());
		System.out.println(pet.getName());
		System.out.println(pet.getEyecolor());
		System.out.println(pet.getHair());
		System.out.println(pet.getType());
		
		
		pet.differentType("Hund");
		pet.longerHair(13);
		pet.shorterHair(15);
		
		property.biggerArea(34);
		property.smallerArea(23);
		property.biggerGardenArea(12);
		property.smallerGardenArea(12);
		property.moreTrees(2);
		property.lessTrees(1);
		
		residents.greaterAge(18);
		residents.smallerHeight(2);
		residents.biggerHeight(12);
		residents.nameCalc("Matthias");
		
		house.inhabited(1);
		house.areaFold(120);
		house.roomCalc(13);
		
	}
	
	
}
