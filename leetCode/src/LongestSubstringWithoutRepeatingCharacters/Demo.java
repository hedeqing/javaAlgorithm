package LongestSubstringWithoutRepeatingCharacters;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int sum = lengthOfLongestSubstring(s);
        System.out.println("sum = "+sum);
//        String  []a = new String[]{"a","b","c","a","b","c","b","b"};
//        check(a,"a");
    }

    /**
     *
     * @param s
     * @return
     */
    public static  int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}
