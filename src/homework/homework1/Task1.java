package homework.homework1;

public class Task1 {
    /*
Задача: Напишите программу, ĸоторая создает массив из 10 целых чисел и выводит его на эĸран.
Условие: Используйте циĸл for для вывода элементов массива.
 */
        public static void main(String[] args) {
            //создаю массив из 10 целых чисел
            int[] array = {1, 30, 12, 5, 3, 4, 7, 8, 2, 6};
            //цикл for для перебора и вывода элементов массива
            for (int i = 0; i < array.length; i++) {
                // вывод элементов массива
                System.out.printf("%d | ", (array[i]));
            }
        }

    }


