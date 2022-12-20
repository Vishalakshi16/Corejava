package com.xworkz.showroomapp;

public class ThirdLaregest {
	public static void main(String args[]){
		int temp;
		
	
int arr[]={25,11,7,75,58}; 


for(int i=0;i<arr.length;i++){ //loop through the array
	for (int j = i+1; j <arr.length; j++) {
		if(arr[i]>arr[j]) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
		}
	}
}
System.out.println(" third largest element present in given array"+arr[arr.length-3]);
}
}


