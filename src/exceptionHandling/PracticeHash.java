package exceptionHandling;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class PracticeHash {
private String name;
private int age;



	public PracticeHash(String name, int age) {
		
	super();
	this.name = name;
	this.age = age;
	
	
	
}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return "PracticeHash [name=" + name + ", age=" + age + "]";
	}



	public static void main(String[] args) {
		PracticeHash ex=new PracticeHash("EMil", 30);
		
	HashMap <Integer,String> stud=new HashMap<>();
	List<PracticeHash> trans =new ArrayList<>();
	
	trans.add(ex);
	System.out.println(trans.toString());
	
	stud.put( 123,"James");
	stud.put( 124,"James");
	stud.put( 222,"James");
	stud.put( 333,"James");
	stud.put( 444,"James");
	stud.remove(123);

	System.out.println(stud);
	
	

	
	
	}
}
