package bubbleSort;

public class Demo {
    public static void main(String[] args) {
        int a[]={1,2,32,6,22,26,43,3,45,66,42,23,445};
        int temp;
        //每一次都将一大值放到最后，进行n次筛选
        for(int i=0;i<a.length;i++)
            for(int j = 0;j<a.length;j++)
                if(a[i]<a[j]){
                    temp = a[i];
                    a[i]= a[j];
                    a[j] = temp;
                }

        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }

}
//下面出现偏序集时的改进冒泡方法
//public class Demo {
//    public static void main(String[] args) {
//        int a[]={1,2,32,6,22,26,43,3,45,66,42,23,445};
//        boolean exchange=true;
//        int temp;
//        boolean bound;
//        //每一次都将一大值放到最后，进行n次筛选
//        //第一趟起泡排序的范围是r[1]到r[n]
//        while (exchange)//仅当上一趟排序有记录交换才进行本趟排序
//        {
//            bound=exchange;
//            exchange=false;
//            for (int j=1; j<a.length-1; j++)          //一趟起泡排序
//                if (a[j]>a[j+1]) {
//                    temp = a[j];
//                    a[j]= a[j+1];
//                    a[j+1] = temp;  //记录每一次发生记录交换的位置
//                    exchange = true;
//                }
//        }
//
//
//        for(int i=0;i<a.length;i++)
//            System.out.print(a[i]+" ");
//    }
//
//}
