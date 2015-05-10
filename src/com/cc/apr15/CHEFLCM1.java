package com.cc.apr15;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class CHEFLCM1 {
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
	private static Long getAns1(Long n) {
		Long ans=0L;
		Map<Long, Long> factMap = new HashMap<Long, Long>();
		for(Long p: primes)
			if(n%p==0)
				factMap.put(p, 1L);
			else if(p>n)
				break;
		for(Long l:factMap.keySet())
			factMap.put(l,getExp(n,l));
		//System.out.println(factMap);
		
		ans= getAns(factMap);
		if(factMap.size()==1 && factMap.get(1)==n)
			ans+=1;
		else if(factMap.size()>1)
			ans+=n+1;

		return ans;
	}
	private static Long getAns(Map<Long, Long> factMap) {
		Long ans=0L;
		for(Long l:factMap.keySet())
			ans +=(long) (-1+Math.pow(l, 1+factMap.get(l))/(l-1));
		return ans;
	}
	private static long getExp(long n, long l) {
		Integer cont =0;long rep=n/l;
		for(long i=0;i<rep;i++)
				if(n%l==0){
					cont++;n/=l;
				}
				else return cont;
		return cont;
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
