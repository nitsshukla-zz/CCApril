package com.cc.apr15;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class CHEFLCM {
	static List<Long> primes=null; static Long ans=0L;
	
	public static void main(String[] args) {
		primes = getPrimes(100003);
		//System.out.println(primes);
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i=0;i<T;i++){
			Long n = scan.nextLong();
			if (n.compareTo(1L)==0)
				System.out.println("1");
			else System.out.println(getAns1(n));
			System.out.println();
		}
		scan.close();
	}
	private static Long getAns1(long n) {
		 List<Long> usedP = new ArrayList<Long>();	
		for(int i=0;i<primes.size()&&primes.get(i)<n;i++)
			if(n%primes.get(i)==0)
				usedP.add(primes.get(i));
		System.out.println(usedP);
		System.out.println(getC(usedP));
		return 0L;
	}

	private static String getC(List<Long> usedP) {
		if(usedP.size()==0)
			return "";
		Long first = usedP.get(0);
		for(int i=1;i<usedP.size();i++)
			System.out.println(first +" " + usedP.get(i));
		
		return getC(usedP.subList(1, usedP.size()));
	}
	public static List<Long> getPrimes(int N){
		List<Long> lst = new ArrayList<Long>(); 
		// initially assume all integers are prime
		boolean[] isPrime = new boolean[N + 1];
		for (int i = 2; i <= N; i++) {
			isPrime[i] = true;
		}

		// mark non-primes <= N using Sieve of Eratosthenes
		for (int i = 2; i*i <= N; i++) {

			// if i is prime, then mark multiples of i as nonprime
			// suffices to consider mutiples i, i+1, ..., N/i
			if (isPrime[i]) {
				for (int j = i; i*j <= N; j++) {
					isPrime[i*j] = false;
				}
			}
		}

		// count primes
		for (long i = 2; i <= N; i++) {
			if (isPrime[(int)i]) lst.add(i);
		}
		return lst;
	}
}


