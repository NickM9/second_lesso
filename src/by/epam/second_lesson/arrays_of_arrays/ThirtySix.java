package by.epam.second_lesson.arrays_of_arrays;

/*
Операция сглаживания матрицы даёт новую матрицу того же размера, каждый элемент которой получается
как среднее арифметическое соседей соответствующего элемента исходной матрицы.
Построить результат сглаживания заданной матрицы.
 */

public class ThirtySix {
    public static void main(String[] args) {


        double [][] arr = {
                {3, 6, 5, 4},
                {18, 13, 56, 7},
                {42, 41, 87, 11}
        };

        double [][] res = new double[3][4];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){

                if (i == 0 && j == 0){
                    res[i][j] = (arr[i][j+1] + arr[i+1][j] + arr[i+1][j+1]) / 3;
                }
                else if (i == arr.length-1 && j == 0){
                    res[i][j] = (arr[i-1][j] + arr[i-1][j+1] + arr[i][j+1]) / 3;
                }
                else if (i == 0 && j == arr[i].length-1){
                    res[i][j] = (arr[i][j-1] + arr[i+1][j-1] + arr[i+1][j]) / 3;
                }
                else if (i == arr.length-1 && j == arr[i].length-1){
                    res[i][j] = (arr[i-1][j] + arr[i-1][j-1] + arr[i][j-1]) / 3;
                }
                else if (j == 0){
                    res[i][j] = (arr[i-1][j] + arr[i-1][j+1] + arr[i][j+1] + arr[i+1][j+1] + arr[i+1][j]) / 5;
                }
                else if (j == arr[i].length-1){
                    res[i][j] = (arr[i-1][j] + arr[i-1][j-1] + arr[i][j-1] + arr[i+1][j-1] + arr[i+1][j]) / 5;
                }
                else if (i == 0){
                    res[i][j] = (arr[i][j-1] + arr[i+1][j-1] + arr[i+1][j] + arr[i+1][j+1] + arr[i][j+1]) / 5;
                }
                else if (i == arr.length-1){
                    res[i][j] = (arr[i][j-1] + arr[i-1][j-1] + arr[i-1][j] + arr[i-1][j+1] + arr[i][j+1]) / 5;
                }
                else{
                    res[i][j] = (arr[i-1][j] + arr[i-1][j-1] + arr[i][j-1] + arr[i+1][j-1] +
                            arr[i+1][j] + arr[i+1][j+1] + arr[i][j+1] + arr[i-1][j+1]) / 8;
                }

            }
        }

        for (double[] i : res){
            for (double j : i){
                System.out.printf("%.2f ", j);
            }
            System.out.println();
        }

    }
}
