import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount, dollar, pound, code, euro, yen, ringgit, rupee;

        System.out.println("Welcome to the Currency Converter!");

        System.out.println("which currency You want to Convert ? ");

        System.out.println("1:Ruppe \t2:Dollar \t3:Pound \n4:Euro \t5:Yen \t6:Ringgit ");
        code = scanner.nextInt();

        System.out.println("How much Money you want to convert ? ");
        amount = scanner.nextFloat();
    }
}