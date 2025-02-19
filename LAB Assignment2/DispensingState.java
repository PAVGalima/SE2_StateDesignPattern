public class DispensingState  implements VendingMachineState{
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Dispensing in progress. Please wait.");
    }
    @Override
    public void insertCoin(VendingMachine machine, int amount) {
        System.out.println("Cannot insert coin. Dispensing in progress.");
    }
    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Item dispensed. Returning to idle state.");
        machine.reduceInventory();
        machine.resetBalance();
        machine.setState(new IdleState());
    }
    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Vending machine is now out of order.");
        machine.setState(new OutOfOrderState());
    }


}
