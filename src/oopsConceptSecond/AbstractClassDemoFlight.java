package oopsConceptSecond;

//abstract class objects cant be created same way as we cant create objects of an interface bcz they v methods not defined
//absatract class unlike interface can have both defined and undefined methods .. undefined methods are called abstract methods
//abstract calls opbject cant be created hence we can onky access the static methods of an astarct class from another class
//If the other class extends the absatrct class then that class needs to define the abstract method of that class
public abstract class AbstractClassDemoFlight extends MainFlight {
	private int provateInt = 3;
	public int ix = 4;

	public void flightRules() {
		System.out.println("flight Rules");
	}
	
	public void cockPitRules() {
		System.out.println("cockPitRules");
		System.out.println(provateInt);
		System.out.println(provateInt);
		System.out.println(mainFlighVae);
	}
	
	public static void staticCockPitRules() { //an abstract class static method can be called anywhere . it is used in SonNew.java in javaPrac package
		System.out.println("staticcockPitRules");
		
	}
	
	private static void privateMethod() {
		System.out.println("Priv method");
	}
	
	public abstract void flightColor();

	public abstract String flightNumber();
}
