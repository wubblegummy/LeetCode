import java.util.*;
class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        for (int i=0;i<n;i++){
            if (nums[i]==val){
                for (int j=i;j<n-1;j++)
                    nums[j] = nums[j+1];
                    n--;
                    i--;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RemoveElement s = new RemoveElement();
        System.out.println("Enter the array elements: ");
        String[] input = sc.nextLine().split(",");
        int n = input.length;
        int nums[] = new int[n];
        for(int i = 0; i<n; i++){
            nums[i] = Integer.parseInt(input[i]);
        }
        System.out.println("Enter the value: ");
        int val = sc.nextInt();
        s.removeElement(nums,val);
        sc.close();
    }
}
