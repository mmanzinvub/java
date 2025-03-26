import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Automobil auto = new Automobil("ZG-5206-EZ", "Renault", 4, 4, 40.5);
        Osoba covjek = new Osoba("Pero", "Peric", 30, 67);
        Scanner sc = new Scanner(System.in);


        while (auto.zapremninaGoriva > 0 || covjek.razinaEnergije > 0) {
            System.out.println("Unesite cheat code: ");
            String sifra = sc.nextLine();

            if (sifra.equals("seaways")) {
                auto.kretanjePoVodi();
                auto.kretanjePoVodi();
                auto.kretanjePoVodi();
                auto.kretanjePoVodi();
                auto.kretanjePoVodi();

                covjek.kretanjePoVodi();
                covjek.kretanjePoVodi();
                covjek.kretanjePoVodi();
                covjek.kretanjePoVodi();
            }
            else if (sifra.equals("rocketman")) {
                auto.letenje();
                auto.letenje();
                auto.letenje();
                auto.letenje();
                auto.letenje();

                covjek.letenje();
                covjek.letenje();
                covjek.letenje();
                covjek.letenje();
            }
            else {
                System.out.println("Unesite valjani cheat code");
            }
        }
    }
}
