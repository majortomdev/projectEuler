import java.util.ArrayList;
import java.util.List;

public class problem12 {

	public static void main(String[] args) {
		List <Integer> myList = new ArrayList<>();
		//myList.add(1);
		int sum = 1;
		for (int a = 0; a <=20; a++){
			sum += a; //so my sum is updated by adding the iteration of a to it
			myList.add(a+sum); //my array is updated by adding the sum to the a iteration
			//System.out.println("a is "+ a+ " and the sum(earlier sum+a) which is:"+ sum + ", together they are equsl to: "+ (a+sum));
			
	}

		for(int temp: myList){
			//int list = numDivisors(temp);
			System.out.print(temp+" ");
		}
		
//		for(int temp: myList){
//			if(numDivisors(temp)>)
//		}
		
		
		int x= 0;
		for(int temp2: myList){
		boolean madeIt = false;
		while(numDivisors(temp2)<=5){
			x++;
		} 
			 madeIt= true;
		System.out.println();
		System.out.println(temp2);
		
	}
		
//		for(int temp2: myList){
//			int divs = 0;
//			divs = numDivisors(temp2);
//			if(divs>500){
//				System.out.println("the grand answer is: "+temp2);
//				break;
//			}
//		}
			//System.out.println();
			System.out.println("numbner of divs in 120: " +numDivisors(120));
		}
	
	public static int numDivisors(int num){
		int amt=0;
		//String factors = "";
		for(int w=1; w<=num; w++){
			if(num%w ==0){
				//factors +=w;
				amt++;
				
			}
		}
		return amt;
	}
	
}
