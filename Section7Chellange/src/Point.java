public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {}

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        // (Ax - x , Ay - y ) -input(x,y) (Bx - 0 ,By - 0) - 0,0
        return Math.sqrt((-x)*(-x) + (-y)*(-y));
    }
    public double distance(int x, int y){
        return Math.sqrt((this.x-x)*(this.x-x) + (this.y-y)*(this.y-y));
    }
    public double distance(Point point){
        return distance(point.x , point.y);
    }
}
