package by.epam.second_lesson.arrays_of_arrays;

/*
С клавиатуры вводятся двумерный массив чисел размерностью nxm.
Выполнить с массивом следующие действия:
а) вычислить смму отрицательных элементов в каждой строке;
б) определить максимальный элемент в каждой строке;
в) переставить местами максимальный и минимальный элементы матрицы.
 */

import java.util.Scanner;

public class TwentySix {
    public static void main(String[] args) {

        int n = 4;
        int m = 6;
        double[][] arr = new double[n][m];

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа для заполнения матрицы 4 на 6");
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){

                arr[i][j] = sc.nextDouble();
            }
        }

        System.out.println("Исходная матрица");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        // Вычисляем сумму отрицательных элементов в каждой строке
        int countMinus;
        for (int i = 0; i < arr.length; i++){
            countMinus = 0;
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] < 0){
                    countMinus++;
                }
            }
            System.out.println("Количество отрицательных элементов в строке " + (i+1) + " : " + countMinus);
        }

        // Определить максимальный элемент в каждой строке
        double max;
        for (int i = 0; i < arr.length; i++){
            max = arr[i][0];
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
            System.out.println("Максимальный элемент в строке " + (i+1) + " : " + max);
        }

        // Переставить местами максимальный и минимальный элементы матрицы
        int minIndexI = 0;
        int minIndexJ = 0;
        int maxIndexI = 0;
        int maxIndexJ = 0;

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){

                if (arr[i][j] > arr[maxIndexI][maxIndexJ]){
                    maxIndexI = i;
                    maxIndexJ = j;
                }

                if (arr[i][j] < arr[minIndexI][minIndexJ]){
                    minIndexI = i;
                    minIndexJ = j;
                }

            }
        }

        System.out.println("Максимальный элемент матрицы : " + arr[maxIndexI][maxIndexJ]);
        System.out.println("Минимальный элемент матрицы : " + arr[minIndexI][minIndexJ]);

        double tmp = arr[maxIndexI][maxIndexJ];
        arr[maxIndexI][maxIndexJ] = arr[minIndexI][minIndexJ];
        arr[minIndexI][minIndexJ] = tmp;

        System.out.println("Выводим матрицу после замены");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
