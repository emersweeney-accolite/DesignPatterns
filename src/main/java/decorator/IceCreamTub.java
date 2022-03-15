package decorator;

public class IceCreamTub implements IceCream {
    int size;
    float cost;

    public IceCreamTub(int size) throws Exception {
        this.size=size;
        switch(size){
            case 1: cost = 2f; break;
            case 2: cost = 2.5f; break;
            case 3: cost = 3f; break;
            default: throw new Exception("Invalid size. Please enter 1, 2 or 3 as constructor argument.");
        }
    }

    @Override
    public float getCost() {
        return cost;
    }

    @Override
    public void printCostBreakdown() {
        System.out.println("Ice cream tub with "+size+" scoop(s): £"+cost);
    }
}
