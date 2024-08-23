public class Point {
    private int x;
    private int y;

    // Constructor
    public Point(int x, int y){
        this.x = x;
        this.y = y;       
    }
    public Point(){

    }

    public Point(Point b){
        this.x = b.x;
        this.y = b.y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    @Override
    public String toString(){
        return "(" + x + "," + y + ")";
    }
}