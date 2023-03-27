public class Main {
    public static void main(String[] args) {
        // membuat objek
        Shape shape = new Shape();
        Circle circle = new Circle(2.5);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        Square square = new Square(5.0);

        // print info objek
        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
        System.out.println(square.toString());
        System.out.println(" ");

        // mengubah atribut nilai
        shape.setColor("blue");
        shape.setFilled(false);
        circle.setRadius(3.0);
        rectangle.setWidth(5.0);
        rectangle.setLength(7.0);
        square.setSide(6.0);

        System.out.println("Luas circle: " + circle.getArea());
        System.out.println("Keliling circle: " + circle.getPerimeter());
        System.out.println("Luas rectangle: " + rectangle.getArea());
        System.out.println("Keliling rectangle: " + rectangle.getPerimeter());
        System.out.println("Luas square: " + square.getArea());
        System.out.println("Keliling square: " + square.getPerimeter());
        System.out.println(" ");
    }
}