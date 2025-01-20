package lesson.lesson1.service;

import lesson.lesson1.model.Toy;
import lesson.lesson1.repository.ToyRepository;

import java.util.ArrayList;
import java.util.List;

public class ToyService {
    private final ToyRepository toyRepository;

    public ToyService(ToyRepository toyRepository) {
        this.toyRepository = toyRepository;
    }
    public void  addToy (Toy toy) {
        toyRepository.addToy(toy);
    }
    public List<Toy> getAllToys() {
        return toyRepository.getAllToys();

    }
}
