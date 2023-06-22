package Summer_Training_2023;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class SortStringAndInteger {
    public static void main(String[] args) {
        List<Object> mixedList = new ArrayList<>();
        mixedList.add("z");
        mixedList.add(42);
        mixedList.add("q");
        mixedList.add(123);
        mixedList.add("r");
        Collections.sort(mixedList, new MixedListComparator());

        for (Object element : mixedList) {
            if (element instanceof String) {
                String str = (String) element;
                System.out.println("String Value: " + str);
            } else if (element instanceof Integer) {
                int num = (int) element;
                System.out.println("Integer Value: " + num);
            }
        }
    }

    static class MixedListComparator implements Comparator<Object> {
        @Override
        public int compare(Object obj1, Object obj2) {
            if (obj1 instanceof String && obj2 instanceof String) {
                String str1 = (String) obj1;
                String str2 = (String) obj2;
                return str1.compareTo(str2);
            } else if (obj1 instanceof Integer && obj2 instanceof Integer) {
                Integer int1 = (Integer) obj1;
                Integer int2 = (Integer) obj2;
                return int1.compareTo(int2);
            } else if (obj1 instanceof String) {
                return -1;
            } else {
                return 1;
            }
        }
    }
}