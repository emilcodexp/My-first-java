package newPackJava;

public class MainClass {
	
	public static void main(String[] args) {
		
		System.out.println("This is Me");
		System.out.println("This is Me");
		System.out.println("This is Me");
		MobilePhone mp = new MobilePhone();
		
		mp.makeCalls();
		mp.sendText();
		
		
		
 String nameOfBrand =mp.brandName;
 
 System.out.println(nameOfBrand);
 int sizeOfPhone = mp.size;
 System.out.println(sizeOfPhone);
		
	}

}
