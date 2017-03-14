import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

public class Solution {
    
	public static int rainWaterTrap(ArrayList<Integer> al){
		int left=0; int right=al.size()-1;
        int res=0;
        int maxleft=0, maxright=0;
        while(left<=right){
            if(al.get(left)<=al.get(right)){
                if(al.get(left)>=maxleft) maxleft=al.get(left);
                else res+=maxleft-al.get(left);
                left++;
            }
            else{
                if(al.get(right)>=maxright) maxright= al.get(right);
                else res+=maxright-al.get(right);
                right--;
            }
        }
        return res;
    }
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<Integer>();
        while(in.hasNextInt()){            
        	al.add(in.nextInt());
        }
        in.close();
        System.out.println(rainWaterTrap(al));
        
    }
}
