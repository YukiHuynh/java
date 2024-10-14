package selection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringArraySorter {

    // Phương thức chung để phân loại và sắp xếp
    private static List<List<String>> classifyAndSort(String[] strings, boolean isAscending) {
        List<String> negatives = new ArrayList<>();
        List<String> positives = new ArrayList<>();
        List<String> characters = new ArrayList<>();
        List<String> special = new ArrayList<>();
        List<String> nulls = new ArrayList<>();

        // Phân loại các phần tử
        for (String s : strings) {
            if (s == null) {
                nulls.add(s);
            } else if (s.equalsIgnoreCase("Special")) {
                special.add(s);
            } else if (isNegativeNumber(s)) {
                negatives.add(s);
            } else if (isPositiveNumber(s)) {
                positives.add(s);
            } else {
                characters.add(s);
            }
        }

        // Sắp xếp các nhóm
        if (isAscending) {
            Collections.sort(negatives);
            Collections.sort(positives);
            Collections.sort(characters);
        } else {
            Collections.sort(negatives, Collections.reverseOrder());
            Collections.sort(positives, Collections.reverseOrder());
            Collections.sort(characters, Collections.reverseOrder());
        }

        // Trả về danh sách các nhóm đã sắp xếp
        List<List<String>> classifiedGroups = new ArrayList<>();
        classifiedGroups.add(special);
        classifiedGroups.add(negatives);
        classifiedGroups.add(positives);
        classifiedGroups.add(characters);
        classifiedGroups.add(nulls);
        return classifiedGroups;
    }

    // Phương thức sắp xếp tăng dần
    public static void sortAscending(String[] strings) {
        List<List<String>> sortedGroups = classifyAndSort(strings, true);

        // In ra kết quả theo thứ tự tăng dần
        System.out.println("Tăng dần: ");
        sortedGroups.forEach(group -> group.forEach(s -> System.out.print(s + " ")));
        System.out.println();
    }

    // Phương thức sắp xếp giảm dần
    public static void sortDescending(String[] strings) {
        List<List<String>> sortedGroups = classifyAndSort(strings, false);

        // In ra kết quả theo thứ tự giảm dần
        System.out.println("Giảm dần: ");
        sortedGroups.forEach(group -> group.forEach(s -> System.out.print(s + " ")));
        System.out.println();
    }

    // Helper methods để kiểm tra số âm và số dương
    private static boolean isNegativeNumber(String s) {
        try {
            return Integer.parseInt(s) < 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isPositiveNumber(String s) {
        try {
            return Integer.parseInt(s) > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        String[] strings = {"-2", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx"};

        // Sắp xếp tăng dần
        sortAscending(strings);

        // Sắp xếp giảm dần
        sortDescending(strings);
    }
}
