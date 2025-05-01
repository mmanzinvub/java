package ZAD1;

import java.util.*;
import java.util.stream.Collectors;

@FunctionalInterface
interface WordFilter {
    boolean test(String word);
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unos: ");
        String input = scanner.nextLine();

        String[] words = input.split("\\s+");

        WordFilter filter = word -> word.toLowerCase().startsWith("a");

        List<String> result = Arrays.stream(words)
                .filter(filter::test)
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());

        System.out.println("Filtrirane i sortirane riječi:");
        result.forEach(System.out::println);
    }
}