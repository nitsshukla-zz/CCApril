package com.cc.may15;

import java.util.Arrays;
import java.util.Scanner;

public class SETDIFF {
	static int modV = 1000000007;
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i11=0;i11<T;i11++){
			int N = scan.nextInt();int[] arr = new int[N];
			for(int i=0;i<N;i++)
				arr[i]=scan.nextInt();
			Arrays.sort(arr); int ans=0,max=0,min=0,c=1;
			for(int i=1;i<N;i++){
				c = mul(c,2);
				min = mul(min,2)+arr[i-1]; max = mul(c-1,arr[i]);
				ans += max-min; 
				//System.out.println(max +"  "+min);
			}
			System.out.println(ans);
		}
		scan.close();
	
	}
	private static int mul(int min, int i) {
		long ans = (min%modV)*(i%modV);
		return (int) (ans%modV);
	}
}
