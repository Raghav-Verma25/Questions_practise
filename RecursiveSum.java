/*Find the sum of n natural number using recursion */

public class sumUsingRecursion {
    public static void main(String[] args) {
        int i = 5;
        int s = sum(i);
        System.out.println("Sum = " + s);
    }
    public static int sum(int i) {
        if (i != 0)
            return i + sum(i - 1);
        else
            return i;
    }
}




