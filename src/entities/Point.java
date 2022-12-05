package entities;

public class Point {
    private final double x;
    private final double y;
    public final static Point START = new Point(0, 0);
    public final static Point START_FROM_X1 = new Point(1, 0);

    private Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static Point of(double x, double y) {
        return new Point(x, y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point move(double vx, double vy) {
        return new Point(Math.round((x + vx) * 100.0) / 100.0, Math.round((y + vy) * 100.0) / 100.0);
    }

    public Point symmetryOx() {
        return new Point(x, -y);
    }

    public Point symmetryOy() {
        return new Point(-x, y);
    }

    public Point rotate(int degree) {
        double radian = degree*Math.PI/180;
        return new Point(
                Math.round((x*Math.cos(radian) - y*Math.sin(radian)) * 100.0) / 100.0,
                Math.round((y*Math.cos(radian) - x*Math.sin(radian)) * 100.0) / 100.0
        );
    }

    @Override
    public String toString() {
        return "(" + x + "; " + y + ")";
    }
}
