public class DrawingApp {
    private ShapeFactory shapeFactory = new ShapeFactory();

    public void drawShape(String color, String type, int x, int y) {
        Shape shape = shapeFactory.getShape(color, type); // Nhận hình từ Factory
        shape.draw(x, y); // Vẽ hình
    }
}
