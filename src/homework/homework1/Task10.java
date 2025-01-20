package homework.homework1;

import java.util.Scanner;

/*
Напишите программу, ĸоторая создает массив из 5 строĸ и находит строĸу,
ĸоторая содержит маĸсимальное ĸоличество пробелов.
Условие: Используйте циĸл for для поисĸа строĸи, ĸоторая содержит маĸсимальное ĸоличество пробелов.

 */
public class Task10 {
    public static void main(String[] args) {

        //создаю массив из 5 строĸ
        String [] array = {"Java ", "is  ", "the   ", "best ", "language    "};

        // создаю переменную для хранения индекса строки с максимальным количеством пробелов
        int maxSpaceIndex = 0;

        // создаю переменную для хранения максимального количества числа пробелов
        int maxSpaceCounter = 0;

        //цикл for для перебора элементов массива
        for (int i = 0; i < array.length; i++) {

            // создаю переменную для хранения количества пробелов
            int spaceCounter = 0;

            //цикл for для перебора элементов строки
            for (int j = 0; j < array[i].length(); j++) {

                //пишу условие
                if (array[i].charAt(j) == ' ') {
                    spaceCounter++;
                }
            }
            //пишу условие
            if (spaceCounter > maxSpaceIndex) {
                maxSpaceIndex = spaceCounter;
                maxSpaceCounter = i;
            }
        }
        System.out.println(array[maxSpaceCounter]);









        }



    }

