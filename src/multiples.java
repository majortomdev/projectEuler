//*******prime numbers*******

public class multiples {
   public static void main (String[] args){		
       int i =0;
       int num =0;
       //Empty String
       String  primeNumbers = "";
       for ( i = 1; i <= 60; i++)         
       { 		  	  
		      int counter=0; 	  
//num starts as i and works down to 1 to see if i%num only occurs twice, making it prime		      
		      for(num =i; num>=1; num--){
		          if(i%num==0){
		        	  		counter += 1;
		             	}
			  }
			  if (counter ==2)
			  {
			     //Appended the Prime number to the String
			     primeNumbers = primeNumbers + i + " ";
			  }			  
       }	
       System.out.println("Prime numbers from 1 to 10 are :");
       System.out.println(primeNumbers);
   }
}


//***************************************************************************


//public class multiples {
//	public static void main(String[] args){
//		
//		for(int outer=2; outer<=15; outer++){
//			
//			for(int inner=2;inner<=outer;inner++) {
//				
//				if (inner==outer){
//					System.out.println(outer);
//				}
//	// so when above if is true, below if is automatically true so break is there...
//				if(outer%inner==0) {
//					break;
//				}
//				
//			}
//		}
//		
//	}
//}


//***********************************************************************

//
//import java.util.*;
//public class multiples {
//	public static void main(String[] args){
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a number: ");
//		int input = scan.nextInt();
//		boolean prime = true;
//		for(int i=2; i<input; i++) {
//			if (input % i == 0){
//				prime = false;
//			}
//			
//			}
//		if (prime == false) {
//			System.out.println(input + " is not prime");
//		}
//		else if(prime == true){
//			System.out.println(input + " is a prime number");
//		}
//		
//	
//	}
//}