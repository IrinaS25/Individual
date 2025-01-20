package lesson.lesson1.presentation;

import lesson.lesson1.controller.ToyController;

import java.util.Scanner;

public class ConsoleUI {

    private final Scanner scanner;
    private ToyController toyController;

    public ConsoleUI() {
        this.scanner = new Scanner(System.in);
        this.toyController = new ToyController();


    }

    public void start() {

        while (true) {
            System.out.println("1. Add toy");
            System.out.println("2. Get info about toy");
            System.out.println("3. Delete toy");
            System.out.println("4. Print all toys");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Add toy...");
                    toyController.addToy(scanner);
                    break;
                case 2:
                    System.out.println("Get info about toy");
                    break;
                case 3:
                    System.out.println("Delete toy");
                    break;
                case 4:
                    System.out.println("Print all toys");
                    break;
                case 5:
                    System.out.println("Exit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}


