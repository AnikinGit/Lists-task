import java.util.LinkedList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> list = createList();
        displayInitialList(list);
        displayEditedList(editedList(list));
    }

    public static List<String> createList() {
        List<String> list = new LinkedList<>();
        list.add("orange");
        list.add("grape");
        list.add("apple");
        list.add("lemon");

        return list;
    }

    private static List<String> editedList(List<String> list) {
        list.addFirst("plum");
        list.addLast("mango");

        return list;
    }

    public static void displayInitialList(List<String> list) {
        System.out.println("Initial list:");
        displayList(list);
    }

    public static void displayEditedList(List<String> list) {
        System.out.println("\nEdited list:");
        displayList(list);
    }

    private static void displayList(List<String> list) {
        int index = 1;
        for (String fruits : list) {
            System.out.println(index++ + ") " + fruits);
        }

    }
}
