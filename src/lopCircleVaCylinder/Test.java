package lopCircleVaCylinder;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(2.5,"den lam");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(5.5);
        System.out.println(cylinder);
        cylinder = new Cylinder(2.5,"xanh lam",7);
        System.out.println(cylinder);
    }
}
