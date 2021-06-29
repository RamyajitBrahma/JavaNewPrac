package javaPrac;

public class GrandFather {
	GrandFather grandFather = new GrandFather();
	SonNew sonNew = new SonNew();
	SonNew sonNew1 = (SonNew) new GrandFather();//this will have the methods of both sonNew father and grandfather
	//this is helpful when u need to access methods of (2 classes) in this case both sonnew & grandFather classes by creating only one object without inheriting any property i.e without inheritance

    public void getDatagrandfather() {
    	System.out.println("getData satic From GrndFather");
    	sonNew1.getDataSon();
    	sonNew1.getData();
    }
    
    
}
