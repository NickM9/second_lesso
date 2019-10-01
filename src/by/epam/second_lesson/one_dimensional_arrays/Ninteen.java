package by.epam.second_lesson.one_dimensional_arrays;

/*
В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
Если такиех числе несколько, то определить наименьшее из них.
 */

public class Ninteen {
    public static void main(String[] args) {

        int[] arr = {2, 5, 4, 7, 4, 45, 3, 8, 13, 43, 23, 94, 2, 3, 6, 5, 1, 8, 91};
        int countPrev = 0;
        int countTek;
        int res = arr[0];

        for (int i = 0; i < arr.length; i++){
            countTek = 1;
            for (int j = 0; j < arr.length; j++){

                if (arr[i] == arr[j]){
                    countTek++;
                }

                if (countTek > countPrev){
                    countPrev = countTek;
                    res = arr[i];
                } else if (countTek == countPrev){
                    res = Math.min(res, arr[i]);
                }

            }

        }

        System.out.println(res);
    }
}
