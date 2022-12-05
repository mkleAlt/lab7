package entities;

public class Point {
    private final double x;
    private final double y;
    private final static Point START = new Point(0, 0);
    private final static Point START_FROM_X1 = new Point(1, 0);

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
        return new Point(x + vx, y + vy);
    }

    public Point symmetryOx() {
        return new Point(x, -y);
    }

    public Point symmetryOy() {
        return new Point(-x, y);
    }

    public Point rotate(int degree) {
        return new Point(
                x*Math.cos(degree) - y*Math.sin(degree),
                y*Math.cos(degree) - x*Math.sin(degree)
        );
    }

    @Override
    public String toString() {
        return "(" + x + "; " + y + ")";
    }
}
