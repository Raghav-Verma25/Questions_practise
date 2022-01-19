import java.util.Arrays;

public class SumOfNumberInString {
    public static void main(String[] args) {
        String s= " abc34de7bjkl1";
        String temp="0";
        int sum=0;
        //char ch[] = new char[s.length()];
        char ch []= s.toCharArray();
        for(int i=0 ; i<s.length() ; i++){
            if(Character.isDigit(ch[i])){
                temp = temp+ch[i];
            }
            else{
                sum=sum+ Integer.parseInt(temp);
                temp="0";
            }
        }
        System.out.println(sum + Integer.parseInt(temp));
    }
}
