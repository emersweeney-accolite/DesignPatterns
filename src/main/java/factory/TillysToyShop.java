package factory;

import java.util.Locale;

public class TillysToyShop implements ToyShop {

    @Override
    public Toy getToy(String toy) {
        String lowercaseToy = toy.toLowerCase(Locale.ROOT);
        switch (lowercaseToy){
            case ("doll"): return new Doll();
            case ("car"): return new Car();
            case ("blocks"): return new Blocks();
            case ("kitchen"): return new Kitchen();
            default: System.out.println("\nPLEASE NOTE: Unfortunately, we do not stock " + toy +".\n"); return null;
        }
    }
}
