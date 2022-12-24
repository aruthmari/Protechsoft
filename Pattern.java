package com.protechsoft.test;

public class Pattern {
	static void design(int i) {
		int j,k,len,x,n,s=i%2;
		x = (s==1)? i/2+1:i/2;
		n = (s==1)? 2:1;
		for(j=1;j<=i;j++) {
			if(j<=x)
				len = j;
			else {
				len = j-n;
				n+=2;
			}
			for(k=1;k<=len;k++)
				System.out.print(j);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int i = 10;
		design(i);
	}
}
