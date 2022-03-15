package factory;

import java.util.ArrayList;

public class FactoryMain {

    public static void main(String[] args){
        TillysToyShop shop = new TillysToyShop();
        ArrayList<Toy> orderedToys = new ArrayList<>();

        orderedToys.add(shop.getToy("Doll"));
        orderedToys.add(shop.getToy("Car"));
        orderedToys.add(shop.getToy("Kitchen"));
        orderedToys.add(shop.getToy("Blocks"));
        orderedToys.add(shop.getToy("Nerf Gun"));

        System.out.println("You have successfully ordered:");
        int count =1;
        for (Toy t: orderedToys){
            if (t != null){
                System.out.println(count++ + ". " + t.getDescription());
            }
        }

    }
}
