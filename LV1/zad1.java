import java.util.Scanner;

class zad1 {
    public static void main(String[] args) {
        int n = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Unesi broj: ");
        n = input.nextInt();

        for (int i=0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}