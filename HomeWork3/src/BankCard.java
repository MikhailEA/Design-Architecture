
public class BankCard {
    private final String id;
    private final double amount;

    public BankCard(String id, double i) {
        this.id = id;
        this.amount = i;
    }

    public String getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }
}
