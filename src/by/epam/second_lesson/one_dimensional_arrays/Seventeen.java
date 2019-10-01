package by.epam.second_lesson.one_dimensional_arrays;

/*
Дана последовательность числа a1, a2, ..., an. Образовать новую последовательность,
выбросив из исходной те члены которые равны min(a1, a2, ..., an).
 */

public class Seventeen {
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 45, 62, 3, 2, 6, 7, 2, 87, 34, 23};
        int min = arr[0];

        for (int i = 0; i < arr.length; i++){
            min = Math.min(min, arr[i]);
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == min){
                count++;
            }
        }

        int[] res = new int[arr.length - count];
        for (int i = 0, j = 0; i < arr.length; i++){
            if (arr[i] != min){
                res[j] = arr[i];
                j++;
            }
        }

        System.out.println(java.util.Arrays.toString(res));
    }
}
