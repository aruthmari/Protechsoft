package com.protechsoft.test;

import java.util.Arrays;

public class ArraySort {
	static void sortingProcess(int[] arr) {
		int i,j,key,len = arr.length;
		for(i=1;i<len;i++) {
			key = arr[i];
			j = i;
			if(arr[j-1]>arr[i]) {
				while(j>0 && arr[j-1]>key) {
					arr[j] = arr[j-1];
					--j;
				}
				++j;
				arr[j-1] = key;
			}else
				continue;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int[] arr = {19,8,15,4,14,7,0};
		sortingProcess(arr);
	}
}
