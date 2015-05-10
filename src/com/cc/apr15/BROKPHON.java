package com.cc.apr15;
import java.util.Scanner;


public class BROKPHON {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i=0;i<T;i++){
			int n=scan.nextInt(),last=0,next=0,ans=0,cur;
				last=scan.nextInt();
				cur=scan.nextInt();
				if(last!=cur)
					ans++;
			for(int i1=2;i1<n;i1++){
				next=scan.nextInt();
				if(last!=cur || cur !=next)
					ans++;
				last=cur;
				cur=next;
				
			}
			if(last!=cur)
				ans++;
			System.out.println(ans);
		}
	scan.close();
	}
}
