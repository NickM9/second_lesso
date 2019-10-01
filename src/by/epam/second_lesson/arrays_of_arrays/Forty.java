package by.epam.second_lesson.arrays_of_arrays;

/*
Магическим квадратом порядка n называется квадратная матрица размера n x n,
составленная из чисел 1, 2, 3, .., n^2 так, что суммы по каждому столбцу,
каждой строке и каждой из двух больших диагоналей равны между собой.
Построить такой квадрат. Пример магического квадрата порядка 3.
6 1 8
7 5 3
2 9 4
 */

import java.util.Arrays;

public class Forty {
    public static void main(String[] args) {

        int n = (int) Math.pow(4, 2);
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = i+1;
        }

        permute(arr, 0, arr.length-1);
    }

    private static void permute(int[] arr, int l, int r) {
        if (l == r && check(arr, 3))
            print(arr);
        else {
            for (int i = l; i <= r; i++) {
                arr = swap(arr, l, i);
                permute(arr, l + 1, r);
                arr = swap(arr, l, i);
            }
        }
    }

    public static int[] swap(int[] arr, int i, int j) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

    private static boolean check(int[] arr, int n){
        int rightSum = n * ((int) Math.pow(n, 2) + 1) / 2;
        boolean diagonal = checkDiagonal(arr, n, rightSum);
        boolean horizontal = checkHorizontalLine(arr, n, rightSum);
        boolean vertical = checkVerticalLine(arr, n, rightSum);

        if (diagonal && horizontal && vertical){
            return true;
        } else {
            return false;
        }
    }

    private static boolean checkDiagonal(int[] array, int digit, int rightSum) {
        int sum = 0;
        boolean valid;
        for (int i = 0; i < digit; i++) {
            sum += array[(i * digit) + i];
        }
        if (sum == rightSum) {
            valid = true;
        } else {
            valid = false;
        }
        sum = 0;
        if (valid) {
            for (int i = 1; i <= digit; i++) {
                sum += array[(i * digit) - i];
            }
            if (sum == rightSum) {
                valid = true;

            } else {
                valid = false;
            }
        }
        return valid;
    }

    private static boolean checkVerticalLine(int[] array, int digit, int rightSum) {
        int sum = 0;
        boolean valid = false;
        for (int i = 0; i < digit; i++) {
            for (int j = 0; j < digit; j++) {
                sum += array[(j * digit) + i];
            }
            if (sum == rightSum) {
                valid = true;
                sum = 0;
            } else {
                valid = false;
                break;
            }
        }
        return valid;
    }

    private static boolean checkHorizontalLine(int[] array, int digit, int rightSum) {
        boolean valid = false;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if ((i + 1) % digit != 0) {
                sum += array[i];
            } else if ((i + 1) % digit == 0) {
                sum += array[i];
                if (sum == rightSum) {
                    valid = true;
                } else {
                    valid = false;
                    break;
                }
                sum = 0;
            }
        }
        return valid;
    }

    private static void print(int[] arr){
        for (int i = 0; i < arr.length; i++){
            if (i % 3 == 0) System.out.println();
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n-------------------------");
    }
}

