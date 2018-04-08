package xyz.dodo.fortnite.entity;

public class Stat {
    private String label;
    private Category category;
    private String field;
    private String value;

    public enum Category {
        General, Tops, life_time, unknown
    }

    public Stat() {
        this.label = "Error";
        this.category = Category.unknown;
        this.field = "Error";
        this.value = "-9999";
    }

    public Stat(String label, String category, String field, String value) {
        this.label = label;
        this.category = getCategoryFromString(category);
        this.field = field;
        this.value = value;
    }

    public Stat(String label, String value) {
        this.label = label;
        this.category = Category.life_time;
        this.field = label;
        this.value = value.replace(",", "");
    }


    public String getLabel() {
        return label;
    }

    public Category getCategory() {
        return category;
    }

    public static Category getCategoryFromString(String category){
        switch (category) {
            case "General":
                return Category.General;
            case "Tops":
                return Category.Tops;
            case "life":
                return Category.life_time;
        }
        return Category.unknown;
    }

    @Override
    public String toString() {
        return "Stat{" +
                "label='" + label + '\'' +
                ", category=" + category +
                ", field='" + field + '\'' +
                ", value=" + value +
                '}';
    }

    public String getField() {
        return field;
    }

    public String getValue() {
        return value;
    }
}
