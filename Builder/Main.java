public class Main {
    public static void main(String[] args) {
        // Tạo Laptop bằng Builder
        Laptop gamingLaptop = new Laptop.Builder()
            .setCpu("Intel Core i9")
            .setRam("32GB")
            .setStorage("1TB SSD")
            .setGpu("NVIDIA RTX 4090")
            .build();

        Laptop officeLaptop = new Laptop.Builder()
            .setCpu("Intel Core i5")
            .setRam("16GB")
            .setStorage("512GB SSD")
            .build();

        System.out.println(gamingLaptop);
        System.out.println(officeLaptop);
    }
}
