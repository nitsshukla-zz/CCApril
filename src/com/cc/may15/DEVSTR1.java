package com.cc.may15;

import java.util.Scanner;

public class DEVSTR1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i11=0;i11<T;i11++){
			int n = scan.nextInt(), k = scan.nextInt();
			String s = scan.next();
			System.out.println(getCon1(new Con1(s, 0),k,-1));
			
		}
		scan.close();
	}
	public static Con1 getCon1(Con1 Con1, int k, int st){ 
		//System.out.println("debug..."+Con1);
		int Con1s=0;
		for(int i=1;i<Con1.a.length();i++){
			if(Con1.a.charAt(i)==Con1.a.charAt(i-1))
				Con1s++;
			if(Con1s==k){
				
				Con1 a1 = getCon1(Con1.flip(i), k,i),a2=a1;
				if(i-1!=st)
				 a2 = getCon1(Con1.flip(i-1), k,i-1);
				if(a1.flips<=a2.flips)
					return a1;
				else return a2;
			}
		}
		return Con1;
	}
}
