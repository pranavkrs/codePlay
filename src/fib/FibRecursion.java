package fib;

import java.math.BigInteger;
import java.util.Scanner;

public class FibRecursion {

	public BigInteger fib(int n) {
		
		if(n == 1 || n == 2)
			return BigInteger.ONE;
		else
			return (fib(n -1).add(fib(n-2)));
	}
	
	public static void main(String[] args) {

		FibRecursion fibobj = new FibRecursion();		
		Scanner scan = new Scanner(System.in);

		System.out.println("Fibonacci through Memoization, Enter the value of n:");		
		int n = Integer.parseInt(scan.next());

		long startTime = System.currentTimeMillis();
		BigInteger fibResult = fibobj.fib(n);
		System.out.println("The Fibonacci value of Fib(" + n + "): " + fibResult );
		long endTime = System.currentTimeMillis();

		System.out.println("Time spent in seconds: " + (endTime - startTime)/1000);

		scan.close();		
	}
	
}
