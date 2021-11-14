package lab5;

	
	class Circle extends Point {
		
		private int radius;
		
		

		public Circle(int x, int y, int radius) { // Circle constructor 
			super(x, y);
			this.radius = radius;
			this.x= x;
			this.y = y; 
		}

		
		// setter and getter methods 
		public int getRadius() {
			return radius;
		}

		public void setRadius(int radius) {
			this.radius = radius;
		}

		//toString method 
		public String toString() {
			return "Circle [radius=" + radius + ", x=" + x + ", y=" + y + "]";
		}

		
		
		
		
		
		
	}


