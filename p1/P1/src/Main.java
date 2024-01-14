//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int number1=67;
        int number2=27;
        int sum,sub,mul,rem;

        sum=(number1+number2);
        sub=(number1-number2);
        mul=(number1*number2);
        float div=(float)(number1)/(number2);
        rem=((number1)%(number2));

        System.out.println("Addition : "+ sum);
        System.out.println("Substraction : "+ sub);
        System.out.println("Multiplication : "+ mul);
        System.out.format("Divide : %.2f", div);
        System.out.println("\nRemainder : "+ rem);
    }
}