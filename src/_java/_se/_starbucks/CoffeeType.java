package _java._se._starbucks;

public enum CoffeeType {
    LATTE("Latte", 700),
    CAPPUCINO("Cappucino", 750),
    MOCCA("Mocca", 800),
    AMERICANO("Americano", 500);

    private int cost;
    private String name;

    CoffeeType(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public static CoffeeType findByName(String name) {
        for (CoffeeType type : CoffeeType.values()) {
            if (type.getName().equalsIgnoreCase(name)) {
                return type;
            }
        }
        return null;
    }
}


