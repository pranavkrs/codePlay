package fib;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibMemoization {

	private static List<BigInteger> fibCache = new ArrayList<BigInteger>();
	static {
		fibCache.add(BigInteger.ZERO);
		fibCache.add(BigInteger.ONE);
	}

	public BigInteger fib(int n) {

		if(n >= fibCache.size())
			fibCache.add(n, (fib(n-1).add(fib(n-2))));

		return fibCache.get(n);

	}

	public static void main(String[] args) {

		FibMemoization fibobj = new FibMemoization();		
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
