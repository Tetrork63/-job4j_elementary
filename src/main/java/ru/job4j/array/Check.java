package ru.job4j.array;

public class Check {
    @SuppressWarnings("checkstyle:SimplifyBooleanExpression")
    public static boolean mono(boolean[] data) {
        boolean result;
        int counterFalse = 0;
        int counterTrue = 0;
        for (int i = 0; i < data.length; i++) {
            if (!data[i]) {
                counterFalse++;
            } else if (data[i]) {
                counterTrue++;
            }
        }
        if (counterTrue > 0 && counterFalse == 0) {
            result = true;
        } else if (counterTrue == 0 && counterFalse > 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
