package Market;

public class MarketGood {
    private String name;
    private int retailPrice;
    private int disCountRate;

    public MarketGood(String name, int retailPrice) {
        this.name = name;
        this.retailPrice = retailPrice;
    }

    public MarketGood(String name, int retailPrice, int disCountRate){
        this.name = name;
        this.retailPrice = retailPrice;
        this.disCountRate = disCountRate;
    }

    public String getName() {
        return name;
    }

    public int getRetailPrice() {
        return retailPrice;
    }

    public int getDisCountRate() {
        this.name = name;
        return disCountRate;
    }
}
