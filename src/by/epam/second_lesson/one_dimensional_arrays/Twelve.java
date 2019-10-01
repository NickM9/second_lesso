package by.epam.second_lesson.one_dimensional_arrays;

/*
Задана последовательность N вещественных чисел. Вычислить сумму чисел,
порядковые номера которых являются простыми числами.
 */

public class Twelve {
    public static void main(String[] args) {
        int[] arr = {2, 8, 65, 43, 23, 467, 87, 35, 64, 38, 28, 1};
        int sum = 0;
        boolean isPrime;

        for (int i = 0; i < arr.length; i++){
            isPrime = true;

            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    isPrime = false;
                }
            }

            if (isPrime){
                sum += arr[i];
            }
        }

        System.out.println(sum);
    }
}
