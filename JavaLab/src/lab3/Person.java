package lab3;

public class Person {

	String name,address;
	
	Person(String name){
		this.name = name;
	}
	
	Person(String name, String address){
		this(name);
		this.address = address;
	}
}
