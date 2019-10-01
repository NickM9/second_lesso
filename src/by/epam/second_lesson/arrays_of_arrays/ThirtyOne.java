package by.epam.second_lesson.arrays_of_arrays;

/*
Сформировать матрицу из чисел от 0 до 999, вывести её на экран.
Посчитать количество двухзначных чисел в ней.
 */

public class ThirtyOne {
    public static void main(String[] args) {

        int n = 8;
        int[][] arr = new int[n][n];
        int count = 0;

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = (int)(Math.random() * 1000);

                if (arr[i][j] >= 10 && arr[i][j] <= 99) count++;

                System.out.print(arr[i][j] + " | ");

            }
            System.out.println();
        }

        System.out.println("\nКоличество двухзначных чисел : " + count);
    }
}
