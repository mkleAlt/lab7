package entities;

public class Point {
    private final double x;
    private final double y;
    private final static Point START = new Point(0, 0);
    private final static Point START_FROM_X1 = new Point(1, 0);

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point move(double vx, double vy) {
        return new Point(this.getX() + vx, this.getX() + vy);
    }

    public Point symmetryOx() {
        return new Point(this.getX(), -this.getY());
    }

    public Point symmetryOy() {
        return new Point(-this.getX(), this.getY());
    }

    public Point rotate(int degree) {
        return new Point(
                this.getX()*Math.cos(degree) - this.getY()*Math.sin(degree),
                this.getY()*Math.cos(degree) - this.getX()*Math.sin(degree)
        );
    }

    @Override
    public String toString() {
        return "(" + x + "; " + y + ")";
    }
}
