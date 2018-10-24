package selectSort;

public class demo {
    public static void main(String[] args) {
        int a[] = {2,5,77,25,67,96,34,23};
        int temp;
        int min;
        //遍历第一次，找出最小的数；
        for (int i=0;i<=a.length-1;i++){
            min = i;
            for (int j = i+1;j<=a.length-1;j++)
                //第一次遍历，设定min为1，对后面的序列进行遍历，当后面的数比a[1]要小的时候，将下标min赋值为更小的数的下标
                if(a[min]>a[j]){
                    min = j;
                }
                //当最小值的下标不在最终位置时，两个值交换
                if(min!=i){
                    temp = a[min];
                    a[min] = a[i];
                    a[i] = temp;
                }
            }

        for (int i=0;i<=a.length-1;i++){
            System.out.print(a[i]+" ");
        }
    }
}
