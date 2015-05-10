package com.cc.may15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CHAPD {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i11=0;i11<T;i11++){
			long a = scan.nextLong(), b = scan.nextLong();
			long facs = primeFactors1(b);
			if(a%facs==0)
				System.out.println("Yes");
			else System.out.println("No");
		}
		scan.close();
	
	}
	
	
	public static long primeFactors1(long numbers) {
	    long n = numbers; long ans=1;
	    List<Long> factors = new ArrayList<Long>();
	    for (long i = 2; i <= n / i; i++) {
	      while (n % i == 0) {
	        if(!factors.contains(i))
	        	{
	        	factors.add(i);
	        	ans*=i;
	        	}
	        n /= i;
	      }
	    }
	    if (n > 1) {
	      factors.add(n);
	      if(!factors.contains(n))
	    	  ans*=n;
	    }
	    return ans;
	  }
}
