package sub2;

public class CTrapezoid {
    int upper;
    int base;
    int height;

    public CTrapezoid(int u, int b, int h) {
        upper = u;
        base = b;
        height = h;
    }

    public void show() {
        System.out.println("upper" + upper + "base" + base + "height" + height + "體積" + (upper + base) * height / 2);
    }

}
