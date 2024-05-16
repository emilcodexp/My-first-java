package personFinder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonSelect {
public static void main(String[] args) {
	

	
	ArrayList<String> names=new ArrayList <String>();
	//List<String> name=new ArrayList<String>();
	
	
	names.add("Alex");
	names.add("Tom");
	names.add("Vipin");
	names.add("John");
	names.add("Peter");
	names.add("Lilly");
	names.add("Joy");
	names.add("Leo");
	names.add("Alan");
	names.add("Bruce");
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter the name :");
	String enterName=sc.next();
	for(int i =0;i<=names.size();i++) {
		if (names.contains(enterName)) {
			System.out.println("Name is in the List");
			break;
		}else {
		System.out.println("Name is not in the List");
		break;
	}

}
//	remove duplicates
//	for(int i=0;i<names.size();i++) {
//		if(names.containsAll(names))
//	}
	
	
}

}