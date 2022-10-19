package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        int counter = 0;
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, counter, data.length - 1);
            int index = FindLoop.indexInRange(data, min, counter, data.length - 1);
            SwitchArray.swap(data, index, counter);
            counter++;
        }
        return data;
    }
}
