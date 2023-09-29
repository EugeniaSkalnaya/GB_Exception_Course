package errorcourse.homework;
import java.util.Scanner;
// Разработайте программу, которая выбросит Exception, когда пользователь
// вводит пустую строку. Пользователю должно показаться сообщение, что
// пустые строки вводить нельзя.

    public class Task04 {
        public static void main(String[] args) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Введите что-нибудь: ");
                String input = scanner.nextLine();

                if (input.isEmpty()) {
                    throw new Exception("Вы ничего не ввели, а я просил хоть что-то! =(");
                } else {
                    System.out.println("Вы написали: " + input);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
