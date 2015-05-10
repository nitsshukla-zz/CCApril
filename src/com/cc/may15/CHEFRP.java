package com.cc.may15;

import java.util.Scanner;

public class CHEFRP {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i11=0;i11<T;i11++){
			int N = scan.nextInt();int min1=Integer.MAX_VALUE,total = 0;
			for(int i=0;i<N;i++){
				int temp=scan.nextInt();
				total+=temp;
				if(temp<min1)min1=temp;
			}
			/*if(N==1)
				System.out.println(2);
			else*/ if(min1<2)
				System.out.println(-1);
			else System.out.println(total-min1+2);
		}
		scan.close();
	}
}
