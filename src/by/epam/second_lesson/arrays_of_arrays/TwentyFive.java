package by.epam.second_lesson.arrays_of_arrays;

/*
Получить квадратную матрицу порядка n:

{1 2 ... n-1 n}
{n+1 n+2 ... 2n-1 2n}
{2n+1 2n+2 ... 3n-1 3n}
{.............}
{(n-1)n+1 (n-1)n+2 ... n^2+1 n^2}
 */

public class TwentyFive {
    public static void main(String[] args) {

        int n = 6;
        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = (j+1) + (n*i);

                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
    }
}
