蛮力法虽然理论上可以解决很多问题，但是之只能使用来解决一些小规模的问题。（c语言），代码实现的时候使用的是Java语言
蛮力法框架
BruteForce()
{  n=0;
   for(k=区间下限；k<=区间上限；k++)
       if(约束条件)
         {  找到一个解；
            n++;
          }
    return(汇总的解)；
}

如百钱百鸡：
BruteForce()
{  n=0;
   for(k=区间下限；k<=区间上限；k++)
       if(约束条件)
         {  找到一个解；
            n++;
          }
    return(汇总的解)；
}

顺序查找：
 int SeqSearch2(int r[ ], int n, int k)  //数组r[1] ~ r[n]存放查找集合
   {
     r[0]=k; i=n;
     while (r[i]!=k)
        i --;
     return i;
}

模式匹配：
BruteForceStringMatch(T[0..n-1],P[0..m-1])
//文本T[0..n-1]长度为n
//模式P[0..m-1]长度为m
//查找不成功时返回-1
for i=0 to n-m do
     j=0
     while j<m and P[j]==T[i+j] do
           j=j+1
     if i=m return i
return -1
）

选择排序
void SelectSort(int r[ ], int n)  //数组下标从1开始
    {
       for (i=1; i<=n-1; i++)   //对n个记录进行n-1趟简单选择排序
       {
          index=i;
          for (j=i+1; j<=n; j++)   //在无序区中找最小记录
            if (r[j]<r[index]) index=j;
          if (index!=i) r[i]←→r[index];  //若最小记录不在最终位置则交换
       }
    }

