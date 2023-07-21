//package com.dsa;

public class mathmatice {

	public static void main(String[] args) {
		int n=5;
		System.out.println(fact(n));
		
		int k=30;
		System.out.println(zero(k));
		
		// palidrom of number
         int s=505;
		int temp=s;
		int sum=0;
		while(s>0) {
			sum=(sum*10)+s%10;
			s=s/10;
		}
		if(sum==temp) {
		   System.out.println("palidrom no");}
		else {
			System.out.println("not palidrome");
		}
		
	
	   // find gcd
		System.out.println(gcd(15,27));
	
	   // find power of a number
		System .out.println(power(2,4));
		
		// find unique number
		int nums[]= { 1,2,3,4,1,2,3};
		System.out.println(uniqueno(nums));
		
		// find  two unique element in array
		int arr[]= {1,2,3,4,1,2,3,8};
		unique(arr);
		
		
	}

	private static int  uniqueno(int[] nums) {
		int ans=0;
		for(int l=0;l<nums.length;l++) {
			ans=ans^ nums[l];
		}
		return ans;
	}

	private static void  unique(int[] arr) {
		// TODO Auto-generated method stub
		int k=0;
		for(int i=0;i<arr.length;i++) {
			k^=arr[i];
		}
		k=k^(-k);
		int k1=0; int k2=0;
		for(int i=0;i<arr.length;i++) {
			if((arr[i] & k)>0) {
				k1=k1^ arr[i];	
			}else {
				k2=k2 ^ arr[i];
			}
		}
		System.out.println(k1 +" "+k2);
	}

	private static int power(int i, int j) {
		// TODO Auto-generated method stub
		int ans =1;
		while(j>0) {
			if((j& 1)!=0) {
				ans=ans*i;
			}
			i=i*i;
			j=j>>1;
		}
		
		return ans;
	}

	private static int gcd(int a, int b) {
		if(b==0) return a;
		return gcd(b,a%b);
	}

	// factorial of number
	static int  fact(int n) {
		if(n==0 || n==1) {
			return 1;
			
		}
		else {
			return (n*fact(n-1));
		}
	}
	
	// trailing zeroes in factorial
	private static int zero(int k) {
		int res=0;
		for(int i=5;i<=k;i=i*5) {
			res=res+k/i;
		}
		return res;
	}
	
	//palidrome of number;

}
