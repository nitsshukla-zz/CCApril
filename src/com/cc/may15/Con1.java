package com.cc.may15;


public class Con1{
	String a; int flips;
	public Con1(String a, int f){this.a=a;flips=f;}
	public Con1 flip(int n){
		Con1 a1 = new Con1(a+"", flips);
		
		StringBuilder sb = new StringBuilder(a);
		sb.setCharAt(n, sb.charAt(n)=='1'?'0':'1');
		a1.a=sb.toString();a1.flips++;
		return a1;
	}
	@Override
	public String toString() {
		return flips+"\n"+a;
	}
	
}