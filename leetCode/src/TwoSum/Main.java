package TwoSum;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int [] c = {3,3};
        int []a = new int[2];
        a = twoSum2(c,6);
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    /**
     *
     * @param nums
     * @param target
     * @return
     */
    public  static  int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
            for (int j = i+1;j<nums.length;j++) {
                if ((nums[i] + nums[j]) == target) {
                    return new int[] { i, j };
                }
            }
        throw new IllegalArgumentException("No two sum solution");
    }
//    /*
//     哈希表法：事实证明我们可以一次通过。当我们迭代并将元素插入表中时，我们还会回顾检查表中是
//     否已存在当前元素的补码。如果存在，我们找到了解决方案并立即返回。
//     */

    /**
     *
     * @param nums
     * @param target
     * @return
     */
    public  static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            //判断是否存在另外一个数并且这个数不是前面减去的数
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
