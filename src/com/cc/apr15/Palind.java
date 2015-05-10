package com.cc.apr15;

import java.util.Scanner;

public class Palind {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i1=0;i1<T;i1++){
			String word1 = scan.next();int ans=0;
			for(int i=1;i<=word1.length();i++){
				
				for(int i2=0;i2<i-1;i2++){
					String word = word1.substring(i2,i);
					System.out.println(word);
					if(isPalin(word))
						ans+=(1+palin(word));
				}
				ans+=1;
			}System.out.println(ans);
		}
		
	}

	private static int palin(String word) {
		if(word.length()==1) return 0;
		String word1 = word.substring(0,word.length()/2);
		if(!isPalin(word1))
			return 1;
		else return 1+palin(word1);
	}

	private static boolean isPalin(String word) {
		if(word.length()<=1) return false;
		for(int i=0;i<word.length()/2;i++)
			if(word.charAt(i)!=word.charAt(word.length()-1-i))
				return false;
		return true;
	}

}
