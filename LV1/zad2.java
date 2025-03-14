import java.util.Scanner;

class zad2 {
    public static void main(String[] args) {
        String text = "";
        int rijeci = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Unesi string: ");
        text = input.nextLine();

        char[] array = text.toCharArray();
        System.out.println(array);

        for (int i=0; i < text.length(); i++) {
            if (Character.isSpaceChar(array[i])) {
                rijeci++;
            }
        }
        System.out.println("Broj rijeci u stringu je: " + rijeci);
    }
}
