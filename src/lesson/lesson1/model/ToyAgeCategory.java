package lesson.lesson1.model;

public enum ToyAgeCategory {
    SMALL("less than 3 year"),
    MIDDLE("from 3 to 6 year"),
    LARGE("more than 6 year"),
    NONCHOISE("empty");

    private final String description;

    ToyAgeCategory(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
