
public class SummationPrimes {
	public static void main(String[]args){
	long sum =0;
	int k;
	
	for( k=2; k<10; k++){
		if(checkPrime(k)){
			sum += k;
		}
	}
	System.out.println();
	System.out.println(sum);
	}
	
	public static boolean checkPrime(int P){
		for(int i=2; i*i<=P; i++ ){
			if(P%i==0){
				return false;
			}
		}
		return true;
	}
	
	
}
