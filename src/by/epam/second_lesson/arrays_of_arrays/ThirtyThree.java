package by.epam.second_lesson.arrays_of_arrays;

// Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов

public class ThirtyThree {
    public static void main(String[] args) {
        int[][] arr = {
                {80, 30, 10, 45, 90, 55, 100},
                {23, 56, 73, 56, 30, 44, 56},
                {86, 34, 99, 32, 18, 33, 43},
                {45, 23, 11, 11, 33, 22, 65},
                {10, 56, 80, 76, 30, 11, 1}
        };

        System.out.println("Сортируем столбцы по возрастанию");
        int indexMin;
        for (int i = 0; i < arr[0].length; i++) { // привязывваемся к столбцу
            for (int j = 0; j < arr.length; j++) { // привязываемся к элементу столбца
                indexMin = j;

                for (int x = j; x < arr.length; x++) { // пробегаем столбец

                    if (arr[x][i] < arr[indexMin][i]) {
                        indexMin = x;
                    }

                }

                int buf = arr[j][i];
                arr[j][i] = arr[indexMin][i];
                arr[indexMin][i] = buf;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nСортируем столбцы по убыванию");
        int indexMax;
        for (int i = 0; i < arr[0].length; i++) {  // привязывваемся к столбцу
            for (int j = 0; j < arr.length; j++) {  // привязываемся к элементу столбца
                indexMax = j;

                for (int x = j; x < arr.length; x++) { // пробегаем столбец

                    if (arr[indexMax][i] < arr[x][i]) {
                        indexMax = x;
                    }

                }

                int buf = arr[j][i];
                arr[j][i] = arr[indexMax][i];
                arr[indexMax][i] = buf;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
