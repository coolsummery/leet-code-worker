import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

/**
 * Created by baobinbin on 2016/12/26.
 * 给定一个数组和目标值，判断数组中相加得目标值的两个数的下标地址
 */
public class TwoSum {

//    Given nums = [2, 7, 11, 15], target = 9,
//
//    Because nums[0] + nums[1] = 2 + 7 = 9,
//            return [0, 1].

    public static void main(String[] args) {
        int[] nums = {0, 4, 3, 0};
        int target = 0;

        int[] a = twoSum(nums, target);
        System.out.println(a);


    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0, length = nums.length; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                int a = nums[i];
                int b = nums[j];
                if (a + b == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
