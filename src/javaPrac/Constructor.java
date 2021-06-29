package javaPrac;

public class Constructor {
	public static Constructor constructorObj = new Constructor();
   public Integer int2 = 4;
   public String str1;
   
	public Constructor() {
		Integer int1 = 3;
		str1 = "Const1";
		System.out.println("Inside const 1");
		
	}
	
	public static void main(String[] args) {
		constructorObj.constGetData(); //Inside a static method any object or methiod used needs to be static

	}
	
	public void constGetData() {
		//public String str5 = "dd"; // not allowed inside a  method all vars defined are by default of defauly data type cant be public or private
		System.out.println("GetData COnst");
		System.out.println(constructorObj.int2);
		System.out.println(constructorObj.str1);
		//constructorObj.int1   --> int1 is a var inside the contructor hence cant be used outside .
	}
}
