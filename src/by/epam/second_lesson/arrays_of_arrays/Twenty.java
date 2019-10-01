package by.epam.second_lesson.arrays_of_arrays;

/*
Сформировать квадратную матрицу порядка n по заданному образцу (n - чётное)
{1 0 0 ... 0 0 1}
{1 1 0 ... 0 1 1}
{1 1 1 ... 1 1 1}
{.............}
{1 1 0 ... 0 1 1}
{1 0 0 ... 0 0 1}
 */

public class Twenty {
    public static void main(String[] args) {

        int n = 8;
        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {

                if (i < arr.length/2 && j > i && j < arr.length-1 - i) {
                    arr[i][j] = 0;
                } else if (i >= arr.length/2 && j > arr.length-1 - i && j < i){
                    arr[i][j] = 0;
                }else {
                    arr[i][j] = 1;
                }

                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
    }
}
