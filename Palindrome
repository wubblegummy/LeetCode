import java.util.*;
class Palindrome {
    public boolean isPalindrome(int x) {
        int a,num = x;
        int sum = 0;
        while (num>0){
          a = num % 10;
          sum = (sum*10)+a;
          num = num/10;
        }
        if (sum==x){
            return true;
        } 
    return false;   
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Palindrome s = new Palindrome();
        System.out.println("Enter an integer: ");
        int x = sc.nextInt();
        System.out.println(s.isPalindrome(x));
        sc.close();
    }
}