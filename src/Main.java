import entities.Cone;
import entities.Cuboid;
import entities.Solid;
import exceptions.LessThanZeroException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Laboratorium 8 - testy:");
        solidsTest();
    }

    public static void solidsTest() {
        try {
            System.out.println("Iniclaizowanie poprawnego stozka i prostopadloscianu:");
            Cone stozek = new Cone(Solid.Unit.cm, 4 , 3);
            Cuboid prostopadloscian = new Cuboid(Solid.Unit.mm, 4, 4, 4);
            System.out.println(stozek);
            System.out.println(prostopadloscian);

            System.out.println("Testy metod abstrakcyjnych:"
            + "\na) volume() - stozek: " + stozek.volume() + " - prostopadloscian: " + prostopadloscian.volume()
            + "\nb) surfaceArea() - stozek: " + stozek.surfaceArea() + " - prostopadloscian: " + prostopadloscian.surfaceArea());

            System.out.println("Testy metody equals: ");
            Cone stozekEq = new Cone(Solid.Unit.mm, 3 , 9);
            Cuboid prostopadloscianEq = new Cuboid(Solid.Unit.cm, 1, 2, 3);
            System.out.println("nowe figury: " + stozekEq + prostopadloscianEq);

            System.out.println("Niepoprawne przyrownania - niski epsylon: "
                    + "\na) stozek: " + stozek.equals(stozekEq, 1)
                    + "\nb) prostopadloscian: " + prostopadloscian.equals(prostopadloscianEq, 1));
            System.out.println("Poprawne przyrownania - wysoki epsylon: "
                    + "\na) stozek: " + stozek.equals(stozekEq, 100)
                    + "\nb) prostopadloscian: " + prostopadloscian.equals(prostopadloscianEq, 100));

            System.out.println("\nTest toString unit'a: " + stozek.getUnit());

            Solid[] solids = {
                    stozek, stozekEq, prostopadloscian, prostopadloscianEq
            };

            System.out.println("\ntest na tablicy referencji:");
            for(Solid solid : solids) {
                System.out.println(solid + " pole: " + solid.surfaceArea() + " objetosc: " + solid.volume());
            }
        } catch (LessThanZeroException e) {
            System.out.println(e);
        }

        try {
            System.out.println("\nIniclaizowanie niepoprawnego stozka:");
            Solid stozekZly = new Cone(Solid.Unit.cm, -4 , 3);
        } catch(LessThanZeroException e) {
            System.out.println(e);
        }

        try {
            System.out.println("\nIniclaizowanie niepoprawnego prostopadloscianu:");
            Solid prostopadloscianZly = new Cuboid(Solid.Unit.mm, 4, -1, 4);
        } catch(LessThanZeroException e) {
            System.out.println(e);
        }
    }
}
