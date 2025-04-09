import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Kompas kompas = new Kompas();
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesi otklon igle: ");
        kompas.setOtklonIgle(sc.nextDouble());

        kompas.pokaziSmjer();

        System.out.println("Unesi otklon igle: ");
        kompas.setOtklonIgle(sc.nextDouble());

        kompas.pokaziSmjer();
    }
}
