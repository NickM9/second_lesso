package by.epam.second_lesson.one_dimensional_arrays;

// Дан одномерный массив a[n]. Найти: max(a2, a4, ..., a2k) + min(a1, a3, ..., a2k+1).

public class Fourteen {
    public static void main(String[] args) {
        int[] arr = {3, 8, 76, 45, 23, 12, 11, 6, 54, 34, 42, 81};
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i += 2){
            max = Math.max(max, arr[i]);
        }

        for (int i = 1; i < arr.length; i += 2){
            min = Math.min(min, arr[i]);
        }

        System.out.println(max + min); // 76 + 3
    }
}
