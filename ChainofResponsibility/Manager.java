class Manager extends Handler {
    @Override
    public void process(double amount) {
        if (amount <= 5000) {
            System.out.println("Manager approved the request for $" + amount);
        } else if (nextHandler != null) {
            nextHandler.process(amount);
        }
    }
}