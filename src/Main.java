import java.util.Calendar;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("enter date of birth");
        System.out.println("enter the day ");
        int day = scanner.nextInt();

        System.out.println("enter the month ");
        int month = scanner.nextInt()-1;

        System.out.println("enter the year ");
        int year = scanner.nextInt();

      Calendar current = Calendar.getInstance();
      Calendar user = Calendar.getInstance();
      user.set(year, month, day);

      int age = current.get(Calendar.YEAR)- user.get(Calendar.YEAR);

        System.out.println("your age is "+ age);





    }
}