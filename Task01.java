package errorcourse.homework;

import java.util.Scanner;
// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению
// приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

public class Task01 {
    public static void main(String[] args) {
        System.out.println("Вы ввели: " + floatInput());
    }

    public static float floatInput() {
        Scanner scanner = new Scanner(System.in);
        float input;

        try {
            System.out.print("Введите дробное число: ");
            input = Float.parseFloat(scanner.nextLine());

        } catch (NumberFormatException e) {
            System.out.println("Вы ввели не дробное число, попробуйте снова.");
            return floatInput();
        }
        return input;
    }
}