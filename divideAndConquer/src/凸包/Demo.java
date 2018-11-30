package 凸包;

import java.util.Arrays;


public class Demo {
    static double[] s = new double[8];
    static Point[] A = new Point[8];
    public static void main(String[] args) {
        A[0] = new Point(1, -5);
        A[1] = new Point(5, -10);
        A[2] = new Point(-8, 1);
        A[3] = new Point(-5, 7);
        A[4] = new Point(-2, -9);
        A[5] = new Point(5, 7);
        A[6] = new Point(2, 5);
        A[7] = new Point(-10, 0);
        Arrays.sort(A,0,8);
        System.out.println(A[0].getX() + "," + A[0].getY());
        hull(1, 7,A[0],A[0]);
    }

    /**
     *
     * @param l
     * @param r
     * @param p1
     * @param p2
     */
    private static void hull(int l,int r,Point p1,Point p2){
        int x=l;
        int i=l-1,j=r+1;
        /**
         * 找出距离直线p1-p2最远的点p3
         * */
        for (int k = l; k <= r; k++){
            if (s[x] - s[k] <= 0) {
                x=k;
            }
        }
        Point p3 = A[x];
        /**
         * p1-p3左侧的点
         * */
        for (int k = l; k <= r; k++) {

            s[++i] = cross(A[k], p1, p3);
            if (s[i] > 0) {
                Point temp = A[i];
                A[i] = A[k];
                A[k] = temp;
            } else {
                i--;
            }
        }
        /**
         * 直线p3-p2右侧的点
         * */
        for (int k=r;k>=l;k--) {
            s[--j]=cross(A[k], p3, p2);
            if (s[j] > 0) {
                Point temp = A[j];
                A[j] = A[k];
                A[k] = temp;
            } else {
                j++;
            }
        }
        /**
         * 分治，并中序输出
         * */
        if (l <= i) {
            hull(l, i, p1, p3);
        }
        System.out.println(p3.getX() + "," + p3.getY());
        if (j <= r) {
            hull(j, r, p3, p2);
        }
    }

    /**
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    private static double cross (Point a, Point b, Point c) {
        return (b.getX()-a.getX())*(c.getY()-a.getY())-(b.getY()-a.getY())*(c.getX()-a.getX());
    }
}
