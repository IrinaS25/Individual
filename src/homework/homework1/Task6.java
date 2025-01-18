package homework.homework1;
/*
Задача: Напишите программу, ĸоторая создает массив из 5 строĸ и находит строĸу, ĸоторая начинается с определенной буĸвы.
Условие: Используйте циĸл for для поисĸа строĸи, ĸоторая начинается с определенной буĸвы.
 */

public class Task6 {
    public static void main(String[] args) {

        //создаю массив из 5 строĸ
        String [] array = {"Java", "is", "the", "best", "language"};

        //создаю переменную для хранения первой буквы
        char firstLetter = 'J';

        //цикл for для перебора элементов массива
        for (int i = 0; i < array.length; i++) {

            //пишу условие
            if (array[i].charAt(0) == firstLetter) {
                System.out.println(array[i]);
            } else {
                System.out.println("Not found");
            }
        }
    }
}
