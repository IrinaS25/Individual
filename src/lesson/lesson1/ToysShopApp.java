package lesson.lesson1;

import lesson.lesson1.model.Toy;
import lesson.lesson1.model.ToyAgeCategory;
import lesson.lesson1.model.ToyCategory;
import lesson.lesson1.presentation.ConsoleUI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToysShopApp {
    public static void main(String[] args) {
        ConsoleUI consoleUI = new ConsoleUI();
        consoleUI.start();
        /*Toy barbie = new Toy(ToyCategory.DOLL, ToyAgeCategory.MIDDLE, "Marie", 4.9);
        Toy puzzle = new Toy(ToyCategory.PUZZLE, ToyAgeCategory.LARGE, "London", 3.9);
        System.out.println(barbie.toString());
        List<Toy> toys = new ArrayList<>();
        System.out.println(toys);
        toys.add(barbie);
        System.out.println(toys);
        toys.add(puzzle);
        System.out.println(toys);


         */
    }
}
