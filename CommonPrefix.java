import java.util.*;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        for (int i=0;i<strs[0].length();i++){
            char c = strs[0].charAt(i);
            for (int j=0;j<strs.length;j++){
                if (i>=strs[j].length() || strs[j].charAt(i)!=c){
                    return prefix;
                }
            }
           prefix +=c;
        }
    return prefix;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();
        System.out.println("Enter the words: ");
        String[] tokens = sc.nextLine().split(",");
        String[] strs = new String[tokens.length];
        for (int i=0;i<tokens.length;i++){
            strs[i] = tokens[i];
        }
        System.out.println(s.longestCommonPrefix(strs));
        sc.close();
    }
}