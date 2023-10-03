package errorcourse.homework.final03;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class PersonData {

    private String name;
    private String surname;
    private String patronymic;
    private LocalDate birthdate;
    private int phoneNumber;
    private String gender;

    public PersonData(String[] parseInput) throws Exception {
        if (parseInput.length != 6) {
            System.err.println("Введено неверное количество данных");
        }
        try {
            this.surname = parseInput[0];
            this.name = parseInput[1];
            this.patronymic = parseInput[2];
            this.birthdate = whatBirthdate(parseInput[3]);
            this.phoneNumber = whatPhonenumber(parseInput[4]);
            this.gender = whatGender(parseInput[5]);
        } catch (DateTimeParseException e) {
            System.err.println("Ошибка формата даты.");
            throw e;
        }  catch (NumberFormatException e) {
            System.err.println("Ошибка формата номера телефона.");
            throw e;
        }
    }

    private LocalDate whatBirthdate(String dateString) throws DateTimeParseException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return LocalDate.parse(dateString, formatter);
    }

    private int whatPhonenumber(String phone) throws NumberFormatException {
        if (phone.length() != 7) {
            throw new NumberFormatException("Необходимо ввести 7 цифр");
        }
        return Integer.parseInt(phone);
    }

    private String whatGender(String gender) throws GenderException {
        if (!gender.equalsIgnoreCase("м") && !gender.equalsIgnoreCase("ж")) {
            throw new GenderException();
        }
        return gender;
    }

    public String getSurname() {
        return this.surname;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return String.format("<%s><%s><%s><%s><%s><%s>", this.surname, this.name, this.patronymic,
                this.birthdate.format(formatter),
                this.phoneNumber, this.gender);
    }
}
