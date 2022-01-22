import java.io.*;
import java.util.*;
public class p {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int nums[]={-1,-2,3,4,234,100,5346,234,243,2345,23,421,342};
            int k=3;
            Arrays.sort(nums);
           // System.out.println(Arrays.toString(nums));
            int len = nums.length;
            int loop = len-k;
           // System.out.println("length is "+len +" loop value is "+loop);
            int arr2[] = new int[k];
            int j =0;
            for(int i =len-1 ; i>=loop ; i--){
                arr2[j]=nums[i];
                j=j+1;
            }
        //    System.out.println(Arrays.toString(arr2));
            int ind []= new int[k];
            int c=-1;
            int j2,j1;
                for( j1=0 ; j1<nums.length ; j1++){
                    for(j2=0 ; j2<arr2.length ; j2++){

                    if(arr2[j2]==nums[j1]){
                        c=c+1;
                        ind[c]=nums[j1];
                    }
                    }
                }
                System.out.println("ind is" + Arrays.toString(ind));
            //return Arrays.toString(ind);
        }
}


