import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> list = createList();
        displayInitialList(list);
        displayPartList(partList(list));
    }

    public static List<String> createList() {
        List<String> list = new ArrayList<>();
        list.add("orange");
        list.add("mango");
        list.add("banana");
        list.add("apple");
        list.add("kiwi");
        list.add("cherry");

        return list;
    }

    private static List<String> partList(List<String> list) {
        return list.subList(1, 3);
    }

    public static void displayInitialList(List<String> list) {
        System.out.println("Initial list:");
        displayList(list);
    }

    public static void displayPartList(List<String> list) {
        System.out.println("\nList part:");
        displayList(list);
    }

    private static void displayList(List<String> list) {
        int index = 1;
        for (String fruits : list) {
            System.out.println(index++ + ") " + fruits);
        }
    }
}
