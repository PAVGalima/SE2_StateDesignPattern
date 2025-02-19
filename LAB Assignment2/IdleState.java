public class IdleState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Item selected.");
        machine.setState(new ItemSelectedState());
    }
    @Override
    public void insertCoin(VendingMachine machine, int amount) {
        System.out.println("Cannot insert coin. Select an item first.");
    }
    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("No item selected.");
    }
    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Vending machine is now out of order.");
        machine.setState(new OutOfOrderState());
    }


}
