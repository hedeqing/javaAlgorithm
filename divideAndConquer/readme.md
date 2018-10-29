#分支法
算法设计方法基于变换的思想，称为变治策略。

首先是"变"， 将问题的实例变形，变得更容易求解；然后是"治"，对问题的实例进行求解。

1）实例化简——同样问题

  * 6.1  预排序

   * 6.2  高斯消去法

   * 6.3  平衡查找树—AVL树

（2）改变表现——同样实例

   * 6.3  2-3树

   * 6.4  堆和堆排序

   * 6.5  霍纳法则和二进制幂

（3）问题化简——另一问题

##预排序

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

