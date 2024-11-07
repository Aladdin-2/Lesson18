import java.util.Scanner;

public class MinMax<T extends Comparable<T>> {
    private T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T getMin() {
        T min = array[0];
        for (T item : array) {
            if (item.compareTo(min) < 0) {
                min = item;
            }
        }
        return min;
    }

    public T getMax() {
        T max = array[0];
        for (T item : array) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of integer values: ");
        int sizeInt = scan.nextInt();
        Integer[] intArray = new Integer[sizeInt];

        System.out.println("Enter the integer values: ");
        for (int i = 0; i < sizeInt; i++) {
            System.out.print("Array[ " + i + " ]=");
            intArray[i] = scan.nextInt();

        }
        MinMax<Integer> intMinMax = new MinMax<>(intArray);
        System.out.println("Minimum value: " + intMinMax.getMin());
        System.out.println("Maximum value: " + intMinMax.getMax());

        System.out.println("Enter the number of string values: ");
        int sizeString = scan.nextInt();
        Integer[] stringArray = new Integer[sizeString];

        System.out.println("Enter the integer values: ");
        for (int i = 0; i < sizeInt; i++) {
            System.out.print("Array[ " + i + " ]=");
            stringArray[i] = scan.nextInt();
        }
        MinMax<Integer> stringMinMax = new MinMax<>(stringArray);
        System.out.println("Minimum value: " + stringMinMax.getMin());
        System.out.println("Maximum value: " + stringMinMax.getMax());
    }
}
