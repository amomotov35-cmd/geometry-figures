public class Main {
    public static void main(String[] args) {
        System.out.println("Testing geometric figures:");

        // Тест прямоугольника
        try {
            Rectangle rect = new Rectangle(5, 10);
            System.out.println("\nRectangle (5x10):");
            System.out.println("Area: " + rect.getArea());
            System.out.println("Perimeter: " + rect.getPerimeter());
        } catch (RuntimeException e) {
            System.out.println("Rectangle error: " + e.getMessage());
        }

        // Тест круга
        try {
            Circle circle = new Circle(7);
            System.out.println("\nCircle (radius=7):");
            System.out.println("Area: " + circle.getArea());
            System.out.println("Perimeter: " + circle.getPerimeter());
        } catch (RuntimeException e) {
            System.out.println("Circle error: " + e.getMessage());
        }

        // Тест треугольника
        try {
            Triangle triangle = new Triangle(3, 4, 5);
            System.out.println("\nTriangle (3,4,5):");
            System.out.println("Area: " + triangle.getArea());
            System.out.println("Perimeter: " + triangle.getPerimeter());
        } catch (RuntimeException e) {
            System.out.println("Triangle error: " + e.getMessage());
        }

        // Тест с ошибкой
        try {
            Triangle invalid = new Triangle(1, 1, 3);
        } catch (RuntimeException e) {
            System.out.println("\nInvalid triangle test: " + e.getMessage());
        }
    }
}