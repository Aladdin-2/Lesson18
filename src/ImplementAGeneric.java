import java.util.List;

public class ImplementAGeneric {

    public static <T> int findFirst(List<T> list, T item) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(item)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        List<Integer> intList = List.of(7, 70, 5, 10, 500, 70);
        System.out.println("First occurrence of 70 in Integer List: " + findFirst(intList, 70));  // Should return 2

        List<String> stringList = List.of("Olya", "Anqelina", "Nata", "YUliye");
        System.out.println("First occurrence of 'apple' in String List: " + findFirst(stringList, "Yusif"));  // Should return 0

        List<Character> charList = List.of('A', 'B', 'C', 'D');
        System.out.println("First occurrence of 'C' in Character List: " + findFirst(charList, 'C'));  // Should return 2

    }
}
