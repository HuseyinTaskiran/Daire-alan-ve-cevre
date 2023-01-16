import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int r;
        double pi=3.14,alan,cevre;

        System.out.print("Yarı çapı giriniz : ");
        Scanner input = new Scanner(System.in);
        r=input.nextInt();
        alan=pi*r*r;
        cevre=pi*r*2;
        System.out.println("Darirenin alanı = " + alan);
        System.out.println("Dairenin çevresi = " + cevre);

    }
}

