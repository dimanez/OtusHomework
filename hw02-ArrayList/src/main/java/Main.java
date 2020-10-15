import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        addAllTest();
        copyList(initDIYArrayList());
        sortList(initDIYArrayList());
    }

    public static void addAllTest() {
        List<Integer> newList = new DIYArrayList();
        Integer[] numbers = { 1, 2, 3};
        Collections.addAll(newList, numbers);
        System.out.println(newList.size());
    }

    public static void copyList(List<Integer> list) {
        List<Integer> newList = new DIYArrayList();
        newList.add(123);
        Collections.copy(list, newList);
        System.out.println(newList.get(0).equals(list.get(0)));
    }

    public static void sortList(List<Integer> list) {
        Collections.sort(list);
        System.out.println(Arrays.toString(list.toArray()));
    }

    private static List<Integer> initDIYArrayList() {
        List<Integer> list = new DIYArrayList();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            list.add(random.nextInt(50));
        }
        return list;
    }
}
