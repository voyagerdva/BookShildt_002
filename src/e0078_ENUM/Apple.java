package e0078_ENUM;

public enum Apple {
    Jonatan(11), GoldenDel(12), RedDel(13);

    private int price;

    Apple(int PPP) {
        price = PPP;
    }

    int getPrice() {
        return price;
    }

}
