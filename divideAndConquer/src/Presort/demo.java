package Presort;

public class demo {

public static void main(String[] args) {
    int []a = {1,1,2,3,7,5,5,3,7,5,5,5,4,9,4,7};
    mergeSort(a);
    for(int i=0;i<a.length;i++){
        System.out.print(a[i]+"  ");
    }
}
    public static final void mergeSort(int [] a){
        if(a.length>1){
            int []left = getHalfArray(a,true);
            int []right = getHalfArray(a,false);
//            for(int i=0;i<right.length;i++){
//                System.out.print(right[i]+" ");
//            }
            mergeSort(left);
            mergeSort(right);
            getMerge(a,left,right);
        }
    }

    private static void getMerge(int[]a ,int[] left,int[] right) {
        int i=0;
        int j=0;
        int num =0;
        while (i<left.length&&j<right.length) {
            if (left[i] < right[j]) {
                a[num++] = left[i];
                i++;
            } else {
                a[num++] = right[j];
                j++;
            }
        }
            if(i<left.length){
                while (i<left.length)
                    a[num++] = left[i++];
            }
            if(j<right.length){
                while (j<right.length)
                    a[num++] = right[j++];
            }


    }

    public static int[] getHalfArray(int[] A,boolean judge){
        int[] result;
        if(!judge){
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
}
