import java.sql.SQLOutput;

public class PrintNumberN_to_M {
    public static void Recursion_num(int i ,int n , int sum ){
        if(i==n){
            sum = sum +i;
            System.out.println("Sum is - "+sum);
            return ;
        }

        sum=sum+i;
        System.out.println(i);
        Recursion_num(i+1 , n , sum);

    }


    public static void main(String[] args) {
        Recursion_num(5 , 15 , 0);
        
    }
}
