package oopsConceptFirst;

import javaPrac.SonNew;
import oopsConceptSecond.AbstractClassDemoFlight;
import oopsConceptSecond.MaibnFlightSecond;
import oopsConceptSecond.MainFlight;

public class abstractClassEitihad extends AbstractClassDemoFlight {
    
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//can use private modifier in abstract calss but not in interface
		//cant create object of an abstract class
		//It mus be piblic for interface
		//Interface should have al abstract methods hence 100% abstactiobn
		//An abstarct class can have abstract meethods as well as concrete methods
		//Any mehtod defined as absract inside a class will make the class also abstract
		//Child class forced to implement the asbstct methods od an abstract class
		MaibnFlightSecond.CheckStatic();//if a y method is static inside a class of smae packagfe iu can directly access with class name. after importing the class
		abstractClassEitihad eithihadObj = new abstractClassEitihad();
		eithihadObj.flightColor();
		String flightDetails = eithihadObj.flightNumber();
		System.out.println(flightDetails);
	//	System.out.println(provateInt); //cant use tis bcz it is a prviate vare

		eithihadObj.cockPitRules();
		eithihadObj.eitiHadpasengerList();
		
		//AbstractClassDemoFlight abstarctClassObj = new AbstractClassDemoFlight(); //cant create object of an abstract class
		AbstractClassDemoFlight eithihadObjAbstactObj = new abstractClassEitihad();//Polymorphism is allowed
		AbstractClassDemoFlight.staticCockPitRules(); // can access directly thr static method of an abstract class bcz we dont have to create an object of abstarct class
		eithihadObjAbstactObj.flightColor();
		
		eithihadObjAbstactObj.mainflightRules();
		
		//MainFlight eithihadObjAbstactObj2 = new AbstractClassDemoFlight();//this polymoephism nit allowed bcz cant instatitate an abstarct class
		
		
	}

	@Override
	public void flightColor() {
		// TODO Auto-generated method stub
		System.out.println("Red Color");
	}

	@Override
	public String flightNumber() {
		// TODO Auto-generated method stub
		return "Eitihad B123456";
	}
	
	public void eitiHadpasengerList() {
		System.out.println("eitiHadpasengerList");
		MaibnFlightSecond.CheckStatic();//can call a static methos with class name
		System.out.println(MaibnFlightSecond.ii);
		SonNew.getDataSonStat();
		OcbcBank.FindBeneNamesStat();
		System.out.println(ix);
		//System.out.println(provateInt); 
	}

}
