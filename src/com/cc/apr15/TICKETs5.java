package com.cc.apr15;

import java.util.Scanner;

public class TICKETs5 {
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int T = scan.nextInt();
			for(int i1=0;i1<T;i1++){
				String tick = scan.next();char a,b;boolean brk=false;
				assert (tick.length()>=2);
					a=tick.charAt(0);b=tick.charAt(1);
				if(a==b){System.out.println("NO");continue;}
				for(int i=0;i<tick.length();i++){
					if(i%2==0 && tick.charAt(i)!=a)
						{System.out.println("NO");brk=true;break;}
					else if(i%2==1 && tick.charAt(i)!=b){
						System.out.println("NO");brk=true;break;
					}
				}
				if(!brk)System.out.println("YES");
			}
	}
}
