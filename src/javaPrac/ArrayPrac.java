package javaPrac;

public class ArrayPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	}
	

}
