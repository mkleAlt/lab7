package entities;

public class Point {
    private final float x;
    private final float y;
    private final static Point START = new Point(0, 0);
    private final static Point START_FROM_X1 = new Point(1, 0);

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + "; " + y + ")";
    }
}
