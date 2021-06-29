package javaPrac;

public class BasicsJavaNew {
   
	static int aa = 2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//******** Different ways for calling a method *****
		
		String z = getDataString();
		System.out.println(z);
		getDataStatic(); //Static methods can be called straight away if it is inside the same class 
		BasicsJavaNew.getDataStatic();
		BasicsJavaNew basicClassObj = new BasicsJavaNew(); //IF method is notstatic then have to create an object of the class
		basicClassObj.getProtectedMethod(); //can create an object of the parent class and access protected methods from inside the parent class
		basicClassObj.getData();
		basicClassObj.getDataStatic(); // object of the class also show sstatic methods and vars but it shows warnings
		System.out.println(basicClassObj.aa); // object of the class also show sstatic methods and vars but it shows warnings
		basicClassObj.aa=6;
		System.out.println(aa); // can prj the var directly bcz it resides in the smae class scope
		//Callimng static method of another class inside same package but if from another package u need to import the package and class
		System.out.println(BasicsJavaSecondClassNew.ss); // object of the class also show sstatic methods and vars but it shows warnings
		BasicsJavaSecondClassNew.ss=9;
		System.out.println(BasicsJavaSecondClassNew.ss);
		//System.out.println(ss); // not allowed bcz this atic var is from a diff class
		BasicsJavaSecondClassNew.getData();
		getDataString();
		getDataStatic(); // any method in a class static or non static can  be called directly in a class if it is in the same class
	}

	public void getData() {
		int a = 2;
		System.out.println("Normal Get Data"+a);
		
	}
	
	public static String getDataString() {
		return "get Data String";
	}
	
	public static void getDataStatic() {
		int b = 3;
		System.out.println("Static Data: "+b);
	}
	
	protected void getProtectedMethod() {
		System.out.println("private data");
	}
}
