package e0080_ENUM_3;

public enum Apple3 {
    Jonatan(10), GoldenDel(9), RedDel(12),;

    private int price;

    Apple3(int p) {
        price = p;
    }

    Apple3() {
        price = -1;
    }


    int getPrice() {
        return price;
    }
}
//