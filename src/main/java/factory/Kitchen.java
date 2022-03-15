package factory;

public class Kitchen implements Toy{
    String description = "Fully kitted out play kitchen with utensils and food";
    @Override
    public String getDescription() {
        return description;
    }
}
