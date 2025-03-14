import java.util.Scanner;

class zad3 {
    public static void main(String[] args) {
        String text = "";
        String textReverse = "";

        Scanner input = new Scanner(System.in);
        System.out.println("Unesi string: ");
        text = input.nextLine();

        for (int i=text.length()-1; i>=0; i--) {
            textReverse = textReverse + text.charAt(i);
        }

        System.out.println("Uneseni string: " + text);
        System.out.println("Uneseni string koji je obrnuti: " + textReverse);

        if (textReverse.equals(text)) {
            System.out.println("Tekst je palindrom.");
        }
        else {
            System.out.println("Nije palindron.");
        }
    }
}
