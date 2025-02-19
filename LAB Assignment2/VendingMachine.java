public class VendingMachine {
    private VendingMachineState state;
    private int inventory;
    private int balance;
    private final int itemPrice = 50;

    public VendingMachine(int inventory) {
        this.inventory = inventory;
        this.balance = 0;
        this.state = new IdleState();
    }
    public void setState(VendingMachineState state) {
        this.state = state;
    }
    public VendingMachineState getState() {
        return state;
    }
    public int getItemPrice() {
        return itemPrice;
    }
    public void addBalance(int amount) {
        balance += amount;
    }
    public int getBalance() {
        return balance;
    }
    public void resetBalance() {
        balance = 0;
    }
    public void reduceInventory() {
        if (inventory > 0) inventory--;
    }
    public void selectItem() {
        state.selectItem(this);
    }
    public void insertCoin(int amount) {
        state.insertCoin(this, amount);
    }
    public void dispenseItem() {
        state.dispenseItem(this);
    }
    public void setOutOfOrder() {
        state.setOutOfOrder(this);
    }
}
