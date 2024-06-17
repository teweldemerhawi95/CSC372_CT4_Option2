public class ShapeArray {
    public static void main(String[] args) {
        Shape[] shapeArray = new Shape[3];
        
        // Creating new instances of each shape class and adding them to the shapeArray
        shapeArray[0] = new Triangle(2, 5, 6);
        shapeArray[1] = new Circle(7);
        shapeArray[2] = new Rectangle(3, 7);

        // Using for-each loop to print the contents
        for (Shape shape : shapeArray) {
            System.out.println(shape);
        }
    }
}