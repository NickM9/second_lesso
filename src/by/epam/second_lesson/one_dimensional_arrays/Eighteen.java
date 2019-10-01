package by.epam.second_lesson.one_dimensional_arrays;

/*
"Суперзамок". Секретный замок для сейфа состоит из 10 расположенных в ряд ячеек,
в которые надо вставить игральные кубики. Но дверь открывается только в том случае,
когда в любых трёх соседних ячейках сумма точек на передних гранях кубиков равна 10.
(Игральный кубик имеет на каждой грани от 1 до 6 точек). Напишите программу. которая разгадывает
код замка при условии, что два кубика уже вставлены в ячейки.
 */

public class Eighteen {
    public static void main(String[] args) {

        // Индексы и значения вставленных кубиков
        int indexFirst = (int) (Math.random() * 10);
        int indexSecond = (int) (Math.random() * 10);

        while (indexFirst == indexSecond){
            indexSecond = (int) (Math.random() * 10);
        }

        int[] lock = new int[10];
        lock[indexFirst] = (int)(Math.random() * 6) + 1;
        lock[indexSecond] = (int)(Math.random() * 6) + 1;
        boolean isRight = false;

        // Подбираем подходящую комбинацию
        while (!isRight){

            // Инициализируем переменные
            for (int i = 0; i < lock.length; i++){

                if (i != indexFirst && i != indexSecond){
                    lock[i] = (int)(Math.random() * 6) + 1;
                }

            }

            // Проверяем на условие
            for (int i = 0; i < lock.length-2; i++){

                if (lock[i] + lock[i+1] + lock[i+2] == 10){
                    System.out.println(lock[i] + " " + lock[i+1] + " " + lock[i+2]);
                    isRight = true;
                    break;
                }

            }

        }

        System.out.println(java.util.Arrays.toString(lock));
    }
}

/*
Если в условии имелось ввиду что в вся последовательность должна быть из такой выигрышной комбинации
и вставленные кубики занимали первые две позиции тогда

int first = (int)(Math.random() * 6) + 1;
        int second = (int)(Math.random() * 6) + 1;
        int third;

        int[] lock = new int[10];
        lock[0] = first;
        lock[1] = second;

        if (first + second > 4 && first + second < 9){

            third = 10 - first - second;
            lock[2] = third;

            for (int i = 3; i < lock.length; i += 3){
                lock[i] = first;
            }

            for (int i = 4; i < lock.length; i += 3){
                lock[i] = second;
            }

            for (int i = 5; i < lock.length; i += 3){
                lock[i] = third;
            }

            System.out.println(java.util.Arrays.toString(lock));

        } else {
            System.out.println("error");
        }
 */
