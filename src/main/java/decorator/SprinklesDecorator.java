package decorator;

public class SprinklesDecorator implements IceCream{
    private float additionalCost = 0.3f;
    private IceCream iceCream;

    public SprinklesDecorator(IceCream iceCream){
        this.iceCream=iceCream;
    }

    @Override
    public float getCost() {
        return iceCream.getCost() + additionalCost;
    }

    @Override
    public void printCostBreakdown() {
        iceCream.printCostBreakdown();
        System.out.println("+ Sprinkles: £"+additionalCost);
    }
}
