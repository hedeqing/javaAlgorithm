package 凸back;

public class Point {
    private int x;
    private int y;
    private  int flag;

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public int getFlag() {
        return flag;
    }

    Point(){
        x = 0;
        y = 0;
        flag = 0;
    }

    Point(int x, int y,int flag){
        this.x = x;
        this.y = y;
        this.flag = flag;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getX(){
        return x;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getY(){
        return y;
    }

}
