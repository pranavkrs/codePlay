package fib;

import java.math.BigInteger;
import java.util.Scanner;

public class FibIterative {

	public BigInteger fib(int n) {

		BigInteger prev1 = BigInteger.ZERO;
		BigInteger prev2 = BigInteger.ONE;
		BigInteger savePrev;

		for(int i = 1; i <= n ; i++) {
			savePrev = prev1;
			prev1 = prev2;
			prev2 = savePrev.add(prev2);
		}

		return prev2;

	}

	public static void main(String[] args) {

		FibIterative fibobj = new FibIterative();		
		Scanner scan = new Scanner(System.in);

		System.out.println("Fibonacci through Iteration, Enter the value of n:");		
		int n = Integer.parseInt(scan.next());

		long startTime = System.currentTimeMillis();
		BigInteger fibResult = fibobj.fib(n);
		System.out.println("The Fibonacci value of Fib(" + n + "): " + fibResult );
		long endTime = System.currentTimeMillis();

		System.out.println("Time spent in seconds: " + (endTime - startTime)/1000);

		scan.close();		
	}

}
