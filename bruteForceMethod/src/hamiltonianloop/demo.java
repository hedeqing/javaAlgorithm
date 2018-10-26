package hamiltonianloop;

public class demo {

    public static void main(String[] args) {
        int [][]adjMatrix = {{0,1,1,1,0},
                {1,0,1,0,1,},
                {1,1,0,1,0},
                {1,0,1,0,1},
                {0,1,0,1,0},
        };
        demo.getHamiltonCircuit(adjMatrix);
    }
    public static  void getHamiltonCircuit(int[][] adjMatrix) {
        boolean []use = new boolean[adjMatrix.length];//use数组记录哪一个是否遍历
        int []path = new int[adjMatrix.length];//path记录路径
        for(int i=0;i<adjMatrix.length;i++){//初始化
            use[i]=false;
            path[i] = -1;
        }
        //步数
        int step =1;
        //选定开始点 如1,这个值与下面adjMatrix[path[step-1]][0]==1  中的0相关联,
        use[0]=true;
        path[0]= 0;
        demo.getMap(adjMatrix,use,path,step);
    }
    public static final boolean getMap(int[][] adjMatrix, boolean[] use, int[] path,int step) {

        //设定判定条件 相邻顶点之间存在边,最后一个顶点和第一个顶点之间存在边(vin, vi1)∈E  即adjMatrix[path[step-1]][0]==1
        if (step == adjMatrix.length) {//当遍历完之后
            if (adjMatrix[path[step - 1]][0] == 1) {
                for (int i = 0; i < path.length; i++)
                    System.out.print((path[i]+1) + "-->");
                System.out.print(path[0]+1);
                return true;
            }
            return false;

        } else {//当没有遍历完时
            for (int i = 0; i < adjMatrix.length; i++) {
                if (!use[i] && adjMatrix[step - 1][i] == 1) {//当没有遍历完,并且还没有达到每个点都经过,,当两个点之间存在边时
                    //将对应的点遍历,记录某一步经过的点
                    use[i] = true;
                    path[step] = i;
                    if (getMap(adjMatrix, use, path, step + 1)) //得到正确结果返回正确
                        return true;
                    else {//回溯
                        use[i] = false;
                        path[i] = -1;
                    }
                }
            }
        }
        return  false;
    }
}
