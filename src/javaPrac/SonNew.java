package javaPrac;

public class SonNew extends Father {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Once any class is extended u can any emthod or variable of it directly
		getDataStatic(); // cant call a non statio method inside a static method
		//System.out.println(i); // i is from the father class which extended but cant use here bcz i shd be statikc to be used insdie the static method
	}

	public void getDataSon() {
		getData();
		getDatagrandfather();
		System.out.println(i); // i is from the father class which extended
	}
	
	public static void getDataSonStat() {
		System.out.println("getDataSonStat");
	}
}
