package lesson.lesson1.repository;

import lesson.lesson1.model.Toy;

import java.util.ArrayList;
import java.util.List;

public class ToyRepository {

    private ArrayList<Toy> toys = new ArrayList<>();

    public void addToy (Toy toy) {
        toys.add(toy);
    }

    public List<Toy> getAllToys() {
        return toys;
    }
    public void getInfoAboutToy (Toy toy) {


    }
    public void delateToy (Toy toy) {

    }
}
