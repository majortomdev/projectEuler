import java.util.Scanner;
public class sumsquare {

	public static void main(String[] args) {
		int total = 0;
		int sum=0;
		Scanner X = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = X.nextInt();
		for (int i=0; i<=num; i++){
			int square= i*i;
			total += square;
			sum += i;
			
		}
		int diff = (sum*sum) - total;
		System.out.println("The grand total of the sqraes of the first " +num+ " natural numbers is "+ total);
		System.out.println("Whereas the square of the sums is "+(sum*sum));
		System.out.println("The difference between the two is "+ diff);
	}

}
