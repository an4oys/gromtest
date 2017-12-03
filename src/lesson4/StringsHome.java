package lesson4;

public class StringsHome {
    public static void main(String[] args) {
//        System.out.println(concat("i like cats ", " and berry ", "....."));

        short a = 100,b = 1000;

        System.out.println(findDivCount(a, b, 3));

    }

//    public static String concat (String a, String b, String c) {
//
//        return a + b + c;
//     }

    public static int findDivCount(short a, short b, int n) {

//        int g;
//
//        g = a;
//
//        while(g <= b) {


//            g++;
//        }

        int count = 0;

        for(int g = a; g <= b; g++) {

            if( g % n == 0) {
                count++;
            }
        }

        return count;

    }
}
