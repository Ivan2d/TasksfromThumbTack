package net.thumbtack.school.figures.v1;
import java.util.Objects;

public class Circle {
    private Point center;
    private int radius;

    public Circle(Point center, int radius){
        this.center = center;
        this.radius = radius;
    }

    public Circle(int xCenter, int yCenter, int radius){
       this(new Point(xCenter,yCenter), radius);
    }

    public Circle(int radius){
        this(new Point(0,0), radius);
    }

    public Circle(){
        this(new Point(0, 0), 1);
    }

    public Point getCenter(){
        return center;
    }

    public void setCenter(Point point){
        this.center = point;
    }

    public int getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    public void moveTo(int x, int y){
        center.setX(x);
        center.setY(y);
    }

    public void moveTo(Point point){
        center.setX(point.getX());
        center.setY(point.getY());
    }

    public void moveRel(int dx, int dy){
        center.setX(center.getX() + dx);
        center.setY(center.getY() + dy);
    }

    public void resize(int ratio){
        setRadius(getRadius()*ratio);
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    public boolean isInside(int x, int y){
        return radius >= Math.pow(Math.pow(x - center.getX(), 2) + Math.pow(y - center.getY(), 2), 0.5);
    }

    public boolean isInside(Point point){
        return isInside(point.getX(), point.getY());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius && Objects.equals(center, circle.center);
    }

    @Override
    public int hashCode() {
        return Objects.hash(center, radius);
    }

}
