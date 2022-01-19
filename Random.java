import java.util.*;
public class Random {
    public static void main(String[] args) {
        System.out.print("Random method is used to create random number between 0 to 1 is - ");
        System.out.println(Math.random());
        System.out.print("generate random number between a specified range - ");
        int min = 500;
        int max =900;
        int ran = (int)(Math.random() * (max - min +1)) +min ;
        System.out.println(ran);

        System.out.print("create float random number - ");
        float ran2 = (float)Math.random();
        System.out.println(ran2);

        System.out.print("create float random number - ");
        double ran3 = (double)Math.random();
        System.out.println(ran3);


    }
}
