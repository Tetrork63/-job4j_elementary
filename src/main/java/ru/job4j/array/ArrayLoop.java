package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] cycle = new int[5];
        for (int i = 0; i < cycle.length; i++) {
            cycle[i] = i * 2 + 3;
        }

        for (int j : cycle) {
            System.out.println(j);
        }
    }
}
