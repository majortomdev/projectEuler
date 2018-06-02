
public class smallextX {

	public static void main(String[] args) {
		int A=1;
		while(!Div(A)){ // i keep ramping A up until it satisfies my function....
			A++;
		}
		System.out.println("the earliest instance of this is the number "+ A);
		System.out.println(Div(23));
		System.out.println(Div(1));
		System.out.println(Div(0));// to prove 0 / by anything is equal to 0
	}
// first i need to create a function to ascertain can a number be 
// divided by 1 - 10(or 20...etc )inclusive, without remainders
	public static boolean Div(int num){
	for(int i=1; i<=20;i++){
		if (num%i!=0){
			return false;
		}
	}
	return true;
	
	
	}
	
	
	

}
