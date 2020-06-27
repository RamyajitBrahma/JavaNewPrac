package oopsConceptSecond;

public class AccessModiProtected {
   
	protected String protInt = "Protected String";
	
	protected void protMethod() {
		System.out.println("ProtectedMethod");
	}
	
	public void publicProtMEthodAcess() {
		protMethod();
	}
	
}
