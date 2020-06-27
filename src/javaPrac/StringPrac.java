package javaPrac;

public class StringPrac {

	private String privStr = "Pricvate string";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a= " javatraining";//string 
		String b = "Raining";
		//can access private var inside the same class
		System.out.println(a.charAt(2));
		System.out.println(a.indexOf("e"));
		System.out.println(a.substring(3, 6));
		System.out.println(a.substring(5));
		System.out.println(a.concat("rahul teaches"));
		//a.length()
		System.out.println(a.trim());
		a.toUpperCase();
		a.toLowerCase();
		//split
		String arr[]=a.split("t");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(a.replace("t", "s"));
		
		System.out.println(a.compareTo(b));
		System.out.println(a.compareToIgnoreCase(b));
		System.out.println(a.contains(b));
		System.out.println(a.contains(b.toLowerCase()));
		System.out.println(a.endsWith("ing"));
		System.out.println(a.endsWith("Ing"));
		System.out.println(a.endsWith("in"));
		System.out.println(a.trim().equalsIgnoreCase("Javatraining"));
		
		System.out.println(a.indexOf("j"));
		System.out.println(a.trim().indexOf("j"));
		System.out.println(a.indexOf("a"));
		System.out.println(a.charAt(1));
		System.out.println(a.trim().charAt(1));
		System.out.println(a.charAt(1));
		System.out.println(a.indexOf("train"));
		System.out.println(a.indexOf("Train"));
          
        String palindromeStr =  stringRev();
        System.out.println(palindromeStr);
          
	}
	
	public  void privateMethod() {
		System.out.println(privStr);
		//private String privStr1 = "Pricvate string"; // cant use private var inside a  method, inside a method al vars are default, only can declare a var as final nothing else , cant use public/private/protected
	}
	
	
	public static String stringRev() {
		String str = "madam";
		String strRev = "";
		
		for(int i=str.length()-1;i>=0;i--) {
			strRev=strRev+str.charAt(i);
		}
		System.out.println(strRev);
		if(str.equalsIgnoreCase(strRev)) {
			System.out.println("it is a palindrome");
			return strRev;
		}
		else {
			System.out.println("it is not a palindrome");
			return strRev;
		}
		
		
	}

}
