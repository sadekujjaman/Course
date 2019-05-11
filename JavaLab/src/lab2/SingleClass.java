package lab2;

public class SingleClass {

	private static SingleClass singleClass;
	
	private SingleClass(){
		
	}
	
	public static SingleClass getInstance(){
		if(singleClass == null){
			singleClass = new SingleClass();
		}
		return singleClass;
	}
	
}
