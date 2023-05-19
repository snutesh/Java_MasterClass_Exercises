public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance(){
        double dist = Math.sqrt(x*x+y*y);
        return dist;
    }
    public double distance(int x, int y){
        double dist = Math.sqrt((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y));
        return dist;
    }
    public  double distance(Point point){
        int x = point.getX();
        int y = point.getY();
        return  distance(x,y);
    }
}
