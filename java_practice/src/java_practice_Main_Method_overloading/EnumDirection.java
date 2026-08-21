package java_practice_Main_Method_overloading;

enum EnumDirection {
	NORTH{
		public void move() {
			System.out.println("Y + 1" );
		}
	},
	EAST{
		public void move() {
			System.out.println("X + 1");
		}
	}, 
	SOUTH{
		public void move() {
			System.out.println("y-1");
		}
	},
	WEST{
		public void move() {
			System.out.println("x - 1");
		}
	};
	
public abstract void move();
}
