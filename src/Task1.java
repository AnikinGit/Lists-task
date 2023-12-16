import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        printLists(getList(), listSort(getList()));
    }

    public static List<String> getList() {
        List<String> list = new ArrayList<>();
        list.add("John");
        list.add("Alice");
        list.add("Robert");
        list.add("Lisa");
        list.add("David");
        list.add("Amanda");
        return list;
    }

    public static List<String> listSort(List<String> list) {
        Collections.sort(list);
        return list;
    }

    public static void printLists(List<String> initial, List<String> sorted) {
        StringBuilder stringBuilder = new StringBuilder();
        int index = 1;
        int index1 = 1;

        stringBuilder.append("Initial list:").append("\n");

        for (String words : initial) {
            stringBuilder.append(index++).append(") ").append(words).append("\n");
        }
        stringBuilder.append("\n");

        stringBuilder.append("Sorted list:").append("\n");

        for (String words : sorted) {
            stringBuilder.append(index1++).append(") ").append(words).append("\n");
        }
        System.out.println(stringBuilder);
    }

}
