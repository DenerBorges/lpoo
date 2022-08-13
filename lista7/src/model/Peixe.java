package model;

public class Peixe extends Animal{

    private double z = 0.0;

    public Peixe() {
        super();
    }

    public Peixe(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public Peixe(double x, double y) {
        super(x, y);
    }

    public void mover(double x, double y, double z) {
        super.mover(x, y);
        this.z = z;
    }

    @Override
    public void desenhar() {
        System.out.print("\nDesenhou um peixe!");
    }

    @Override
    public String toString() {
        return "\nPeixe [X=" + x + ", Y= " + y + ", Z= " + z + "]";
    }
}
