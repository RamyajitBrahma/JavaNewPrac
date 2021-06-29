package javaPrac;

public class ArrayPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int awa[] = new int[5];
		
		Integer as[]=new Integer[4];		  
		  
          int a[] = new int[6];
          String b[] = new String[4];
          int aa[] = {1,3,5,6};
          int[] aaArr = {1,5,6,7}; // also can declare array like this
          int am[][] = new int[2][3];
          int bm[][] = {{1,2,3},{3,4,5}};
          
          System.out.println("col size:"+ bm[0].length);
          System.out.println("Array muylti size:"+ bm.length);
          System.out.println(aaArr[1]);
          System.out.println(aaArr.length);
          
         String splitString = "I;am;goodboy";
         
         String[] splitStringArr = splitString.split(";");
         String splitStringArr2[] = splitString.split(";");   // can declare both ways
         System.out.println(splitStringArr[0]);
         System.out.println(splitStringArr2[0]);
         
         String str1 = "jit.txt";
         System.out.println(str1.toLowerCase().endsWith(".txt"));
         
         //Converting sa string to int - it is oike int in vb
         String myString = "2";
         int myInt = Integer.parseInt(myString);
         
         System.out.println(myInt);
         myInt=myInt+3; // this addition is possi le bcz it is converted to int
         System.out.println(myInt);
         
       //Converting sa int to String - it is like Cstr in vbscript
         Integer myInt1 = 4;
         int myInt2 = 5;
         
         String myString1 = myInt1.toString();
         System.out.println(myString1);
         System.out.println(myInt1.compareTo(4));
         System.out.println(myInt2+myInt1);
         
         Integer intVal = 4;
         int z1 = intVal.parseInt(myString1);
         System.out.println(z1);
         
         System.out.println(intVal.compareTo(myInt2));
         
         Integer ax[][] = new Integer[3][4];
         ax[0][0]=1;
         ax[0][2]=3;
         
         System.out.println(ax[0][2]);
         System.out.println(ax[0][2].toString());
         
         
	}


	

}
