package broCodeEnum;

public class SupportClasses {
	
	static void canILiveHere(Planet myPlanet) {

		switch (myPlanet) {
		case EARTH:
			System.out.println("You can live here :)");
			System.out.println("This is planet # "+ myPlanet.number);
			break;
		default:
			System.out.println("You can not live here...yet.");
			System.out.println("This is planet # "+ myPlanet.number);
			break;
		}
	}

	static void mayILiveHere(Planet myPlanet) {

		if (myPlanet == Planet.EARTH) {
			System.out.println("You can live in " + myPlanet + " :)");
			System.out.println("This is planet # "+ myPlanet.number);
		}
		else {
			System.out.println("You can not live in " + myPlanet + "... yet :)");
			System.out.println("This is planet # "+ myPlanet.number);
		}
	}


}
