package homework.homework1;
/*

 */

public class Task5 {
    public static void main(String[] args) {

        //создаю массив из 10 целых чисел
        int array [] = {3, 55, 7, 12, 3, 4, 6, 4, 55, 7};

        //создаю переменную для хранения суммы
        int sum = 0;

        //цикл for для перебора элементов массива
        for (int i = 0; i < array.length; i++) {

            //нахожу сумму
            sum += array [i];

        }

        System.out.println("Сумма элементов массива: " + sum);

    }
}
