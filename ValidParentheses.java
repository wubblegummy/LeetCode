import java.util.*;
class ValidParentheses {
    public boolean isValid(String s) {
        char[] c = s.toCharArray();
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        for (int i = c.length-1; i>=0; i--){
            if (c[i] == 125){
                for(int j = i-1;j>=0;j--){
                    if (c[j] == 123) {
                        flag1 = true;
                    }
                    else {
                       flag1 = false; 
                    }
                }
            }
            
            else if (c[i] == 93){
                for(int j = i-1;j>=0;j--){
                    if (c[j] == 91){ 
                        flag2 = true;
                    }
                    else {
                        flag2 = false;
                    }
                }
            }
            else if (c[i] == 41){
                for(int j = i-1;j>=0;j--){
                    if (c[j] == 40) {
                        flag3 = true;
                    }
                    else{
                        flag3 = false;
                    }
                }   
            }
            else {
                return false;
            }
        }
        if (flag1 == flag2 == flag3){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String args[]){
        ValidParentheses vp = new ValidParentheses();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String of Brackets:");
        String s = sc.nextLine();
        System.out.println(vp.isValid(s));
        sc.close();
    }
}