package java_practice_Main_Method_overloading;

enum EnumDegrees {
	NORTH(0),
	SOUTH(90),
	EAST(180),
	WEST(270);
	private int degrees;
	EnumDegrees(int degrees){
		this.degrees = degrees;
	}
	public int getEnumDegrees() {
		return degrees;
	}
}

