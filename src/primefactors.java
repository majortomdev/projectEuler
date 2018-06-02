//****************for testing for prime numbers *********************


//import java.util.Scanner;
//public class primefactors {
//	
//	
//	public static void main(String[] args){
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter a number: ");
//		int xnumb = input.nextInt();
//		boolean isPrime = true;
//		for (int i=2; i <xnumb; i++){
//			if(xnumb%i ==0) {
//				isPrime = false;
//				break;
//			}	
//		}
//		if (isPrime){
//		System.out.println("The number you have picked("+xnumb+") is a Prime number. Well done!");
//		}
//		else {
//			System.out.println(xnumb+" is not a prime number");
//		}
//	}	
//	}


//******************* prime factorisation ****************************


//
//public class primefactors {
//	public static void main(String[]args) {
//		long number = Long.parseLong(args[0]);
//		getPrimeFactors(2345234);
//	}
//	
//	public static void getPrimeFactors(long number){
//		//String primeFactors;
//		for(long i=2; i<=number/i; i++){
//			//System.out.println("{ i= " + i + ", number= " + number + " }");
//			while(number%i ==0) {
//				number= number/i;
//				System.out.println("Factor: " + i);
//				//primeFactors += (String) i + " ";
//			}
//		}
//		if (number> 1) {
//			//System.out.println("Factor: " + number);
//			System.out.println("The largest prime factor is: '"+ number +"'");
//		}
//		System.out.println();
//	}
//}
//
//


// *********** Another route for Prime Factorisation ******** confused **********
//   ***** look to following one for clarification *************
	
	
//public class primefactors {
//	public static void main(String[] args){
//		
//		long largest= 0;
//	        //long num = 600851475143l;
//			long num = 13195;
//	        for (long lt = 2; lt < num; lt++) {
//	            if (isFactor(num, lt)&& isPrime(num/lt))
//	                //System.out.print(num/l + " - ");
//	                largest= lt; 
//	            
//	        }
//	       
//	        
//	        System.out.println("\n"+ isFactor(84,13));
//	        System.out.println(isPrime(17));
//	        System.out.println(largest);
//	        System.out.println();
//	        System.out.println(isPrime(117176));
//	        System.out.println(isPrime(1471));
//	        System.out.println(isPrime(4));
//		
//	}
//	
//	
//	  public static boolean isPrime(long PP){
//	        for (int i =2; i*i < PP; i++){
//	            if (PP % i == 0) return false;
//	        }
//	        return true;
//	    }
//	    
//	    public static boolean isFactor(long XX, long factor){
//	        if (XX % factor == 0) return true;
//	        return false;
//	    }
//	
//}




//*****************try this PRIME FACTOR one for size ******************88


import java.util.ArrayList;
import java.util.List;

class primefactors {
	public static void main (String[] args){
		for(Long lon : fac(600851475143l)){
			System.out.println(lon+" is a prime number.  ");
		}
		
		System.out.println("2 is a prime: " + isPrime(2));
		System.out.println("\n\n1667 is a prime number - " +isPrime(1667));
		System.out.println("10 is a prime: "+ isPrime(10));
		System.out.println("13 is a prime: " + isPrime(13));

	}
	public static List<Long> fac( long num){
		
		ArrayList<Long> factors = new ArrayList<Long>();
		
		for(long i =2; i<= num; i++) {
			while(num%i ==0){
				factors.add(i);
				
				num /= i;
			}
		}
		return factors;
	}
	public static boolean isPrime(long PP){
        for (int i =2; i < PP/2; i++){
           if (PP % i == 0) return false;
           break;
       }
        return true;
    }
	}
