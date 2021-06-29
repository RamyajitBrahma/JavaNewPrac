package oopsConceptSecond;

public interface CoreBankMainFuncs {
    
	public static int a = 3; // variables defijed in interface should always be public
	public int b=4; //can be static or non static no problem
	//private int z=2;// there cant be any private access modifier in inerface
	public void AddBene();
	public String PayBene();
}
