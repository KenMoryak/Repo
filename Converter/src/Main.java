import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Выберите валюту: ");
        System.out.println("1: USD\n2: EUR\n3: GBP\n");
        int number = scan.nextInt();
        System.out.println("Введите сумму: ");
        double currency = scan.nextDouble();

        switch (number) {
            case 1:
                System.out.println("RUB - USD: " + currency * 30);
                break;
            case 2:
                System.out.println("RUB - EUR: " + currency * 40);
                break;
            case 3:
                System.out.println("RUB - GBP: " + currency * 50);
                break;
        }
    }
}
