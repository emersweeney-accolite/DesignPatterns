package decorator;

public class FlakeDecorator implements IceCream{
    private float additionalCost=0.9f;
    private IceCream iceCream;

    public FlakeDecorator(IceCream iceCream){
        this.iceCream=iceCream;
    }

    @Override
    public float getCost() {
        return iceCream.getCost() + additionalCost;
    }

    @Override
    public void printCostBreakdown() {
        iceCream.printCostBreakdown();
        System.out.println("+ Flake: £"+additionalCost);
    }
}
