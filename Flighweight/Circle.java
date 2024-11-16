public class Circle implements Shape {
    private String color; // Trạng thái chia sẻ (màu sắc)

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Vẽ hình tròn màu " + color + " tại vị trí (" + x + ", " + y + ")");
    }
}