package by.epam.second_lesson.one_dimensional_arrays;

/*
Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него
каждый второй элемент (освободившиеся элементы заполнить нулями). Примечание.
Дополнительный массив не использовать.
 */

public class Twenty {
    public static void main(String[] args) {

        int[] arr = {3, 5, 12, 56, 76, 34, 12, 5, 2, 8, 4};

        for (int i = 1; i < arr.length; i += 2){
            arr[i] = 0;
        }

        System.out.println(java.util.Arrays.toString(arr));
    }
}
