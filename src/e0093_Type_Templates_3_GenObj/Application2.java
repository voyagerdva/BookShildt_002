package e0093_Type_Templates_3_GenObj;

public class Application2 {
    public void run() {
        Gen2<Integer> iOb;
        iOb = new Gen2<Integer>(88);
        iOb.showType();
    }
}
