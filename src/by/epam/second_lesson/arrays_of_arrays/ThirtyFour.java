package by.epam.second_lesson.arrays_of_arrays;

/*
Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
причём в каждой строке число единиц равно номеру столбца.
 */

public class ThirtyFour {
    public static void main(String[] args){

        int m = 4;
        int n = 6;

        int[][] arr = new int[m][n];

        boolean isRight = true;

        for (int i = 0; i < arr.length; i++){
            boolean isEquals = false;

            while (!isEquals){
                int countOfOne = 0;
                for (int j = 0; j < arr[i].length; j++){

                    arr[i][j] = (int)(Math.random() * 2);

                    if (arr[i][j] == 1) countOfOne++;

                }
                if (countOfOne == i+1) isEquals = true;
            }

        }

        for (int[] i: arr) {
            for (int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
