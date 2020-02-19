package training.starbucks;

public enum CoffeeType {
    LATTE("Latte", 700),
    CAPPUCINO("Cappucino", 750),
    MOCCA("Mocca", 800),
    AMERICANO("Americano", 500),
    WRONG("wrong", 0);

    private int coffeeCost;
    private String coffeeName;

    CoffeeType(String coffeeName, int coffeeCost) {
        this.coffeeName = coffeeName;
        this.coffeeCost = coffeeCost;
    }

    public int getCoffeeCost() {
        return coffeeCost;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public static CoffeeType findByName(String name) {
        for (CoffeeType type : CoffeeType.values()) {
            if (type.getCoffeeName().equalsIgnoreCase(name)) {
                return type;
            }
        }
        return WRONG;
    }
}