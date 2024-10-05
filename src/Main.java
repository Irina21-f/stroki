import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Задача 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.printf("Ф. И. О. сотрудника — %s\n", fullName);
//        Задача 2
        System.out.printf("Данные Ф. И. О. сотрудника для заполнения отчетf — %s\n", fullName.toUpperCase());
//        Задача 3
        fullName = "Иванов Семён Семёнович";
        System.out.printf("Ф. И. О. сотрудника — %s\n", fullName.replace('ё', 'е'));
    }
}
