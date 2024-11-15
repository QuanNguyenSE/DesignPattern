public class Client {
    public static void main(String[] args) {
        Handler employee = new Employee();
        Handler manager = new Manager();
        Handler director = new Director();

        employee.setNextHandler(manager);
        manager.setNextHandler(director);

        double amount = 450;
        System.out.println("Requesting approval for $" + amount);
        employee.process(amount);

        amount = 2000;
        System.out.println("\nRequesting approval for $" + amount);
        employee.process(amount);

        amount = 10000;
        System.out.println("\nRequesting approval for $" + amount);
        employee.process(amount);

        amount = 25000;
        System.out.println("\nRequesting approval for $" + amount);
        employee.process(amount);
    }
}
