package factory;

public class Doll implements Toy{
    String description = "Baby Annabelle doll with laughing and crying noises";
    @Override
    public String getDescription() {
        return description;
    }
}
