public class Main {
    public static void main(String[] args) {
        Circle circle1= new Circle(6);
        Rectangle rectangle1 = new Rectangle(8,4);
        Circle circle2= new Circle(6.9);
        Rectangle rectangle2 = new Rectangle(1,1);
        Circle circle3= new Circle(88);
        Rectangle rectangle3 = new Rectangle(4.5,0.8);
        Circle circle4= new Circle(6234);
        Rectangle rectangle4 = new Rectangle(666,666);
        Squareable[] squares = {circle1,circle2,circle3,circle4,rectangle1,rectangle2,rectangle3,rectangle4};
        for (Squareable squareable : squares)
            squareable.calcsquare();
    }
}
