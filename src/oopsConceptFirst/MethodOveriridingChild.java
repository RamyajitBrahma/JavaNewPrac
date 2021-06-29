package oopsConceptFirst;

public class MethodOveriridingChild extends MethodOVeriridingParent{
	
	public String str1 = "M in MethodOveriridingChild";
	public static MethodOveriridingChild MethodOveriridingCHildObject = new MethodOveriridingChild();
	public static MethodOVeriridingParent MethodOveriridingAParentObject = new MethodOVeriridingParent();
	public static MethodOVeriridingParent MethodOveriridingObjectUpcasted = new MethodOveriridingChild();
	
	public static void main(String[] args) {
		System.out.println(MethodOveriridingCHildObject.str1); // both vars and methods get over ridden
		MethodOveriridingCHildObject.checkData();
		
		System.out.println(MethodOveriridingAParentObject.str1); // its a aprent object so it wikll print the parent class vars and method
		MethodOveriridingAParentObject.checkData();
		
		System.out.println(MethodOveriridingObjectUpcasted.str1); // after upcasting variables dont get overrideen only method get overrideen as in the below line
		MethodOveriridingObjectUpcasted.checkData(); // thid object has access to only parent class methods and vard hence u cant acces child class methods or vars
		//MethodOveriridingObjectUpcasted.checkChildData(); // thid object has access to only parent class methods and vard hence u cant acces child class methods or vars
		                                                     // but if it is having same name Vars and methods (like above) in both child and parent classes then after upcasting only methods get overiden to child class but vars remain parent class it doena get over ridden 
		MethodOveriridingCHildObject.checkChildData();
	   
	}
	
	public void checkData() {
		System.out.println(str1);
				
	}
	
	public void checkChildData() {
		System.out.println("Child Data");
		checkData();
		MethodOveriridingCHildObject.checkData();
		super.checkData();
	}

}
