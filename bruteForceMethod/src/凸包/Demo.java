package 凸包;

import java.awt.*;

public class Demo {

    public static void main(String[] args) {
        //创建对象存放点
        Point[] A = new Point[8];
        //flag 存放是否是极点，初始化为0；
        A[0] = new Point(1,-5,0);
        A[1] = new Point(5,-10,0);
        A[2] = new Point(-8,1,0);
        A[3] = new Point(-5,7,0);
        A[4] = new Point(-2,-9,0);
        A[5] = new Point(5,7,0);
        A[6] = new Point(2,5,0);
        A[7] = new Point(-10,0,0);

        int a,b,c;

        /*条件 ax+by = c  a = y2-y1,b = x2-x1,c = x1y2-x2y1
        用sign1，sign2来存放在直线；两边得点得数目。
        */

        for(int i = 0;i<A.length;++i){
            for(int j = 0;j<A.length;++j){
                int sign1 = 0;
                int sign2 = 0;
                a =A[j].getY()-A[i].getY();
                b = A[j].getX()- A[i].getX();
                c = A[i].getX()*A[j].getY()-A[j].getX()*A[i].getY();
                for(int k=0;k<A.length;k++){
                    if(k==j||k==i){
                        continue;
                    }
                    if(a*A[k].getX()+b*A[k].getY()==c){
                        ++sign1;
                        ++sign2;
                    }
                    if(a*A[k].getX()+b*A[k].getY()>c){
                        ++sign1;
                    }
                    if(a*A[k].getX()+b*A[k].getY()<c){
                        ++sign2;
                    }
                }
                //当除了连线得两个顶点之外，当两边的点是剩下的所有点是即可，都在同一个方向，这样能找出四条直线将所有的点圈起来。
                if((sign1 ==(A.length-2))||(sign2==(A.length-2))){
                    A[i].setFlag(1);
                    A[j].setFlag(1);
                }


            }
        }
        System.out.println("符合凸包的点如下所示");
        for(int l=0;l<A.length;l++){
            if(A[l].getFlag()==1){
                System.out.println("("+A[l].getX()+","+A[l].getY()+")");
            }
        }
    }

    Graphics create() {
        return null;
    }

    //下面附上大佬的代码参考
    //    //蛮力法解决凸包问题，返回点集合中凸多  边形的点集合
//    public static Point[] getConvexPoint(Point[] A){
//        Point[] result = new Point[A.length];
//        int len = 0;  //用于计算最终返回结果中是凸包中点的个数
//        for(int i = 0;i < A.length;i++){
//            for(int j = 0;j < A.length;j++){
//                if(j == i)     //除去选中作为确定直线的第一个点
//                    continue;
//
//                int[] judge = new int[A.length];   //存放点到直线距离所使用判断公式的结果
//
//                for(int k = 0;k < A.length;k++){
//                    int a = A[j].getY() - A[i].getY();
//                    int b = A[i].getX() - A[j].getX();
//                    int c = (A[i].getX())*(A[j].getY()) - (A[i].getY())*(A[j].getX());
//
//                    judge[k] = a*(A[k].getX()) + b*(A[k].getY()) - c;  //根据公式计算具体判断结果
//                }
//
//                if(JudgeArray(judge)){  // 如果点均在直线的一边,则相应的A[i]是凸包中的点
//                    result[len++] = A[i];
//                    break;
//                }
//            }
//        }
//        Point[] result1 = new Point[len];
//        for(int m = 0;m < len;m++)
//            result1[m] = result[m];
//        return result1;
//    }
//
//    //判断数组中元素是否全部大于等于0或者小于等于0，如果是则返回true，否则返回false
//    public static boolean JudgeArray(int[] Array){
//        boolean judge = false;
//        int len1 = 0, len2 = 0;
//
//        for(int i = 0;i < Array.length;i++){
//            if(Array[i] >= 0)
//                len1++;
//        }
//        for(int j = 0;j < Array.length;j++){
//            if(Array[j] <= 0)
//                len2++;
//        }
//
//        if(len1 == Array.length || len2 == Array.length)
//            judge = true;
//        return judge;
//    }
//
//    public static void main(String[] args){
//        Point[] A = new Point[8];
//        A[0] = new Point(1,0);
//        A[1] = new Point(0,1);
//        A[2] = new Point(0,-1);
//        A[3] = new Point(-1,0);
//        A[4] = new Point(2,0);
//        A[5] = new Point(0,2);
//        A[6] = new Point(0,-2);
//        A[7] = new Point(-2,0);
//
//        Point[] result = getConvexPoint(A);
//        System.out.println("集合A中满足凸包的点集为：");
//        for(int i = 0;i < result.length;i++)
//            System.out.println("("+result[i].getX()+","+result[i].getY()+")");
//    }
}
