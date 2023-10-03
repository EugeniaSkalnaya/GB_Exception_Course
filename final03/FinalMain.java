package errorcourse.homework.final03;

import java.util.Scanner;

public class FinalMain {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фамилию, имя, отчество, дату рождения (в формате dd.mm.yyyy), номер телефона и пол(м/ж)\"");
        String input = scanner.nextLine();
        PersonData person = new PersonData(input.split("\\s"));
        CreateFile.createFile(person);

    }
}
