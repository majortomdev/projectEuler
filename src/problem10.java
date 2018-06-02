
public class problem10 {

//	public static void main(String[] args) {
//		isPrime(10);
//	}
//	public static boolean isPrime(int number){
//		int primeTot=0;
//		for(int i=2; i <= number/2; i++){
//			if(number%i==0){
//				return false;
//			}
//			else primeTot += i;
//			System.out.println(primeTot + " is the total sought!");
//		}
//		return true;
//		//System.out.println(primeTot + " is the total sought!");
	
	
//	public static void main(String[]args){
//		
//		for(int i=0; i<10; i++){
//			for(int j=0;j<i; j++){
//				System.out.println("9");
//			}
//		}
	
public static boolean primeOr(int num){
			int count = 0; 
			for(int a =2; a <= num/2; a++){
				if(num%a == 0) {
					count = 1;
					break;
				}	
			}
			if(count == 1){
				return false;
			}
				else return true;
		}
				
public static void main(String[] args){
	
	System.out.println("10 is a prime: "+ primeOr(10));
	System.out.println("7 is a prime: " + primeOr(7));
	System.out.println("5 is a prime: " + primeOr(5));
	System.out.println("224 is a prime: "+ primeOr(224));
	
	int primeSum = 0;
	for(int x=2; x<2000; x++){
		if(primeOr(x)){
			//System.out.print(x+" + ");
			primeSum += x;
		}
	}
	System.out.println("\nThe sum of the selected primes range is "+primeSum); //answer is   1179908154
	
}
	
	
}


