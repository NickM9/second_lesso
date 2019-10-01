package by.epam.second_lesson.arrays_of_arrays;

// Переставить строки матриц случайным образом

public class ThirtySeven {
    public static void main(String[] args) {

        int [][] arr = {
                {3, 6, 5, 4},
                {18, 13, 56, 7},
                {42, 41, 87, 11},
                {65, 54, 81, 22},
                {11, 19, 76, 54},
                {11, 45, 67, 90}
        };

        int first = 0;
        int second = 0;
        boolean isEquals = true;
        while (isEquals){
            first = (int)(Math.random() * arr.length) + 1;
            second = (int)(Math.random() * arr.length) + 1;
            isEquals = first == second ? true : false;
        }

        System.out.println("Поменять местами строки : " + first + " и " + second);
        first--;
        second--;

        int[][] res = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {

                if (i == first) {
                    res[second][j] = arr[i][j];
                } else if (i == second) {
                    res[first][j] = arr[i][j];
                } else {
                    res[i][j] = arr[i][j];
                }
            }
        }

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }

    }
}
