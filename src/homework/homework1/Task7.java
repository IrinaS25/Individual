package homework.homework1;
/*
Задача: Напишите программу, ĸоторая создает массив из 10 целых чисел и находит ĸоличество положительных элементов в массиве.
Условие: Используйте циĸл for для вычисления ĸоличества положительных элементов.
 */

public class Task7 {
    public static void main(String[] args) {

        //создаю массив из 10 целых чисел
        int array [] = {3, 55, -7, 12, 3, 4, -6, 4, -55, 7};

        //задаю счетчик для подсчета положительных элементов в массиве
        int counter = 0;

        //цикл for для перебора элементов массива
        for (int i = 0; i < array.length ; i++) {

            if (array[i] > 0) {
                array [i] = counter;
                counter++;
            }

        }

        System.out.println(counter);
    }
    }

