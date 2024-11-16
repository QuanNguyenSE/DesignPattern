public class test {
    public static void main(String[] args) {
        DrawingApp app = new DrawingApp();

        // Vẽ hình tròn màu đỏ tại các vị trí khác nhau
        app.drawShape("Red", "Circle", 10, 20);
        app.drawShape("Red", "Circle", 50, 60); // Không tạo lại đối tượng mới, tái sử dụng

        // Vẽ hình vuông màu xanh
        app.drawShape("Blue", "Square", 30, 40);

        // Vẽ hình tròn màu xanh
        app.drawShape("Green", "Circle", 70, 80);
    }
}
