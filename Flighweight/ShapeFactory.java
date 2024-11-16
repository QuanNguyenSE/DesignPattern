import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
     private Map<String, Shape> shapeMap = new HashMap<>();  // Lưu trữ các hình đã được tạo

    public Shape getShape(String color, String type) {
        String key = color + "_" + type;
        
        if (!shapeMap.containsKey(key)) {
            if (type.equalsIgnoreCase("Circle")) {
                shapeMap.put(key, new Circle(color));
            } else if (type.equalsIgnoreCase("Square")) {
                shapeMap.put(key, new Square(color));
            }
            System.out.println("Tạo hình mới: " + key);
        }

        return shapeMap.get(key);  // Trả về hình đã được tạo hoặc đã tồn tại
    }
}
