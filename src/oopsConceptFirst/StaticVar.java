package oopsConceptFirst;

import oopsConceptSecond.AbstractClassDemoFlight;

public class StaticVar {

	String name="sdsd"; // instance var
	String address;
	//static String city="Bangalore";
	static String city; // class var - all static var are class var .. static var cant be declared inside a method it has to be declared at class level
	//we declare var as static when we want all the objects crerated for the class to share the same space for that object for normal instance var new space is created for each object created
	int i = 1;
	static int z = 1;
	
	public StaticVar(String name,String address1, String city) {
		this.name=name;
		address=address1;
		//city = "dfddf";
		this.city=city;
	}
	
	public void getAddress() {
		//city = "dd";
		System.out.println(name);
		System.out.println(address);
		System.out.println(city);
		System.out.println(i);
		i++; // this i is not static hence for two objects created below for this class it has 2 separate vals stored
		System.out.println(z);
		z++; // this z is static hence for two objects created it has only one space created and hence gets replaced and incremented
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//the moment a class object is created java compikles the whole code from beginning which includes declaring and initilaising the vars at class level
		StaticVar obj1 = new StaticVar("jit","Marathalli","Bangalore");
		//city="ffdfd";
		obj1.getAddress();
		StaticVar obj2 = new StaticVar("jit","Akupuittam","Chennai");
		obj1.getAddress();
		obj2.getAddress(); // this will still print city as chennai bcz city is static and it has onlyu one space allocated for any object created , hence it gets replaced
		obj1.getAddress();
		AbstractClassDemoFlight.staticCockPitRules(); // can use a static method of an absatrct class with class name
		//System.out.println(z);
		AccessModifiers accObj = new AccessModifiers();
		accObj.publicMethod();// cant access the private var or method henc it is calling the public method that in turn is calling the private method
	}
	
	public static void staticCheck() {
		int staticVal = 3;
		//static String staticString = "Static String";// not allowed becuase static variables can only declared at class level
		System.out.println(staticVal);
		
		
		//System.out.println(name); // not allowed bcz thos variable is not static
		System.out.println(city); // allowed bcz city is a static var
	}

}
