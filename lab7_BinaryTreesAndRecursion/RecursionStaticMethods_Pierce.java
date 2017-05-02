package lab7_BinaryTreesAndRecursion;

/**
 * 
 * @author Jeremy Pierce
 *
 */
public class RecursionStaticMethods_Pierce {
	
	static int recursion = 0;
	static int temp;
	
	public static int factorial(int n){
		recursion++;
		if(n == 1) return 1;
		return n * factorial(n-1);
	}// End of factorial method
	
	/**
	 * 
	 * @param base
	 * @param exponent
	 * @return
	 */
	public static int powerOf(int base, int exponent){
		recursion++;
		if(exponent == 0) return 1;
		if(exponent == 1) return base;
		return powerOf(base, exponent-1) * base;
	}// End of powerOf method
	
	/**
	 * 
	 * @param n
	 * @return
	 */
	public static int sum(int n){
		recursion++;
		if(n == 1) return 1;
		return sum(n-1) + n;
	}// End of sum(n)
	
	/**
	 * 
	 * @param m
	 * @param n
	 * @return
	 */
	public static int sum(int m, int n){
		recursion++;
		if(m == n) return m;
		return sum(m, n-1) + n;
	}// End of sum(m, n)
	
	public static int fibonacci(int n){
		recursion++;
		if(n == 1 || n == 2) return 1;
		return fibonacci(n-1) + fibonacci(n-2);		
	}// End of fibonacci method
	
	public static int GCD(int m, int n){
		recursion++;		
		if(n == 1) return 1;
		if(m%n == 0) return n;
		return GCD(n, m%n);		
	}// End of GCD method

}
