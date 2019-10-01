package by.epam.second_lesson.arrays_of_arrays;

/*
Отсортировать строки матрицы по возрастанию и убыванию элементов
 */

public class ThirtyTwo {
    public static void main(String[] args) {

        int[][] arr = {
                {80, 30, 10, 45, 90, 55, 100},
                {23, 56, 73, 44, 56},
                {86, 34, 99, 32, 18, 33},
                {45, 23, 11, 11, 33, 22, 65},
                {10, 56, 11, 1}
        };

        System.out.println("Сортируем по возрастанию");
        int indexMin;
        for (int i = 0; i < arr.length; i++) {  // привязываемся к строке по строкам
            for (int j = 0; j < arr[i].length; j++) { // привязываемся к элементу
                indexMin = j;
                for (int x = j; x < arr[i].length; x++) { // пробегаем остальные элементы

                    if (arr[i][x] < arr[i][indexMin]) {
                        indexMin = x;
                    }
                }

                int buf = arr[i][j];
                arr[i][j] = arr[i][indexMin];
                arr[i][indexMin] = buf;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nСортируем по убыванию");
        int indexMax;
        for (int i = 0; i < arr.length; i++) {  // привязываемся к строке
            for (int j = 0; j < arr[i].length; j++) { // привязываемся к элементу
                indexMax = j;
                for (int x = j; x < arr[i].length; x++) { // пробегаем по остальным элементам

                    if (arr[i][x] > arr[i][indexMax]) {
                        indexMax = x;
                    }
                }

                int buf = arr[i][j];
                arr[i][j] = arr[i][indexMax];
                arr[i][indexMax] = buf;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
