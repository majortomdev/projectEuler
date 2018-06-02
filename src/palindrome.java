//import java.util.Scanner;
//public class palindrome {
//
//	public static void main(String[] args) {
//		int mynumber;
//		Scanner box = new Scanner(System.in);
//		System.out.println("Enter a number: ");
//		mynumber = box.nextInt();
//		checkPalindrome(mynumber);
//		
//
//	}
//	public static boolean checkPalindrome(int n){
//		boolean isPal= false;
//		if (n == reverse(n)){
//			isPal = true;
//			System.out.println(n + " is a palindrome!");
//		}
//		else 
//			System.out.println(n + " is not a drome....");
//		return isPal; 
//	}
//	  public static int reverse(int number)
//	    {
//	        int rev = 0;
//	        int rem = 0;
//	        do {
//	            rem = number % 10;
//	            rev = rev * 10 + rem;
//	            number = number / 10;
//
//	        } while (number > 0);
//	        return rev;
//	    }
//	  	
//}



//***  bare bones palindrome test  ***********************88


//public class palindrome {
//
//	public static void main(String[] args) {
//		System.out.println(checkPalindrome(65456));
//	}
//	public static boolean checkPalindrome(int n){
//		boolean isPal= false;
//		if (n == reverse(n)){
//			isPal = true;	
//		}
//		return isPal; 
//	}
//	  public static int reverse(int number)
//	    {
//	        int rev = 0;
//	        int rem = 0;
//	        do {
//	            rem = number % 10;
//	            rev = rev * 10 + rem;
//	            number = number / 10;
//
//	        } while (number > 0);
//	        return rev;
//	    }
//	  	
//}

// ******* for the euler exercise 4 **********


public class palindrome {

	public static void main(String[] args) {
		int result =0;
		int biggest= 0;
		
		for(int i=1; i<=999; i++){
			for(int j=1; j<=999; j++){
				 result= i*j;
			if (checkPalindrome(result)) {
					biggest= result;
				}
			}
		}
	System.out.println("The largest palindrome in the set is "+ biggest);
	}
	public static boolean checkPalindrome(int n){
		boolean isPal= false;
		if (n == reverse(n)){
			isPal = true;
		
		}
		return isPal; 
	}
	  public static int reverse(int number)
	    {
	        int rev = 0;
	        int rem = 0;
	        do {
	            rem = number % 10;
	            rev = rev * 10 + rem;
	            number = number / 10;

	        } while (number > 0);
	        return rev;
	    }
	  	
}

