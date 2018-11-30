package 凸包;

public class Point implements Comparable {
    private int x;
    private int y;


    Point() {
        x = 0;
        y = 0;
    }

    Point(int x, int y ) {
        this.x = x;
        this.y = y;

    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    @Override
    public int compareTo(Object o) {
        Point point = (Point) o;
        if (this.getX() == point.getX()) {
            return 0;
        } else if (this.getX() < point.getX()) {
            return -1;
        } else {
            return 1;
        }
    }
}
