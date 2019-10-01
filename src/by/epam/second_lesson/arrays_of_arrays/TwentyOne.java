package by.epam.second_lesson.arrays_of_arrays;

/*
Сформировать квадратную матрицу порядка n по заданному образцу (n - чётное)
{n 0 0 ... 0 0 0}
{n-1 n 0 ... 0 0 0}
{n-2 n-1 n ... 0 0 0}
{.............}
{2 3 4 ... n-1 n 0}
{1 2 3 ... n-2 n-1 n}
 */

public class TwentyOne {
    public static void main(String[] args) {

        int n = 8;
        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = j <= i ? arr.length - i + j : 0;

                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }

    }
}
