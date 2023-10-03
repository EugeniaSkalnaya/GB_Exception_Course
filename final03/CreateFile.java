package errorcourse.homework.final03;

import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {

        public static void createFile(PersonData person) {
            try (FileWriter fileWriter = new FileWriter(person.getSurname() + ".txt", true)) {
                fileWriter.write(person.toString() + "\n");
            } catch (IOException e) {
                System.err.println("Ошибка записи файла.");
                throw new RuntimeException(e.getMessage());
            }
        }
    }
