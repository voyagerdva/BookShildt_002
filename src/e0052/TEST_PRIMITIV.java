package e0052;

public class TEST_PRIMITIV {
    public static void main(String[] args) {
        short A = 0x0020;
        short B = 0x000a;

        int C = (A << 8)|B;

        System.out.println(Integer.toHexString(C));
    }
}

