package javaPrac;

import oopsConceptSecond.AbstractClassDemoFlight;

public class SonNew extends Father {
	public Father fatherClassLevel = new SonNew();
	public String strClassLevel = "Class level string";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Once any class is extended u can any emthod or variable of it directly
		getDataStatic(); // cant call a non statio method inside a static method
		//System.out.println(i); // i is from the father class which extended but cant use here bcz i shd be statikc to be used insdie the static method
	   Father father = new SonNew();
	  // fatherClassLevel.getData(); // not accepatable to use classlevel object or var if it mentioned only as public it has to be static to be used acroos all static methods in that class

	   GrandFather grandFather = new SonNew(); 
	   AbstractClassDemoFlight.staticCockPitRules();//an abstract class static method can be called anywhere .
	}

	public void getDataSon() {
		fatherClassLevel.getData(); // allowed to use any public var or emthod of class level bcz it is not a static method
		getData();
		getDatagrandfather();
		getDataSonStat();//can call a  static mthod inside a non static method but the vice versa is not allowed
		System.out.println(i); // i is from the father class which extended
	}
	
	public static void getDataSonStat() {
		System.out.println("getDataSonStat");
		//getDataSon(); // cant call a non static method inside a static metyhod
	}
}
