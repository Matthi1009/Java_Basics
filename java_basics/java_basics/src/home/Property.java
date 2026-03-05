package home;

public class Property {
	// Fields
		private int gardenArea;
		private int trees;
		private int area;
		private boolean pool;
		private boolean gardenShed;
		
	// Constructor
		public Property(int gardenArea, int trees, int area, boolean pool, boolean gardenShed) {
			setTrees(trees);
			this.gardenShed = gardenShed;
			this.area = area;
			this.pool = pool;
			this.trees = trees;
			
		}
		
		
			
		
	// Getter (Accessor)
		public int getGardenArea() {
			return gardenArea;
		}
		
		public int getTrees() {
			return trees;
		}
		
		public int getArea() {
			return area;
		}
		
		public boolean getPool() {
			return pool;
		}
		
		public boolean getGardenShed() {
			return gardenShed;
		}
		
	// Setter (Mutator)
		public void setTrees(int trees) {
			this.trees = trees;
			
		}
		
		
		
		public void biggerArea(int increase) {
			area += increase;
			System.out.printf("Dein grundstück ist nun %d größer und ist jetzt %d groß", increase, area);
		}
		
		public void smallerArea(int decrease) {
			area -= decrease;
			System.out.printf("Dein grundstück ist nun %d kleiner und ist jetzt %d groß", decrease, area);
		}
		
		public void biggerGardenArea(int increase) {
			gardenArea += increase;
			System.out.printf("Dein Garden ist nun %d größer und ist jetzt %d groß", increase, gardenArea);
		}
		
		public void smallerGardenArea(int decrease) {
			gardenArea -= decrease;
			System.out.printf("Dein Garten ist nun %d kleiner und ist jetzt %d groß", decrease, gardenArea);
		}
		
		public void moreTrees(int increase) {
			trees += increase;
			System.out.printf("Du hast jetzt %d mehr bäume und hast %d bäume", increase, trees);
		}
		
		public void lessTrees(int decrease) {
			trees -= decrease;
			System.out.printf("Du hast jetzt %d mehr Bäume und hast %d Bäume", decrease, trees);
		}
		
		
		
	}

