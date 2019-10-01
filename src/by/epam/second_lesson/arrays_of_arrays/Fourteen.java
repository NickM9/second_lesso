package by.epam.second_lesson.arrays_of_arrays;

/*
Сформировать квадратную матрицу порядка n по заданному образцу (n - чётное)
{0 0 0 ... 0 0 1}
{0 0 0 ... 0 2 0}
{0 0 2 ... 3 0 0}
{.............}
{0 n-1 0 ... 0 0 0}
{n 0 0 ... 0 0 0}
 */

public class Fourteen {
    public static void main(String[] args) {

        int n = 6;
        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){

                arr[i][j] = j == arr[i].length-1 - i ? i+1 : 0;

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
