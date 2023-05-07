import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00, totalPrice = 0;
        double  kilo = 0;
        String mesaj = "Kaç Kilo? : ";
        Scanner input = new Scanner(System.in);

        System.out.print("Armut " + mesaj);
        kilo = input.nextDouble();
        totalPrice += kilo * armut;

        System.out.print("Elma " + mesaj);
        kilo = input.nextInt();
        totalPrice += kilo * elma;

        System.out.print("Domates " + mesaj);
        kilo = input.nextInt();
        totalPrice += kilo * domates;

        System.out.print("Muz " + mesaj);
        kilo = input.nextInt();
        totalPrice += kilo * muz;

        System.out.print("Patlıcan " + mesaj);
        kilo = input.nextInt();
        totalPrice += kilo * patlican;

        System.out.println("Toptal Tutar: " + totalPrice + "TL");
    }
}