//import java.util.Scanner;
//import java.util.ArrayList;
public class thousandfirstprime {

	public static void main(String[] args) {
//		long num =0;
//		Scanner Q = new Scanner(System.in);
//		System.out.println("What is the magic number? ");
//		long mynum= Q.nextInt();
//		ArrayList<Long> mylist = new ArrayList<Long>();
		
		
		
		int amountOfPrimes = 2;
		int current = 4;
		int lastPrime = 3;
		boolean currentIsPrime = true;
		
		while(amountOfPrimes < 10001){
			for(int i = 2; i*i <= current; i++){
				if(current%i == 0)
				{
					//System.out.println(current + " is not prime");
					currentIsPrime = false;
					break;
				}
				else{
					//System.out.println(current + "---is--PRIME");
					currentIsPrime = true;
					//break; // establish why this is troublesome!!!
				}
				
			}
			
			if(currentIsPrime){
				amountOfPrimes++;
				lastPrime = current;
			}
			current++;	
			
			/*if(isPrime(number)){
				System.out.println(number + " is prime");
				amountOfPrimes ++;
			}*/
		
		}
		
		System.out.println("The 10001 prime is  "+ lastPrime);
		//System.out.println("12 is prime = "+isPrime(12));
		//System.out.println("13 is prime = "+isPrime(13));

	}
	
	public static boolean isPrime(int PP){
        for (int i =2; i*i < PP/2; i++){
           if (PP % i == 0) return false;
       }
        return true;
    }
	
	
	

}
