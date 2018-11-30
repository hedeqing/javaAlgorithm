package sequentialSearch;

public class Demo {
    public static void main(String[] args) {
        //给出数组
        int a[]={10,15,24,6,12,35,40,98,55};
        //给出要匹配的值
        int b = 9;
        //利用for循环
        for(int i = 0;i<=a.length-1;i++){
            if(a[i]==b){
                System.out.println("需要查找的值位置在"+(i+1));

            }else {
            if(i==a.length-1&&b!=a[i]){
                System.out.println("匹配失败");
            }
            }
        }
    }
}
