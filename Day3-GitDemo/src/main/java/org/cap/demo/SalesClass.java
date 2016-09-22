package org.cap.demo;

public class SalesClass {
	
	int[] arr={1,2,3,45};
	
	public void display(){
		System.out.println("Sales Class Display method");
		System.out.println("Array Data Display:");
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			System.out.println(arr[i]);
		}
	}

}
