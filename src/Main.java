
public class Main {
    public static void main(String[] args) {
        //Task 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        //Task 2
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName.toUpperCase());

        //Task 3
        String fullName2 = "Иванов Семён Семёнович";
        fullName2 = fullName2.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + fullName2);


    }
}