package e0051_Inheritance_2;

public class DemoBoxWeightMain {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume mybox1 = " + vol);
        System.out.println("Weight mybox1 = " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Volume mybox2 = " + vol);
        System.out.println("Weight mybox2 = " + mybox2.weight);
    }
}
//