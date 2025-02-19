public class VendingMachineTest {
    public static void main(String []args){

        VendingMachine machine = new VendingMachine(5);

        System.out.println();
        machine.insertCoin(50); 
        machine.selectItem();
        System.out.println();
        machine.insertCoin(30); 
        machine.insertCoin(20); 
        machine.insertCoin(50); 
        System.out.println();
        machine.selectItem();
        machine.setOutOfOrder(); 
        System.out.println();
        machine.insertCoin(50); 
        machine.setOutOfOrder();
        machine.selectItem(); 
        System.out.println();
    }
}
