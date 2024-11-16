public class Square implements Shape {
    private String color; // Trạng thái chia sẻ (màu sắc)

    public Square(String color) {
        this.color = color;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Vẽ hình vuông màu " + color + " tại vị trí (" + x + ", " + y + ")");
    }
}