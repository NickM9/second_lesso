package by.epam.second_lesson.arrays_of_arrays;

/*
Дан линейный массив x1, x2, ..., xn-1, xn.
Получить действительную квадратную матрицу порядка n:

{x1 x2 x3 ... xn}
{x1^2 x2^2 x3^2 ... xn^2}
{x1^3 x2^3 x3^3 ... xn^3}
{.............}
{x1^n x2^n x3^n ... xn^n}
 */

public class TwentyFour {
    public static void main(String[] args) {

        int n = 6;
        int[] lin = {1, 2, 3, 4, 5, 6};
        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++) {

                matrix[i][j] = (int) Math.pow(lin[j], i+1);

                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
    }
}
