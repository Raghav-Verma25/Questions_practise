public class PalindromeUsingRecursion13 {
    public static void main(String[] args) {
        String s="abcba";
        int l=0;
        int r= s.length()-1;
        boolean result = isPalindrome(s,l,r);
        System.out.println(result);

    }
    public static boolean isPalindrome(String s, int l , int r){
        if(l>=r){
            return true;
        }
        if(s.charAt(l)!=s.charAt(r)){
            return false;
        }
        return isPalindrome(s,l+1,r-1);
    }
}
