import entities.Point;

public class main {
    public static void main(String[] args) {
        System.out.println("Laboratorium 7 - testy:");
        pointTest();
    }

    public static void pointTest() {
        System.out.println("test konstruktora 'of' dla punktu (1,2): ");
        Point punkt = Point.of(1,2.5);
        System.out.print(punkt);

        System.out.println("test getterow: X = " + punkt.getY() + " Y = " + punkt.getY());

        System.out.println("test stalych: "
                + "\na) stala (0,0) - START: " + Point.START
                + "\nb) stala (1,0) - START_FROM_X1: " + Point.START_FROM_X1
        );

        System.out.println("test metod na poprzedniu utworzonym punkcie (1,2): "
            + "\na) move(2,2): " + punkt.move(2,2)
            + "\nb) symmetryOx():" + punkt.symmetryOx()
            + "\nc) symmetryOy(): " + punkt.symmetryOy()
            + "\nd) rotate(): " + punkt.rotate(180)
        );
    }
}
