class Employee extends Handler {
    @Override
    public void process(double amount) {
        if (amount <= 500) {
            System.out.println("Employee approved the request for $" + amount);
        } else if (nextHandler != null) {
            nextHandler.process(amount);
        }
    }
}