import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        double d;
        d= sc.nextDouble();
        n = (int)Math.floor(d);
        if(n==d){
            System.out.println("Number is integer "+n);
        }
        else{
            System.out.println("Number is float "+n);
        }

    }
}
