package by.epam.second_lesson.arrays_of_arrays;

/*
Получить квадратную матрицу порядка n:
{0 0 0 ... 0 0}
{0 1 0 ... 0 0}
{0 0 2 ... 0 0}
{.............}
{0 0 0 ... 0 n-1}
 */

public class Twelve {
    public static void main(String[] args) {

        int n = 5;
        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){

                arr[i][j] = i == j ? i : 0;

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
