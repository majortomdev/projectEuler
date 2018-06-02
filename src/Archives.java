//******* problem 1 for getting multiples of 3 and 5 and totalling them
public class Archives {

	public static void main(String[] args) {
		
		int total=0;
		for(int i=1; i<1000; i++){
			if (i%3 == 0 || i%5 ==0){
				total+=i;
				System.out.print(i+" ");
			}
		}
		System.out.println("\nThe total is " + total);

	}
}


