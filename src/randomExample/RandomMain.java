package randomExample;

import java.util.Random;

public class RandomMain {

	public static void main(String[] args) {
	

		 String [] cities = {"Toronto", "Montreal", "Vancouver", "Calgary", "Edmonton", "Ottawa", "Winnipeg", "Quebec City", "Hamilton", "Halifax"};
         Random random = new Random();

         
         int select = random.nextInt(cities.length); 

     
         System.out.println("Random city selected: " + cities[select]); 

					}
					

	}


