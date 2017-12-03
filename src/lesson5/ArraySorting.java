package lesson5;

//Для решения задачи сортировки эти три этапа выглядят так:
//Сортируемый массив разбивается на две части примерно одинакового размера;
//Каждая из получившихся частей сортируется отдельно, например тем же самым алгоритмом;
//Два упорядоченных массива половинного размера соединяются в один.
public class ArraySorting {
    public static int[] sortAscending(int[] arr) { //здесь я так понимаю что arr - сокращ. array.
        int n = arr.length;                  //берем присваиваем int n и в библиотеке arr.length
        int temp;                           //второй int назыв. temp
        for (int i = 0; i < n; i++) {      //в цикле делаем такие действия int (почему так много int??) i = 0; i меньше n; далее увеличили i) {
            for (int j = 1; j < (n - i); j++) {  //в следующем цикле int j; j меньше (n -i); j++;
                if (arr[j - 1] > arr[j]) {       //если (arr в массиве[j-1] больше arr в массиве[j]);
                    temp = arr[j - 1];           //temp = arr[j - 1] = arr[j];
                    arr[j - 1] = arr[j];         //какой ужас столько телодвижений(( можно ли это более короче написать?
                    arr[j] = temp;
                }
            }
        }
        return arr; //возвращаем arr
    }

    public static int[] sortDescending(int[] arr) {
        int n = arr.length;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] < arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
