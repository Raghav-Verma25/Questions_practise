public class Fibonacci_Recursion {
    public static void Fabinacci(int a , int b ,int n){
        if(n==0){
            return ;
        }
        int c = a+b;
        System.out.print(c+ " ");
        Fabinacci(b ,c ,n-1);

    }

    public static void main(String[] args) {
            int a = 0 , b=1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        System.out.println("n number of term is - "  + n);
        System.out.println("Fibonacci series is-");
            Fabinacci(a,b,n-2);


    }
}
