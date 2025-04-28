package Quiz;

public class Category {

    public String label;
    public String description; // after user is done and gets this category, will output description.
    public int points = 0;

    public Category(String c, String description) {
        this.label = c;
        this.description = description;
    }

}
