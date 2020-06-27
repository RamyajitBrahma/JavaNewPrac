package oopsConceptFirst;

import oopsConceptSecond.AccessModiProtected;

public class AccessModifiers extends AccessModiProtected {
    
	private int privateInt = 4;
	String normalStr = "Normal String";
	
	public void protectedClassExp() {
		
		//protected Class Explanation
		AccessModiProtected protectedObj = new AccessModiProtected();
		//protectedObj.protMethod(); // cant access becuase protectedObj is an Object of parent class hence cant access private methods via parent classs obj
		protectedObj.publicProtMEthodAcess(); // access the public method
		protMethod(); // can access protected method doirectly bcz now the parent class is inherited
		AccessModifiers childProtObj = new AccessModifiers();
		childProtObj.privateMethod(); // since childProtObj is the child class obj it can access the protrected var and method 
		publicProtMEthodAcess();
		
		
		
	}
	
	
    public void publicMethod() {
    	System.out.println("publicMethod"+privateInt);
    	privateMethod(); // can call a private method or var inside a public class of the same class
    }
    
    private void privateMethod() {
    	System.out.println("privateMethod");
    }

}
