package by.epam.second_lesson.arrays_of_arrays;

// Найдите сумму двух матриц

public class ThirtyEight {
    public static void main(String[] args) {

        int[][] first = {
                {5, 7, 3, 0},
                {11, 5, 6, 2},
                {3, 4, 9, 8}
        };

        int[][] second = {
                {4, 6, 8, 7},
                {3, 2, 0, 1},
                {2, 21, 4, 6}
        };

        int[][] res = new int[first.length][first[0].length];

        for (int i = 0; i < res.length; i++){
            for (int j = 0; j < res[0].length; j++){

                res[i][j] = first[i][j] + second[i][j];

                System.out.print(res[i][j] + " ");
            }

            System.out.println();
        }
    }
}
