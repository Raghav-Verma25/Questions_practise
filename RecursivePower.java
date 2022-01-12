/*JAVA program to find power of a number using recursion */


public class PowerUsingRecursion {
    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        int s = power(a,b);
        System.out.println("a power b is "+ s);

    }

    public static int power(int a , int b){
        if(b==0){
            return 1;
        }
        else
            return (a * power(a,b-1));
    }
}
      
