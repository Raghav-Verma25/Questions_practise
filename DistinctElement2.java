import java.util.HashSet;
import java.util.Set;

public class DistinctElement2 {
    public static void main(String[] args) {
        int arr[] = {5,4,5,6,45,4,2,4,5,6,10,8,10};
        Set<Integer> arr2 = new HashSet<>();
        for(int i : arr){
            arr2.add(i);
        }
        System.out.println("Distinct array is - ");
        System.out.println(arr2);
        int s = arr2.size();
        System.out.println(s);
    }
}
