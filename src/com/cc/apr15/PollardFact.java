package com.cc.apr15;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class PollardFact {
	private final static BigInteger ZERO = new BigInteger("0");
	private final static BigInteger ONE  = new BigInteger("1");
	private final static BigInteger TWO  = new BigInteger("2");
	private final static SecureRandom random = new SecureRandom();

	public static BigInteger rho(BigInteger N) {
		BigInteger divisor;
		BigInteger c  = new BigInteger(N.bitLength(), random);
		BigInteger x  = new BigInteger(N.bitLength(), random);
		BigInteger xx = x;

		// check divisibility by 2
		if (N.mod(TWO).compareTo(ZERO) == 0) return TWO;

		do {
			x  =  x.multiply(x).mod(N).add(c).mod(N);
			xx = xx.multiply(xx).mod(N).add(c).mod(N);
			xx = xx.multiply(xx).mod(N).add(c).mod(N);
			divisor = x.subtract(xx).gcd(N);
		} while((divisor.compareTo(ONE)) == 0);

		return divisor;
	}
	static Set<BigInteger> set = new HashSet<BigInteger>();
	public static Set<BigInteger> factor(BigInteger N) {
		if (N.compareTo(ONE) == 0) return null;
		if (N.isProbablePrime(20)) { set.add(N); return  set; }
		BigInteger divisor = rho(N);
		factor(divisor);
		factor(N.divide(divisor));
		return set;
	}


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); int T = scan.nextInt();
		for(int i1=0;i1<T;i1++){
			BigInteger N = new BigInteger(scan.next());
			
			int k = scan.nextInt();
			set.clear();factor(N);
			Long l = N.longValue(); long mood=1000000007;
			long ans = 0L;
			if(k!=0)
				ans=(mul(l,l/2,mood));
			else ans=(mul(l,1,mood));
			
			//System.out.println(set);
			for(BigInteger b:set)
					ans = mul1(ans,b.longValue(),mood);
			
			System.out.println(ans);
		}

	}



	private static long mul1(Long l, long m, long mood) {
		//System.out.println(l+"  "+m);
		return (((l%mood)*(m-1))/m)%mood;
	}
	private static long mul(Long l, long m, long mood) {
		return ((l%mood)*(m%mood))%mood;
	}
}
