package hundredsOfChickens;

public class Demo {
    public  static  void main(String args[]){
        //组合数
        int num=0;
        //i,j,k分别是公鸡，母鸡，小鸡的数目，想定条件为100/钱数
        for(int i=0;i<100/5;i++){
            for (int j = 0;j<100/3;j++ ){
                for (int k = 0;k<100/1;k++){
                    if(100 == i*5+j*3+k){
                        System.out.println("公鸡"+i+" "+"母鸡"+j+" "+"小鸡"+k);
                        num++;
                    }
                }
            }
        }
        System.out.println("共有"+num+"组合");
    }
}
