// { Driver Code Starts
import java.util.*;
import java.lang.*;

class CountSort
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            String arr = "";
            arr = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.countSort(arr));
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to arrange all letters of a string in lexicographical 
    //order using Counting Sort.
    public static String countSort(String arr)
    {
        // code here
        String s2="";
        int len = arr.length();
        int arr2[] = new int[len];
        for(int i =0 ; i<arr.length(); i++){ 
            int asscii = (int)(arr.charAt(i));
            arr2[i] = asscii;
        }
        Arrays.sort(arr2);
        for(int j =0 ; j<arr.length() ; j++){
            s2 = s2 + (char)arr2[j];
        }
        return s2;
    }
}
