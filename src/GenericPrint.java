import java.util.Scanner;

public class GenericPrint {
    public static <T> void printArray(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {213, 4, 22, 4, 5, 77};
        System.out.println("Integer array:");
        printArray(intArray);

        Character[] charArray = {'A', 'B', 'C', 'D'};
        System.out.println("Character array:");
        printArray(charArray);

        String[] stringArray = {"Nadya", "Yuliya", "Alla"};
        System.out.println("String array:");
        printArray(stringArray);

    }
}
