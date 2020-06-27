package oopsConceptFirst;

public class Methodoverirding extends MethodOverRiding2 {
    
	String zz = "Jit";
	static Integer zint = 3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String zz = "Main get ZZ";
		Methodoverirding objectOverride = new Methodoverirding();
		//objectOverride.getData("jj");
		objectOverride.getData(2);
		System.out.println(zz);
		
		//System.out.println(this.zz); // cant use this keyword also in any static method
	}
	
	public void getData(int a) {
		String zz = "Get Data Jit";
		System.out.println("Methodoverirding2 getData"+a);
		super.getData(3);//cant use super in any static method   Super keyword simply executes the method from the parent class if they have same name method in parent and child
	    super.getDataStr("ddfd");
	    System.out.println(zz);
	    System.out.println(this.zz);
	    MethodOverRiding2 objA = new MethodOverRiding2();
	    objA.getDataStr("ddd");
	}
	

}
