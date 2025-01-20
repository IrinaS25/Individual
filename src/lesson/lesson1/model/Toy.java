package lesson.lesson1.model;

import java.util.Scanner;

public class Toy {

    public static int counter = 1;
    private int id;
    private ToyCategory category;
    private ToyAgeCategory ageCategory;
    private String name;
    private double price;


    public Toy(ToyCategory category, ToyAgeCategory ageCategory, String name, double price) {
        this.id = counter++;
        this.category = category;
        this.ageCategory = ageCategory;
        this.name = name;
        this.price = price;
    }

    public ToyCategory getCategory() {
        return category;
    }

    public void setCategory(ToyCategory category) {
        this.category = category;
    }

    public ToyAgeCategory getAgeCategory() {
        return ageCategory;
    }

    public void setAgeCategory(ToyAgeCategory ageCategory) {
        this.ageCategory = ageCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Toy: {" +
                "id=" + id +
                ", category=" + category +
                ", ageCategory=" + ageCategory +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Toy)) return false;

        Toy toy = (Toy) o;
        return Double.compare(price, toy.price) == 0 && category == toy.category && ageCategory == toy.ageCategory && name.equals(toy.name);
    }

    @Override
    public int hashCode() {
        int result = category.hashCode();
        result = 31 * result + ageCategory.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + Double.hashCode(price);
        return result;
    }
}

