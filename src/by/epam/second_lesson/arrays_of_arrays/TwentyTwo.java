package by.epam.second_lesson.arrays_of_arrays;

/*
Сформировать квадратную матрицу порядка n по заданному образцу (n - чётное)
{1 2 3 ... n-2 n-1 n}
{2 3 4 ... n-1 n 0}
{3 4 5 ... n 0 0}
{.............}
{n-1 n 0 ... 0 0 0}
{n 0 0 ... 0 0 0}


 */

public class TwentyTwo {
    public static void main(String[] args) {

        int n = 6;
        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = j <= arr.length-1 - i ? i + j + 1 : 0;

                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }

    }
}
