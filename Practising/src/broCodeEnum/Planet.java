package broCodeEnum;

public enum Planet {
	
	MERCURY(1), VENUS(2), EARTH(3), MARS(4), JUPITER(5), SATURN(6), URNAUS(7), NEPTON(8), PLUTO(9);
	
	int number;
	
	private Planet(int number) {
	
		this.number = number;	
	}
}
