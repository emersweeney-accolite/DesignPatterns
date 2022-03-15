package factory;

public class Car implements Toy{
    String description = "Remote control car";
    @Override
    public String getDescription() {
        return description;
    }
}
