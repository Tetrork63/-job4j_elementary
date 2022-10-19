package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Leonid Bannikov";
        names[1] = "Ivan Petrov";
        names[2] = "Pavel Ivanov";
        names[3] = "Aleksandr Filov";

        System.out.println("Размер массива равен: " + ages.length);
        System.out.println("Размер массива равен: " + surnames.length);
        System.out.println("Размер массива равен: " + prices.length);
        System.out.println();

        for (String name : names) {
            System.out.println(name);
        }
    }
}
