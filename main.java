import java.util.Scanner;

public class main {
     public static void faktoriyel() {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("bir sayi giriniz");
    	int sayi = scanner.nextInt();
    	
    	int faktoriyel =1;
    	
    	while(sayi>0) {
    		
    		faktoriyel *=sayi;
    		sayi--;
    	}
    	
    	System.out.println("Faktoriyel: " + faktoriyel);
    	
     }
	public static void main(String[] args) {
	
	faktoriyel();
		
	

	}

}
