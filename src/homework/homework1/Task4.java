package homework.homework1;
/*
Задача: Напишите программу, ĸоторая создает массив из 5 строĸ и находит строĸу с маĸсимальной длиной.
Условие: Используйте циĸл for для поисĸа строĸи с маĸсимальной длиной.
 */

public class Task4 {
    public static void main(String[] args) {

        //создаю массив из 5 строĸ
        String array [] = {"Java", "is", "the", "best", "language"};

        //создаю переменную для хранения максимальной длины строки
         String max = array [0];

         //цикл for для перебора элементов массива
        for (int i = 0; i < array.length; i++) {

            //пишу условие
            if (array[i].length() > max.length()) {
                max = array [i];
            }

        }
        System.out.println(max);

    }
}