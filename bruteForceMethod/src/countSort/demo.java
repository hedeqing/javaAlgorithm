package countSort;

public class demo {
    public static void main(String[] args) {
        int []a = {2,2,3,3,7,9,9,3,2,4,5};
        //b的长度为（a的最大值-a的最小值+1）
        int []b = new int[8];
        int j=0;
        //初始化,赋值为0；
        for(j=0;j<b.length;j++)
            b[j] = 0;
        //将a的数字频率存进b里面，
        for(int i=0;i<a.length;i++){
            b[a[i]-2] = b[a[i]-2]+1;
        }
        //通过频率将a的数字排列
        for(j=0;j<b.length;j++)
                for(int k=0;k<b[j];k++){
                    System.out.print((j+2)+"  ");
                }
    }
}
