package by.epam.second_lesson.arrays_of_arrays;

/*
Дана матрица размера m на n. Вывести её элементы в следующем порядке:
первая строка справа налево, вторая строка слева направо, третья строка справа налево и так далее.
 */

public class Eleven {
    public static void main(String[] args) {

        int m = 3;
        int n = 4;

        int[][] arr = new int[m][n];

        System.out.println("Начальная матрица");
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = (int)(Math.random() * 20 + 1);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------------------\n");

        System.out.println("После престановок");
        for (int i = 0; i < arr.length; i++){

            if (i % 2 == 0){

                for (int j = arr[i].length-1; j >=0; j--){
                    System.out.print(arr[i][j] + " ");
                }

            } else {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }

            }
            System.out.println();
        }
    }
}
