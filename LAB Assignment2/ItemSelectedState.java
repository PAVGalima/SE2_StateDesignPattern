public class ItemSelectedState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Item already selected. Insert coins to proceed.");
    }
    @Override
    public void insertCoin(VendingMachine machine, int amount) {
        machine.addBalance(amount);
        System.out.println("Coin inserted: " + amount);
        if (machine.getBalance() >= machine.getItemPrice()) {
            System.out.println("Sufficient balance. Dispensing item...");
            machine.setState(new DispensingState());
            machine.getState().dispenseItem(machine);
        }
    }
    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Insert enough coins to dispense the item.");
    }
    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Vending machine is now out of order.");
        machine.setState(new OutOfOrderState());
    }
}
