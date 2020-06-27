package oopsConceptSecond;


public abstract class AbstractClassDemoFlight extends MainFlight {
	private int provateInt = 3;
	public int ix = 4;
	public void flightRules() {
		System.out.println("flight Rules");
	}
	
	public void cockPitRules() {
		System.out.println("cockPitRules");
		System.out.println(provateInt);
		System.out.println(mainFlighVae);
	}
	
	public static void staticCockPitRules() {
		System.out.println("staticcockPitRules");
		
	}
	
	public abstract void flightColor();
	public abstract String flightNumber();
}
