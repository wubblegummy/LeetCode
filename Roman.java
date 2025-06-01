import java.util.*;
class Roman {
    public int romanToInt(String s) {
                int length = s.length();
        int sum = 0;
        for (int i=(length-1);i >= 0;i--){
            if(s.charAt(i)=='I'){
                sum += 1;
            }
            else if (s.charAt(i)=='V'){
                sum += 5;
                if (i > 0 && s.charAt(i-1)=='I'){
                    sum-=1;
                    i--;
                }
            }
           else if (s.charAt(i)=='X'){
               sum+=10;
               if (i > 0 && s.charAt(i-1)=='I'){
                   sum-=1;
                   i--;
               }
           }
           else if (s.charAt(i)=='L'){
               sum+=50;
               if (i > 0 && s.charAt(i-1)=='X'){
                   sum-=10;
                   i--;
               }
           }
           else if (s.charAt(i)=='C'){
               sum+=100;
               if (i > 0 && s.charAt(i-1)=='X'){
                   sum-=10;
                   i--;
               }
           }
           else if (s.charAt(i)=='D'){
               sum+=500;
               if (i > 0 && s.charAt(i-1)=='C'){
                   sum-=100;
                   i--;
               }
           }
           else if (s.charAt(i)=='M'){
               sum+=1000;
               if (i > 0 && s.charAt(i-1)=='C'){
                   sum-=100;
                   i--;
               }
           }
           else {
               sum +=0;
           }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Roman sol = new Roman();
        System.out.println("Enter a roman number");
        String s = sc.nextLine();
        System.out.println(sol.romanToInt(s));
        sc.close();
    }
}