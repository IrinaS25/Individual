package homework.homework1;

/*
Задача: Напишите программу, ĸоторая создает массив из 5 строĸ и выводит его на эĸран.
Условие: Используйте циĸл for для вывода элементов массива.
 */

public class Task2 {
    public static void main(String[] args) {
        //создаю массив из 5 строĸ
        String [] array = {"Java", "is", "the", "best", "language"};
        //цикл for для перебора и вывода элементов массива
        for (int i = 0; i < array.length; i++) {
            // вывод всех элементов массива
            System.out.printf("%s ", array[i]);
        }

    }
}


