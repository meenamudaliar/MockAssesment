package samples;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBags {
  static int value;

	public static void main(String[] args) {
		int n;
		int testcase;
		int result=0;int k=0;
		int sum1=0,sum2=0, sum3=0;
		Scanner sc=new Scanner(System.in);
		testcase=sc.nextInt();
		while(k<testcase) {
		n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();	
		}
		int t=3;
		/*
		 * Test(arr,n,t,0,0,0,0); System.out.println(t+" "+value);
		 */
		int a1[]=new int[(n+1)/3];
		int a2[]=new int[(n-a1.length)/2];
		int a3[]=new int[n-(a1.length+a2.length)];
		for(int i=0;i<n;i++) {
			if(i<a1.length) {
				a1[i]=arr[i];
				sum1=sum1+a1[i];
			}
		}
		for(int i=0;i<n;i++) {
			if(i<a2.length) {
				a2[i]=arr[i+a1.length];
				sum2=sum2+a2[i];
			}
		}
		for(int i=0;i<n;i++) {
			if(i<a3.length) {
				a3[i]=arr[i+a1.length+a2.length];
				sum3=sum3+a3[i];
			}
		}
		if(sum1>sum2&&sum1>sum3) {
			result=1;
			}
			else if(sum2>sum1&& sum2>sum3) {
				result=2;
			}
			else if(sum3>sum1&&sum3>sum2) {
				result=3;
			}
			else {
				result=Math.min(Math.min(sum1, sum2),sum3);
				if(result==sum1) {
					result=1;
				}
				else if(result==sum2) {
					result=2;
				}
				else {
					result=3;
				}
			}
				
		
		System.out.println(t+" "+result);
		k++;
		result=0;
		sum1=0;sum2=0;sum3=0;
		}
		

	}
	
	

}
