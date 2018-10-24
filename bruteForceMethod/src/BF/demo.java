package BF;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        String S = "abcdefabcdefabcdefabcdefgabcdef";
        String T = "abcdefg";
        //直接用内置函数compareTo，返回适配的下标
        System.out.println(S.length());
        System.out.println(T.length());

//        System.out.println(S.compareTo(T));
//        for (int i=0;i<S.length();i++){
//            System.out.print(S.charAt(i));
//        }
        //取n 能很好的控制S的序列，一旦不成功就从写一个字符开始,T的遍历放在S中比较好
        int n = 0;
        for (int i = 0; i <= T.length() - 1; ) {
            for (int j = n; j < S.length() - 1; j++) {

//                if(i>T.length()){
//                    System.out.println("字符串匹配失败");
//                    break;
//                }

                if (i != T.length() && j < S.length()) {
                    if (T.charAt(i) == S.charAt(j)) {
                        System.out.println("匹配成功  T: " + T.charAt(i) + "  S :  " + S.charAt(j));
                        i++;
                    } else {
                        System.out.println("匹配失败并重新匹配");
                        i = 0;
                        n = n + 1;
                        continue;
                    }
                } else {
                    System.out.println("字符串匹配成功");
                    break;
                }


            }
        }
    }
}

//下面附上别人大佬的代码
//public class demo {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please input main string:");
//        String mainString = scanner.nextLine();// 从标准输入读取主串
//        System.out.println("Please input sub string:");
//        String subString = scanner.nextLine();// 从标准输入读取子串
//        scanner.close();
//        demo.match(mainString, subString);
//    }
//
//    /**
//     * @param s
//     *            主串
//     * @param t
//     *            子串
//     */
//    public static void match(String s, String t) {
//        int index = 0;// 成功匹配的位置
//        int sLength = s.length();// 主串长度
//        int tLength = t.length();// 子串长度
//        if (sLength < tLength) {
//            System.out.println("Error.The main string is greater than the sub string length.");
//            return;
//        }
//        int i = 0;
//        int j = 0;
//        while (i < sLength && j < tLength) {
//            if (s.charAt(i) == t.charAt(j)) {// 判断对应位置的字符是否相等
//                i++;// 若相等，主串、子串继续依次比较
//                j++;
//            } else {// 若不相等
//                i = i - j + 1;// 主串回溯到上次开始匹配的下一个字符
//                j = 0;// 子串从头开始重新匹配
//            }
//        }
//        if (j >= tLength) {// 匹配成功
//            index = i - j;
//            System.out.println("Successful match,index is:" + index);
//        } else {// 匹配失败
//            System.out.println("Match failed.");
//        }
//    }
//}