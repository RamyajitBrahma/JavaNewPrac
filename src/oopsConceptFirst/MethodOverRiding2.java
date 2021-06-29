package oopsConceptFirst;

public class MethodOverRiding2 {
	public void getData(int a) {
		System.out.println("Methodoverirding getData"+a);
	}
	
	public void getDataStr(String a) {
		System.out.println("Methodoverirding getData string"+a);
	}
	
	final void getDataFinal() {
		System.out.println("Final blocm of parent class");
	}
}
