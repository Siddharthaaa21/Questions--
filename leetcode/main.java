
package leetcode;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Tow_sum ob=new Tow_sum();
        int nums[]={0,2,3,4};int arr[]=new int[2];
        arr[2]=ob.twoSum(nums,5);
        System.out.println(Arrays.toString(arr));
    }
}