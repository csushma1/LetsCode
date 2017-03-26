import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
       
    public static int petrolPump( int[] a,int[] b, int n)
    {
        int start = 0;
        int end =  1;     
        int diff = a[start] - b[start]; 
        
        /*Enter if not all the petrol stations are traversed or 
        difference between quantity of petrol at station i is less than amount of petrol needed to reach petrol station i+1 */
        
        while (end != start || diff < 0)
        {
            
            /*Enter if not all the petrol stations are traversed and 
            difference between quantity of petrol at station i is less than amount of petrol needed to reach petrol station i+1 */
            
            while (diff < 0 && start != end)
            {
                
                /*Remove the starting petrol station from diff and increment starting station*/
                
                diff -= a[start] - b[start];
                start = (start + 1)%n;
                
                /* Return -1 if the entire stations are traversed */
                
                if (start == 0)
                   return -1;
            }
            diff += a[end]- b[end];     
            end = (end + 1)%n;
        }
        return start;
    }

    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        for(int i=0;i<N;i++){
            a[i] = scan.nextInt();
            b[i] = scan.nextInt();
        }
        System.out.println(petrolPump(a,b,N));
        scan.close();
    }
}
