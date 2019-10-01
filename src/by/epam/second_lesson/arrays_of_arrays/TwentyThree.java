package by.epam.second_lesson.arrays_of_arrays;

/*
Сформировать квадратную матрицу порядка n по правилу:
a[i, j] = sin((i^2 - j^2) / n)
и подсчитать количество положительных элементов в ней
 */

import static java.lang.Math.*;

public class TwentyThree {
    public static void main(String[] args) {

        int n = 6;
        double [][] arr = new double[n][n];
        int count = 0;

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = sin( (pow(i, 2) - pow(j, 2)) / n );

                if (arr[i][j] % 2 > 0) count++;

                System.out.printf("%.2f ", arr[i][j]);

            }
            System.out.println();
        }

        System.out.println(count);
    }
}
