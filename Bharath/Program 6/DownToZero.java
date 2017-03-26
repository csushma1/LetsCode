import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	/* Function to find optimal solution for first 1000000 numbers */
	public static int[] downToZero(int[] arr){
		/* Initializing array */
		for(int i=0;i<1000001;i++){
			arr[i] = i;
		}
		double sqrt = Math.sqrt(1000000);
		for(int i=1;i<1000000;i++){
			int temp = arr[i] + 1;
			int j;
			if(arr[i+1] > temp)
				arr[i+1] = temp;
			if(i > sqrt)
				j = 1000000;
			else
				j = i*i;
			/* Assigning temp for all multiples of i*/
			for(int k=i+i;k<=j;k=k+i){
				if(arr[k] > temp)
					arr[k] = temp;
			}
		}
		return arr;
	}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
    	int Q = in.nextInt();
		int[] arr = new int[1000001];
    	downToZero(arr);
    	for(int i = 0;i<Q;i++){
    		int N = in.nextInt();
    		System.out.println(arr[N]);
    	}
    }
}