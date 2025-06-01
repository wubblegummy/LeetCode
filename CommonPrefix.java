import java.util.*;
class CommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        for (int i=0;i<strs.length;i++){
            if ((strs[0].charAt(i))==(strs[1].charAt(i)) && (strs[1].charAt(i))==(strs[2].charAt(i))){
                prefix +=strs[1].charAt(i);
            }
        }
        return prefix;
    }
    /*if (strs[i].compareTo(strs[i+1])&&strs[i].compareTo(strs[i+2])){
        return strs[i];
    }
    else if (strs[i].compareTo(strs[i+1])&&strs[i].compareTo(strs[i+2]))*/
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        CommonPrefix s = new CommonPrefix();
        System.out.println("Enter the words: ");
        String[] word = sc.nextLine().split(",");
        String[] strs = new String[word.length];
        for (int i=0;i<word.length;i++){
            strs[i] = word[i];
        }
        System.out.println(s.longestCommonPrefix(strs));
        sc.close();
    }
}