```java
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

        if (code == 1) {

            dollar = amount / 70;
            System.out.println("Your " + amount + " Rupee is : " + dollar + " Dollar");

            pound = amount / 88;
            System.out.println("Your " + amount + " Rupee is : " + pound + " Pound");

            euro = amount / 80;
            System.out.println("Your " + amount + " Rupee is : " + euro + " Euro");

            yen = amount / 0.63;
            System.out.println("Your " + amount + " Rupee is : " + yen + " Yen");

            ringgit = amount / 16;
            System.out.println("Your " + amount + " Rupee is : " + ringgit + " ringgit");
        } else if (code == 2) {
            rupee = amount * 70;
            System.out.println("Your " + amount + " Dollar is : " + rupee + " Ruppes");

            pound = amount * 0.78;
            System.out.println("Your " + amount + " Dollar is : " + pound + " Pound");

            euro = amount * 0.87;
            System.out.println("Your " + amount + " Dollar is : " + euro + " Euro");

            yen = amount * 111.087;
            System.out.println("Your " + amount + " Dollar is : " + yen + " Yen");

            ringgit = amount * 4.17;
            System.out.println("Your " + amount + " Dollar is : " + ringgit + " ringgit");
        } else if (code == 3) {
            rupee = amount * 88;
            System.out.println("Your " + amount + " pound is : " + rupee + " Ruppes");

            dollar = amount * 1.26;
            System.out.println("Your " + amount + " pound is : " + dollar + " Dollar");

            euro = amount * 1.10;
            System.out.println("Your " + amount + " pound is : " + euro + " Euro");

            yen = amount * 140.93;
            System.out.println("Your " + amount + " pound is : " + yen + " Yen");

            ringgit = amount * 5.29;
            System.out.println("Your " + amount + " pound is : " + ringgit + " ringgit");
        } else if (code == 4) {
            rupee = amount * 80;
            System.out.println("Your " + amount + " euro is : " + rupee + " Ruppes");

            dollar = amount * 1.14;
            System.out.println("Your " + amount + " euro is : " + dollar + " Dollar");

            pound = amount * 0.90;
            System.out.println("Your " + amount + " euro is : " + pound + " Pound");

            yen = amount * 127.32;
            System.out.println("Your " + amount + " euro is : " + yen + " Yen");

            ringgit = amount * 4.78;
            System.out.println("Your " + amount + " euro is : " + ringgit + " ringgit");
        } else if (code == 5) {
            rupee = amount * 0.63;
            System.out.println("Your " + amount + " yen is : " + rupee + " Ruppes");

            dollar = amount * 0.008;
            System.out.println("Your " + amount + " yen is : " + dollar + " Dollar");

            pound = amount * 0.007;
            System.out.println("Your " + amount + " yen is : " + pound + " Pound");

            euro = amount * 0.007;
            System.out.println("Your " + amount + " yen is : " + euro + " Euro");

            ringgit = amount * 0.037;
            System.out.println("Your " + amount + " yen is : " + ringgit + " ringgit");
        } else if (code == 6) {
            rupee = amount * 16;
            System.out.println("Your " + amount + " ringgit is : " + rupee + " Ruppes");

            dollar = amount * 0.239;
            System.out.println("Your " + amount + " ringgit is : " + dollar + " Dollar");

            pound = amount * 0.188;
            System.out.println("Your " + amount + " ringgit is : " + pound + " Pound");

            euro = amount * 0.209;
            System.out.println("Your " + amount + " ringgit is : " + euro + " Euro");

            yen = amount * 26.63;
            System.out.println("Your " + amount + " ringgit is : " + yen + " Yen");
        } else {
            System.out.println("Invalid input");
        }

    }
}
```