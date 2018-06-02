import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args){
		Scanner inp = new Scanner(System.in);
		System.out.println("A number of fibs?");
		int mine = inp.nextInt();
		int st = 0;
		int fib1 = 1;
		int fib2;
		int grand=0;
		System.out.print("fib1: "+st +" fib2: " +fib1+" ");
		for (int i=2; i<mine; i++){
			fib2 = st+fib1;
/*			if(fib2%2 ==0){
				System.out.print(fib2+" ");
				grand+=fib2;
			}*/
			System.out.print("fib"+(i+1)+": "+fib2+ " \n");
			grand +=fib2;
					st= fib1;
			fib1= fib2;
			
		}
		System.out.println("\nTheir grand total is: "+ (grand+1));// +1 allows for the 
		//first 2 terms, which i printed out before the loop
		
	}
}


// ********** or version 2........*******************


//import java.util.Scanner;
//public class Fibonacci {
//	public static void main(String[]args){
//		int numToPrint;
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("What amount of fib numbers would you like?");
//		numToPrint = sc.nextInt();
//		sc.close();
//		
//		int first= 1;
//		int second= 1;
//		int next=0;
//		System.out.print(0 + " "+ first +" "+ second);
//		for(int count=3; count<numToPrint; count++) {
//			next = first + second;
//			System.out.print(" "+next+" ");
//			first = second;
//			second = next;
//			
//		}
//	}
//}

/*import java.util.Scanner;
public class Fibonacci {
	public static void main(String[]args){
		Scanner Q = new Scanner(System.in);
		
		System.out.println("Enter a number, to print out as many in the sequence");
		int mynumber = Q.nextInt();
		int first= 0;		int second= 1;
		int latest;
		System.out.print(first + " " + second +" ");
		for (int i=2; i<mynumber; i++ ){
			latest = first+second;
			System.out.print(latest + " ");
			first= second;
			second = latest;
		}
	}
}*/






//public class Fibonacci{
//	public static void main(String[] args){
//		 int neung= 0;
//	        int saung= 1;
//	        int dtungNee=0;
//	        int total=0;
//	        System.out.print(neung + " "+ saung + " ");
//	        for(int i =1; i<100; i++){
//	            dtungNee= neung + saung;
//	            while (dtungNee<=40){
//	            	if (dtungNee%2==0) {
//                total+=dtungNee;
//	            	}
//            }
//	            System.out.print(dtungNee+ " ");
//	            neung=saung;
//	            saung=dtungNee;
//
//	            }
//	        System.out.println("\nThe total of the even primes is: "+total);
//	            }
//	        
	        

/*
import java.util.ArrayList;
public class Fibonacci {
    public static void main(String[] args){
	    int sum = 0;
        ArrayList<Integer> fib = new ArrayList<Integer>();
        int one = 1;
        int two = 2;
        fib.add(one);
        while(two<=4000000){ // this section is a nice concise fib sequence code
            fib.add(two);
            int temp = one;
            one = two;
            two += temp;
        }
        for(int i : fib) {
            if ( i % 2 ==0){
                sum += i;
            }
        }
        System.out.println("The Fib sequence is: "+ fib);
        System.out.println("The total of these even fibs is "+ sum);
        
    }
}
*/
