package factory;

public class Blocks implements Toy{
    String description = "Multicoloured building blocks";
    @Override
    public String getDescription() {
        return description;
    }
}
