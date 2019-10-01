package by.epam.second_lesson.arrays_of_arrays;

// Найдите произведение двух матриц

public class ThirtyNine {
    public static void main(String[] args) {

        int[][] first = {
                {5, 7, 3, 0},
                {11, 5, 6, 2},
                {3, 4, 9, 8}
        };

        int[][] second = {
                {4, 3, 2},
                {6, 2, 21},
                {8, 0, 4},
                {7, 1, 6}
        };

        int[][] res = new int[first.length][second[0].length];

        for (int i = 0; i < first.length; i++){
            for (int j = 0; j < second[0].length; j++){
                for (int x = 0; x < second.length; x++){

                    res[i][j] += first[i][x] * second[x][j];

                }

            }
        }

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }


    }
}
