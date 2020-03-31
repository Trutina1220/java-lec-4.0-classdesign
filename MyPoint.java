import java.awt.*;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint(){
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
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

    public void setPoint(int x , int y )
    {
        this.x = x;
        this.y = y;
    }

    public int[] getPoint()
    {
        return new int[]{getX(),getY()};
    }


    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double distance(int x , int y )
    {
        int newX = getX()-x;
        int newY = getY()-y;
        return Math.sqrt(newX*newX + newY*newY);
    }

    public double distance(MyPoint p )
    {
        int newX =  (getX()-p.getX());
        int newY =  (getY()-p.getY());
        return (newX*newX+newY*newY);

    }
    public double distance()
    {
        double newX= getX();
        double newY = getY();
        return (newX*newX+newY*newY);

    }




}
