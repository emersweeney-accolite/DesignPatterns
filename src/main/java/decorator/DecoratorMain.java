package decorator;

public class DecoratorMain {

    public static void main(String[] args) throws Exception {
        IceCream thorfinnsIceCream = new IceCreamCone(1);
        IceCream hadisIceCream = new IceCreamCone(2);
        IceCream danielsIceCream = new IceCreamTub(3);
        IceCream emersIceCream = new IceCreamTub(2);

        /* Thorfinn asks for raspberry sauce */
        thorfinnsIceCream = new RaspberrySauceDecorator(thorfinnsIceCream);
        System.out.println("Thorfinn's order:");
        thorfinnsIceCream.printCostBreakdown();
        System.out.println("Total cost: £"+thorfinnsIceCream.getCost()+"\n");

        /* Hadi asks for raspberry sauce and sprinkles */
        hadisIceCream = new SprinklesDecorator(new RaspberrySauceDecorator(hadisIceCream));
        System.out.println("Hadi's order:");
        hadisIceCream.printCostBreakdown();
        System.out.println("Total cost: £"+hadisIceCream.getCost()+"\n");

        /*Daniel asks for rasberry sauce, sprinkles and flake*/
        danielsIceCream = new FlakeDecorator(new SprinklesDecorator(new RaspberrySauceDecorator(danielsIceCream)));
        System.out.println("Daniel's order:");
        danielsIceCream.printCostBreakdown();
        System.out.println("Total cost: £"+danielsIceCream.getCost()+"\n");

        /*Emer asks for no toppings*/
        System.out.println("Emer's order:");
        emersIceCream.printCostBreakdown();
        System.out.println("Total cost: £"+emersIceCream.getCost()+"\n");


    }
}
