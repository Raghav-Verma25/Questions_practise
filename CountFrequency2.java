/*Count the frequency of the alphabet in String*/

import java.util.Arrays;

public class CountFrequency2 {
    public static void main(String[] args) {
                String str = "abcdefabscfs";
                int len= str.length();
                /*char[] ch = str.toCharArray();
                 System.out.println(Arrays.toString(ch));
                //String st2 = Character.toString(Integer.parseInt(Arrays.toString(ch)));
                 //String st2= Character.toString(ch);
                System.out.println(st2);*/
                int newarr[] = new int [len];
                int visit=-1;
                for (int i = 0; i <len ; i++) {
                    int count =1;
                    for(int j =i+1 ; j<len ; j++){
                        if(str.charAt(i)==str.charAt(j)){
                            count = count +1;
                            newarr[j]=visit;
                        }
                    }
                    if(newarr[i]!=visit) {
                        newarr[i]=count;
                    }
                }
                for(int j =0 ; j<len ; j++){
                    if(newarr[j]!=visit){
                        System.out.println("The frequency of "+str.charAt(j)+" is "+newarr[j]);
                        //System.out.print(str.charAt(j)+""+newarr[j]);
                    }
                }
            }




}
