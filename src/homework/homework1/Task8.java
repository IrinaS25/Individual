package homework.homework1;
/*
. Задача: Напишите программу, ĸоторая создает массив из 5 строĸ и находит ĸоличество строĸ, ĸоторые содержат определенное слово.
Условие: Используйте циĸл for для поисĸа строĸ, ĸоторые содержат определенное слово.
 */

public class Task8 {
    public static void main(String[] args) {

        //создаю массив из 5 строĸ
        String [] array = {"Java", "is", "the", "the", "the"};

        //создаю переменную для хранения счетчика
        int counter = 0;

        //создаю переменную для хранения слова
        String word = "the";

        //цикл for для перебора элементов массива
        for (int i = 0; i < array.length; i++) {

            //пишу условие
            if (array[i] == word) {
                counter++;
            }

        }
        //вывожу результат
        System.out.println(counter);

    }
}
