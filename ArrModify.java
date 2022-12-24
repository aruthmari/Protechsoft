package com.protechsoft.test;

import java.util.Arrays;

public class ArrModify {
	static void ModifyProcess(int[] arr) {
		int i,j=2,len = arr.length;
		for(i=0;i<len;i++)
			arr[i] = (arr[i]%j==1)? arr[i]-1:arr[i]+1;				
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		ModifyProcess(arr);
	}
}
