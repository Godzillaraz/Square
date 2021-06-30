public class Rectangle implements Squareable{
    private double A;
    private double B;
    private double S;

    public Rectangle(double a, double b) {
        A = a;
        B = b;
    }

    public double getA() {
        return A;
    }

    public void setA(double a) {
        A = a;
    }

    public double getB() {
        return B;
    }

    public void setB(double b) {
        B = b;
    }



    @Override
    public void calcsquare() {
        double S;
        S=A*B;
        System.out.println("Square of this rectangle = " + S);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "S=" + S +
                '}';
    }
}
