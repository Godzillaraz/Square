public class Circle implements Squareable {
    private double D;
    private double S;

    public Circle(double d) {
        D = d;
    }

    public double getD() {
        return D;
    }

    public void setD(double d) {
        D = d;
    }

    @Override
    public void calcsquare() {
        double S;
        S=D*D*3.14/4;
        System.out.println("Square of this Circle is = " + S);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "S=" + S +
                '}';
    }
}
