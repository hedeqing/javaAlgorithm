package Presort;

public class demo {

    public void mergeSort(int[] A){
        if(A.length > 1){
            int[] leftA = getHalfArray(A,0);   //数组A的左半部分
            int[] rightA = getHalfArray(A,1);  //数组A的右半部分
            mergeSort(leftA);
            mergeSort(rightA);
            getMerge(A,leftA,rightA);
        }
    }

    /*
     * 参数A：要进行折半的数组
     * 参数judge:judge == 0表示返回数组A左半部分，judge != 0表示返回数组A的右半部分
     * 函数功能：把数组按照长度均分为上半部分和下半部分
     */
    public int[] getHalfArray(int[] A,int judge){
        int[] result;
        if(judge == 0){
            result = new int[A.length/2];
            for(int i = 0;i < A.length/2;i++)
                result[i] = A[i];
        }
        else{
            result = new int[A.length - A.length/2];
            for(int i = 0;i < A.length - A.length/2;i++)
                result[i] = A[i+A.length/2];
        }
        return result;
    }
    /*
     *参数A：给定待排序数组
     *参数leftA:数组A的左半部分
     *参数rightA:数组的右半部分
     *函数功能：返回数组A的从小到大排序
     */
    public void getMerge(int[] A,int[] leftA,int[] rightA){
        int i = 0;       //用于计算当前遍历leftA的元素个数
        int j = 0;       //用于计算当前遍历rightA的元素个数
        int count = 0;   //用于计算当前得到按从小到大排序的A的元素个数
        while(i < leftA.length && j < rightA.length){
            if(leftA[i] < rightA[j]){
                A[count++] = leftA[i];
                i++;
            }
            else{
                A[count++] = rightA[j];
                j++;
            }
        }
        if(i < leftA.length){
            while(i < leftA.length)
                A[count++] = leftA[i++];
        }
        if(j < rightA.length){
            while(j < rightA.length)
                A[count++] = rightA[j++];
        }
    }
    //判断数组A（PS:数组A已是有序数组）中元素是否具有唯一性
    public boolean judgeOnlyElement(int[] A){
        for(int i = 0;i < A.length-1;i++){
            if(A[i] == A[i+1])
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        demo test = new demo();
        int[] A = {3,2,1,8,7,4,3,6,1,7,3,3,7,7,7,7};
        test.mergeSort(A);
        System.out.println("使用归并排序后数组A的结果：");
        for(int i = 0;i < A.length;i++)
            System.out.print(A[i]+" ");
        if(test.judgeOnlyElement(A))
            System.out.println("\n数组A中的元素具有唯一性");
        else
            System.out.println("\n数组A中的元素不具有唯一性");

        int[] B = {9,8,7,6,5,4,3,2,1};
        test.mergeSort(B);
        System.out.println("使用归并排序后数组B的结果：");
        for(int i = 0;i < B.length;i++)
            System.out.print(B[i]+" ");
        if(test.judgeOnlyElement(B))
            System.out.println("\n数组B中的元素具有唯一性");
        else
            System.out.println("\n数组B中的元素不具有唯一性");
    }
//public static void main(String[] args) {
//    int []a = {1,1,2,3,7,5,5,3,7,5,5,5,4,9};
//    mergeSort(a);
//}
//    public static final void mergeSort(int [] a){
//        if(a.length>1){
//            int []left = getHalfArray(a,true);
//            int []right = getHalfArray(a,false);
//            mergeSort(left);
//            mergeSort(right);
//            getMerge(a,left,right);
//        }
//    }
//
//    private static void getMerge(int[]a ,int[] left,int[] right) {
//        int i=0;
//        int j=0;
//        int num =0;
//        while (i<left.length&&j<right.length){
//            if(left[i]<right[j]){
//                a[num++] = left[i];
//                i++;
//            }else {
//                if(left[i]>right[j]){
//                    j++;
//                }
//            }
//            if(i<left.length){
//                a[num++] = left[i++];
//            }
//            if(j<right.length){
//                a[num++] = right[j++];
//            }
//        }
//
//    }
//
//    public static final int [] getHalfArray(int []a,boolean judge){
//        int[] temp = new int[a.length/2];
//        int num = 0;
//        if(judge){
//            for(int i= 0;i<a.length/2;i++){
//                temp[num++] = a[i];
//            }
//        }else {
//            for(int i= a.length/2;i<a.length;i++){
//                temp[num++] = a[i];
//            }
//        }
//        return  temp;
//    }
}
