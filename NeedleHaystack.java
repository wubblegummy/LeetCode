import java.util.*;
class NeedleHaystack {
    public int strStr(String haystack, String needle) {
        int index = haystack.indexOf(needle);
        return index;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        NeedleHaystack s = new NeedleHaystack();
        System.out.println("Enter the String: ");
        String haystack = sc.nextLine();
        System.out.println("Enter the element whose index has to be found:");
        String needle = sc.nextLine();
        s.strStr(haystack,needle);
        sc.close();
    }
}
