package oopsConceptFirst;

import javaPrac.BasicsJavaNew;

public class BascicsJavaProtectedClasspRac extends BasicsJavaNew {

	public static BasicsJavaNew basicClassObj = new BasicsJavaNew();
	public static BascicsJavaProtectedClasspRac BascicsJavaProtectedClasspRacObj = new BascicsJavaProtectedClasspRac();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//basicClassObj.getProtectedMethod(); // this cant be done bcz only child class object can access a protected method from parent class
		BascicsJavaProtectedClasspRacObj.getProtectedMethod();
	}

}
