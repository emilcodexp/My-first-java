package sampleArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TransactionMain {

	public static void main(String[] args) {
		PersonClass person1=new PersonClass(10000);
		 Scanner sc= new Scanner(System.in); 
		 System.out.println("Enter transaction type");
		String transactionType = sc.next();
		 System.out.println("Enter amount :");
		 Double amount =sc.nextDouble();
		 
		 List<ArrayL> transactions=new ArrayList<ArrayL>();
		 
		 ArrayL  transactions1= new ArrayL(transactionType, amount, person1.getBalance());
			 transactions.add(transactions1);
			 System.out.println("Enter transaction type");
				String transactionType2 = sc.next();
				 System.out.println("Enter amount :");
				 Double amount2 =sc.nextDouble();
				 ArrayL  transactions2= new ArrayL(transactionType, amount, person1.getBalance());
				 
				 System.out.println(person1.getBalance());
	}

}
