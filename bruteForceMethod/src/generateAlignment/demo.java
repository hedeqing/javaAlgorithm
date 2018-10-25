package generateAlignment;

//public class demo {
//    static int count;
//    public static void main(String[] args)throws Exception {
//        // TODO Auto-generated method stub
//        count=0;
//        String str="aabb";
//        char[] cs=str.toCharArray();
//        perm(cs,0);
//        System.out.print(count);
//        System.exit(0);
//    }
//    //全排列的递归算法
//    private static void perm(char[] c,int index)throws Exception{
//        //打印当前序列
//        if(index>=c.length){
//            for(int i=0;i<c.length;i++)
//                System.out.print(c[i]+" ");
//            System.out.print("\n");
//            count++;
//        }
//        //进行交换和递归
//        for(int i=index;i<c.length;i++){
//            if(!check(c,index,i)){     //若有重复元素则留到后面再处理
//                swap(c,index,i);
//                perm(c,index+1);
//                swap(c,index,i);
//            }
//        }
//    }
//    //数组里两个值交换
//    private static void swap(char[] c,int index1,int index2)throws Exception{
//        char t=c[index1];
//        c[index1]=c[index2];
//        c[index2]=t;
//    }
//    //去重函数
//    private static boolean check(char[] c,int index1,int index2){
//        while(index1<index2){
//            if(c[index1]==c[index2])
//                return true;
//            index1++;
//        }
//        return false;
//    }
//}

//不会。。。。。。下列时错误的
public class demo {
    public static void main(String[] args) {

        }
    public static int for_(int n){
        if(n == 1){
            return  1;
        }else if(n ==0){
            return 0;
        }else
             return n*for_(n-1);
    }

public static final int  shulie(int n ){
    int num = 0;
    num =  demo.for_(n);
    for(int i= 0;i<num;i++){

    }
    return  n;
    }
}