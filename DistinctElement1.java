import java.util.Arrays;
import java.util.Scanner;

public class DistinctElement1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {5,10,3,5,8,3,8,9,9,7,7,9,5};  // 5 10 3 8 9 7
        System.out.println(Arrays.toString(arr));
        int d=0;
        int j;
        for(int i =0 ; i<arr.length ; i++){
            for(j = 0 ;j<i ; j++){
                if(arr[j]==arr[i]){
                    break;
                }}
                if(i==j){
                    System.out.println("distinct array is ");
                    System.out.print(arr[i]+ " ");
                    d=d+1;
            }

        }
        System.out.println();
        System.out.println("total number of distinct element in array is "+d);
       // System.out.println(arr.length-d);
    }
}
