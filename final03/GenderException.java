package errorcourse.homework.final03;

    public class GenderException extends Exception {
        public GenderException() {
            super("Введены некорректные данные для значения 'пол'");
        }
    }