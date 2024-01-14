//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number;
        number=sc.nextInt();
        System.out.println("Number is : "+number);

        for (int i = 1; i <= 10; i++) {
            System.out.println(number+"X"+i+" = " + (number*i));
        }
    }
}