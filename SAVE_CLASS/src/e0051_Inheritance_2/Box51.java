package e0051_Inheritance_2;

public class Box51 {
    double width;
    double height;
    double depth;

    Box51(Box51 obj) {
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }

    Box51(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box51() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box51(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}