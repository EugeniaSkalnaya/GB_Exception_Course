package errorcourse.homework;

public class Task02 {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) { //дополнительное исключение, если массив короче, чем нужно в 8 строке кода
            System.out.println("Catching exception: " + e);
        }
    }
}
