package Backpack01;

public class demo {
    public static void main(String[] args) {
        int []weight = {3,4,5,7};
        int []value = {12,40,25,42};
        int all_value,all_weight;
        int n = (int)Math.pow(2,weight.length);
        for(int i=0;i<n;i++){
            all_value = 0;
            all_weight = 0;
                for(int j=0;j<weight.length;j++){
                    if((i&(1<<j))!=0){
                        System.out.print(weight[j]+"  ");
                        //System.out.println();
                        all_value = all_value+value[j];
                        all_weight = all_weight+weight[j];
                    }
                }
            System.out.print("价值是： "+all_value+" ");
            System.out.print("重量是： "+all_weight);
            System.out.println();
        }

    }

}
