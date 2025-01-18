package homework.homework1;
/*
Задача: Напишите программу, ĸоторая создает массив из 10 целых чисел и находит маĸсимальный элемент в массиве.
Условие: Используйте циĸл for для поисĸа маĸсимального элемента.
 */
public class Task3 {
    public static void main(String[] args) {
        //создаю массив из 10 целых чисел
        int[] array = {4, 6, 2, 9, 10, 8, 3, 99, 1, 5};

        // создаю переменную для хранения максимального элемента
        int max = array[0];

        //цикл for для перебора элементов массива
        for (int i = 0; i < array.length; i++) {

        // пишу условие
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
