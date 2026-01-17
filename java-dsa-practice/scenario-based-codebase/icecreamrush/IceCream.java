package icecreamrush;

class IceCream {
    String flavor;
    int soldCount;

    IceCream(String flavor, int soldCount) {
        this.flavor = flavor;
        this.soldCount = soldCount;
    }

    @Override
    public String toString() {
        return flavor + " → Sold: " + soldCount;
    }
}