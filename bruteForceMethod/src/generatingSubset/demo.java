package generatingSubset;

public class demo {
    public static void main(String[] args) {
        //输入集合S，求S的所有子集
        int []T = {1, 2 , 3, 4 };
        //我们知道子集的数量是2^T.length个
        int num  =(int)(Math.pow(2,T.length));
        int n=0;
        //枚举各子集所对应的编码0,1,2,...2^S.length-1
        for(int i=0;i<num;i++){
            //对每个数遍历，从右边开始
            for (int j = 0;j<T.length;j++){
                //判断那个是1，如果是1则显示在数组中该位置的数值即可。
                if ((i & (1 << j)) != 0) {
                    System.out.print(T[j] + " ");
                }
            }
            System.out.println();
        }

    }
}
