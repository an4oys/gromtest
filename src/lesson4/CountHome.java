package lesson4;

public class CountHome {
    public static void main(String[] args) {
        short a = 100, b = 1000;

        System.out.println(findDivCount(a, b, 3));

    }

    public static int findDivCount(short a, short b, int n) {
        int count = 0;

        for(int g = a; g <= b; g++) {

            if( g % n == 0) {
                count++;
            }
        }

        return count;

    }
}
