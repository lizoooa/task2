import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final double PRICE = 40.0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Miasto: ");
        String city = scanner.nextLine();

        System.out.print("wiek: ");
        int wiek = scanner.nextInt();

        System.out.print("mieszkasz w Warszawie ? (tak/nie): ");
        scanner.nextLine();
        String mieszkaniecWarszawy = scanner.nextLine();

        System.out.print("dzisiaj czwartek? (tak/nie): ");
        String czwartek = scanner.nextLine();

        double rabat = 0.0;

        if (wiek < 10) {
            rabat = 100.0;
        } else if (wiek >= 10 && wiek <= 18) {
            rabat = 50.0;
        }

        if (mieszkaniecWarszawy.equalsIgnoreCase("yes")) {
            rabat += 10.0;
        }

        if (czwartek.equalsIgnoreCase("yes")) {
            rabat = 100.0;
        }

        double finalPrice = PRICE * (1 - rabat / 100);

        String rabat1 = (rabat == 100.0) ? "100%" : rabat + "%";
        String ticketPriceText = (rabat == 100.0) ? "0 PLN" : finalPrice + " PLN";

        System.out.println("Data: " + city + ", " + wiek + " ma lat, dzień powszedni");
        System.out.println("prace: " + ticketPriceText);
        System.out.println("rabat: " +  rabat);
    }
}
