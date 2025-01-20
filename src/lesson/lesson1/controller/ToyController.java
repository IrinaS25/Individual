package lesson.lesson1.controller;

import lesson.lesson1.model.Toy;
import lesson.lesson1.model.ToyAgeCategory;
import lesson.lesson1.model.ToyCategory;
import lesson.lesson1.repository.ToyRepository;
import lesson.lesson1.service.ToyService;

import java.util.List;
import java.util.Scanner;

public class ToyController {
    private ToyRepository toyRepository;
    private ToyService toyService;

    public ToyController() {
        toyRepository = new ToyRepository();
        toyService = new ToyService(toyRepository);
    }
    public  void addToy (Scanner scanner) {
        System.out.println("Enter toy name: ");
        String name = scanner.nextLine();
        System.out.println("Enter toy category: 1. soft toy, 2. doll, 3. lego, 4. puzzle");
        int numToyCategory = scanner.nextInt();
        scanner.nextLine();
        ToyCategory toyCategory = getCategory(numToyCategory);
        System.out.println("Enter toy age category: 1. small, 2. middle, 3. large");
        int numToyAgeCategory = scanner.nextInt();
        scanner.nextLine();
        ToyAgeCategory toyAgeCategory = getToyAgeCategory(numToyAgeCategory);
        System.out.println("Enter toy price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        Toy toy = new Toy(toyCategory, toyAgeCategory, name, price);
        toyService.addToy(toy);
        System.out.println(toy);
    }

    private ToyCategory getCategory (int num) {
        ToyCategory toyCategory = ToyCategory.PUZZLE;
        switch (num){
            case 1:
                toyCategory = ToyCategory.SOFT_TOY;
                break;
            case  2:
                toyCategory = ToyCategory.DOLL;
                break;
            case  3:
                toyCategory = ToyCategory.LEGO;
                break;
            case 4:
                toyCategory = ToyCategory.PUZZLE;
                break;
            default:
                toyCategory = ToyCategory.NONCHOISE;
                break;
        }
        return toyCategory;
    }
    private ToyAgeCategory getToyAgeCategory(int num) {
        ToyAgeCategory toyAgeCategory = ToyAgeCategory.SMALL;
        switch (num){
            case 1:
                toyAgeCategory = ToyAgeCategory.SMALL;
                break;
            case 2:
                toyAgeCategory = ToyAgeCategory.MIDDLE;
                break;
            case 3:
                toyAgeCategory = ToyAgeCategory.LARGE;
                break;
            default:
                toyAgeCategory = ToyAgeCategory.NONCHOISE;
                break;
        }
        return toyAgeCategory;

    }
    public   void printAllToys () {
        List<Toy> allToys = toyService.getAllToys();

        if (!allToys.isEmpty()) {
            for (Toy toy : allToys) {
                System.out.println(toy);
            }
            }else {
                System.out.println("There are no toys");
            }
        }


    }

