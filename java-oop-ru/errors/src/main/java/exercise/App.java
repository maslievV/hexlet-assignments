package exercise;

// BEGIN
public class App {

    public static void printSquare(Circle circle) throws NegativeRadiusException {
        try {
            System.out.println(Math.round(circle.getSquare()));
        } catch (NegativeRadiusException ex) {
            System.out.println("Не удалось посчитать площадь");
        } finally {
            System.out.println("Вычисление окончено");
        }
    }

}
// END
