
public class problem8then {

	public static void main(String[] args) {
		// the number
		String p = "73167176531330624919225119674426574742355349194934"+
		           "96983520312774506326239578318016984801869478851843"+
		           "85861560789112949495459501737958331952853208805511"+
		           "12540698747158523863050715693290963295227443043557"+
		           "66896648950445244523161731856403098711121722383113"+
		           "62229893423380308135336276614282806444486645238749"+
		           "30358907296290491560440772390713810515859307960866"+
		           "70172427121883998797908792274921901699720888093776"+
		           "65727333001053367881220235421809751254540594752243"+
		           "52584907711670556013604839586446706324415722155397"+
		           "53697817977846174064955149290862569321978468622482"+
		           "83972241375657056057490261407972968652414535100474"+
		           "82166370484403199890008895243450658541227588666881"+
		           "16427171479924442928230863465674813919123162824586"+
		           "17866458359124566529476545682848912883142607690042"+
		           "24219022671055626321111109370544217506941658960408"+
		           "07198403850962455444362981230987879927244284909188"+
		           "84580156166097919133875499200524063689912560717606"+
		           "05886116467109405077541002256983155200055935729725"+
		           "71636269561882670428252483600823257530420752963450";
		 
		int max = 1,        // the maximum product
		    prod = 1,       // the current product
		    len = p.length(),  // the length of the number (1000 for this problem)
		    zeros = 0;      // number of zeros in the current product
		 
		// loop through each digit of the number
		for (int i = 0; i < len; i++)
		{
		    // if there are 5 digits in our current product,
		    // we need to remove the oldest one to make room
		    // for the new digit
		    if (i + 1 > 5)
		    {
		        if (p( i -5 ) == '0')
		        {
		            // if the old digit was a zero,
		            // we remove one zero from the current product
		            zeros--;
		        }
		        else
		        {
		            // if the old digit was not a zero,
		            // we divide it from the current product
		            prod = prod / (p[i - 5] - '0');
		        }
		    }
		 
		    // now we add the new digit to the current product
		    if (p(i) == '0')
		    {
		        // if the current digit is a zero,
		        // we add one zero to the current product
		        zeros++;
		    }
		    else
		    {
		        // if the current digit is not a zero,
		        // we multiply our current product by the current digit
		        prod = prod * (p[i] - '0');
		    }
		 
		    // if we have 5 digits in the current product
		    // and none of them are zero
		    if (i + 1 >= 5 && zeros == 0 && prod > max)
		    {
		        // then if the current product is larger than
		        // the largest product, we update the
		        // largest product
		        max = prod;
		    }
		}
		 
		// print the maximum product
		printf("%d\n", max);
	}

	

}
