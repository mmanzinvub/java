import java.util.Scanner;

class zad4 {
    public static void main(String[] args) {
        int n = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Unesi broj: ");
        n = input.nextInt();

        if (n > 99 && n < 1000) {
            int stotice = n / 100;
            int desetice = (n % 100) / 10;
            int jedinice = n % 10;

            System.out.println("Stotice: " + stotice);
            System.out.println("Desetice: " + desetice);
            System.out.println("Jedinice: " + jedinice);
        }
        else {
            System.out.println("Nisi unio troznamenkasti broj.");
        }
    }
}