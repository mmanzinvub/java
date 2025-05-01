package ZAD2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> grades = new ArrayList<>();

        System.out.println("Unesite ocjene za studente: ");

        while (true) {
            int grade = sc.nextInt();
            if (grade == 0) break;
            grades.add(grade);
        }

        if (grades.isEmpty()) {
            System.out.println("Nema unesenih ocjena.");
            return;
        }

        System.out.println("Unesite strategiju za izracun prosjeka: ");
        char choice = sc.next().toUpperCase().charAt(0);

        double average;

        switch (choice) {
            case 'A':
                average = grades.stream()
        }
    }
}