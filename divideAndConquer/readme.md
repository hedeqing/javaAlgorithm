#分治法
算法设计方法基于变换的思想，称为变治策略。

首先是"变"， 将问题的实例变形，变得更容易求解；然后是"治"，对问题的实例进行求解。
分治法的基本框架

    divide-and-conquer(P)
      {
        if ( | P | <= n0) adhoc(P);//解决小规模的问题
        divide P into smaller subinstances P1,P2,...,Pk；//分解问题
        for (i=1,i<=k,i++)
          yi=divide-and-conquer(Pi);//递归的解各子问题
        return merge(y1,...,yk);  //将各子问题的解合并为原问题的解

1）实例化简——同样问题

  * 6.1  预排序

   * 6.2  高斯消去法

   * 6.3  平衡查找树—AVL树

（2）改变表现——同样实例

   * 6.3  2-3树

   * 6.4  堆和堆排序

   * 6.5  霍纳法则和二进制幂

（3）问题化简——另一问题

##预排序（归并排序）

预排序问题在许多地方都有应用，因为如果输入的序列是有序的
，则可以用更加简单的处理方式。

因此很多问题需要先排序，则该问题的时间效率依赖于排序算法的效率。

     int ststmode([0..n-1])
    {  i=0;    modestat=0;
        while(i<=n-1)
        { curlength=1;  curval=A[i];
           while((i+curlength<=n-1)&&(A[i+curlength]==curval))
           curlength++;
           if(curlength>modestat)
           { modestat=curlength; modeval=curval;     }
           i+=curlength;
          }
         return modeval;
    }

快排

    void QuickSort(int r[ ], int first, int end)
      {
         if (first<end) {
            pivot=Partition(r, first, end);
              //问题分解，pivot是轴值在序列中的位置
            QuickSort(r, first, pivot-1);
              //递归地对左侧子序列进行快速排序
            QuickSort(r, pivot+1, end);
             //递归地对右侧子序列进行快速排序
         }
      }

折半查找

 第一步 ：先排序，利用各种方法排序

 第二部; 查找，先折半，然后递归折半即可

     public static int binareSearch(int[] a, int low, int high, int var) {
             int n = a.length;
             int mid;
             if (low > high)
                 return -1;
             else {
                 mid = (low + high) / 2;
                 if (a[mid] == var) {
                     return mid;
                 } else if (a[mid]>var)
                    return binareSearch(a,mid+1,high,var);
                 else return  binareSearch(a,low,mid-1,var);
             }
         }