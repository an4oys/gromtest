package lesson8.MyHomeWork2;

public class Arithmetic {
    boolean check (int [] array) {
        int min = array [0];
        int max = array [0];
        long sum = min + max;
        for (int el: array) {
            if (el < min) {
                min = el;
            }
            if (el > max) {
                max = el;
            }
        }
        return sum > 100;

    }
}
