package oopsConceptFirst;

import oopsConceptSecond.AbstractClassDemoFlight;
import oopsConceptSecond.CoreBankMainFuncs;
import oopsConceptSecond.coreBankingMoreFunc;
import oopsConceptSecond.coreMainFunc2;

public class OcbcBank implements CoreBankMainFuncs,coreBankingMoreFunc,coreMainFunc2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OcbcBank ocbcBankObj = new OcbcBank(); // this object will  have access to the implemented methods of the interface as well the methods writtrn in this class
		CoreBankMainFuncs coreBankFuncsObj = new OcbcBank(); // this object will onlu have access to the implemented methods of the interface
		coreBankingMoreFunc coreBankFuncsExtendedObj = new OcbcBank(); // pbject for swecond interface
		//OcbcBank ocbcBankObj1 = new CoreBankMainFuncs(); // cant do this , cant convert for Interface to implementing class 
	//	coreBankingMoreFunc coreBankFuncsExtendedObj1 = new coreBankingMoreFunc();//ERROR - cant create objct of an interface becuase there will be no methods to use in it, can only create object of the class implementing an interface
		
		
		AbstractClassDemoFlight.staticCockPitRules(); // abstract calls opbject cant be created hence we can onky access the static methods of an astarct class
		ocbcBankObj.FindBeneNames();
		ocbcBankObj.AddBene();
		coreBankFuncsObj.AddBene(); // this one and th above one r the same
		
		String PayBen = coreBankFuncsObj.PayBene();
		System.out.println(PayBen);
		
		System.out.println(coreBankFuncsObj.a);
		System.out.println(ocbcBankObj.a);
		
		coreBankFuncsExtendedObj.FundTtransfer();
		ocbcBankObj.FundTtransfer();
	}

	@Override
	public void AddBene() {
		// TODO Auto-generated method stub
		System.out.println("Inerface method AddBene");
	}

	@Override
	public String PayBene() {
		// TODO Auto-generated method stub
		//System.out.println("PayBene");
		return "Inerface method PayBene";
	}
	
	public void FindBeneNames() {
		OcbcBank ocbcBankObj1 = new OcbcBank();
		ocbcBankObj1.AddBene();
		System.out.println("Non Interface mthod FindBeneNames");
	}

	@Override
	public void FundTtransfer() {
		// TODO Auto-generated method stub
		System.out.println("Second Inerface method FundTtransfer");
	}
	
	public static void FindBeneNamesStat() {
		System.out.println("Non Interface mthod FindBeneNamesStat");
	}

	@Override
	public void AddBeneAgain() {
		// TODO Auto-generated method stub
		System.out.println("From the third interface");
		
	}

}
