package JavaSession_Day5;

import java.util.Arrays;
import java.util.Scanner;

public class DemoArraTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create and take input in sigle dimensional array
		Scanner c = new Scanner(System.in);
		// Binary search
		System.out.println("Enter the array size");
		int n=c.nextInt();
		int arr[] = new int[n];
		
		
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]= c.nextInt();
			System.out.println(arr[i]);
		}
		
		// display array
		
		int index = Arrays.binarySearch(arr, 3); // 2
		
		
		System.out.println(index);
		
		
	    Arrays.sort(arr);
	    
	    for(int j:arr) {
	    	System.out.println(j);
	    }
	    
	  String result=  Arrays.toString(arr);
	  System.out.println(result);

	}

}
