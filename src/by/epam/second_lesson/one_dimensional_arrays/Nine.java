package by.epam.second_lesson.one_dimensional_arrays;

// Даны  действительные числа a1, a2, ..., an. Поменять местами наибольший и наименьший  элементы.

public class Nine {
    public static void main(String[] args) {

        int[] arr = {8, 4, 6, 3, 1, 9, 90, 87, 34, 25};
        int[] res = new int[arr.length];
        int max = arr[0];
        int min = arr[0];

        for (int iterator : arr){

            if (iterator > max){
                max = iterator;
            } else if (iterator < min){
                min = iterator;
            }

        }

        for (int i = 0; i < res.length; i++){

            if (arr[i] == max){
                res[i] = min;
            } else if (arr[i] == min){
                res[i] = max;
            } else {
                res[i] = arr[i];
            }

        }

        System.out.println(java.util.Arrays.toString(res));
    }
}
