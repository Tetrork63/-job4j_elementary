package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
}

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
//        float euro = Converter.rubleToEuro(140);
//        float dollar = Converter.rubleToDollar(150);
//        System.out.println("140 rubles are " + euro + " euro.");
//        System.out.println("150 rubles are " + dollar + " dollar.");

        float in = 140;
        float in2 = 150;
        float in3 = 120;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float out2 = Converter.rubleToDollar(in2);
        float out3 = Converter.rubleToDollar(in3);
        boolean passed = expected == out;
        boolean passed2 = expected == out2;
        boolean passed3 = expected == out3;
        System.out.println("140 rubles are 2. Test result : " + passed);
        System.out.println("150 rubles not are 2. Test result : " + passed2);
        System.out.println("150 rubles are 2. Test result : " + passed3);
    }
}
