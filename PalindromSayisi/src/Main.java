import java.util.Scanner;
public class Main {

	 static boolean isPalindrom(int number) {
	        int temp = number, reverseNumber = 0, mod;
	        
	        while (temp != 0) {
	            mod = temp % 10;
	            reverseNumber = (reverseNumber * 10) + mod;
	            temp /= 10;
	        }
	        return number == reverseNumber;
	    }

	    public static void main(String[] args) {
	    	
	    	Scanner inp = new Scanner (System.in);
	    	System.out.print("Say� Giriniz: ");
	    	int a= inp.nextInt();
	        System.out.println(a+ " say�s� palindrom mudur? " +isPalindrom(a));
	        
	    }
	}

