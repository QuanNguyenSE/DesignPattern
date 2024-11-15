class Director extends Handler {
    @Override
    public void process(double amount) {
        if (amount <= 20000) {
            System.out.println("Director approved the request for $" + amount);
        } else {
            System.out.println("Request for $" + amount + " cannot be approved.");
        }
    }
}