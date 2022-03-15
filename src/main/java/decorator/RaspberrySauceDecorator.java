package decorator;

public class RaspberrySauceDecorator implements IceCream{
    private float additionalCost=0.5f;
    private IceCream iceCream;

    public RaspberrySauceDecorator(IceCream iceCream){
        this.iceCream=iceCream;
    }

    @Override
    public float getCost() {
        return iceCream.getCost() + additionalCost;
    }

    @Override
    public void printCostBreakdown() {
        iceCream.printCostBreakdown();
        System.out.println("+ Raspberry sauce: £"+additionalCost);
    }
}
