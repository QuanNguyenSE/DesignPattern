public class Laptop {
    private String cpu;
    private String ram;
    private String storage;
    private String gpu;

    // Constructor chỉ cho phép tạo đối tượng thông qua Builder
    private Laptop(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.gpu = builder.gpu;
    }

    @Override
    public String toString() {
        return "Laptop [CPU=" + cpu + ", RAM=" + ram + ", Storage=" + storage + ", GPU=" + gpu + "]";
    }

    // Builder (Nested static class)
    public static class Builder {
        private String cpu;
        private String ram;
        private String storage;
        private String gpu;

        // Các phương thức để đặt giá trị thuộc tính
        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this; // Trả về chính Builder để gọi nối tiếp
        }

        public Builder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        // Phương thức để tạo Laptop
        public Laptop build() {
            return new Laptop(this);
        }
    }
}
