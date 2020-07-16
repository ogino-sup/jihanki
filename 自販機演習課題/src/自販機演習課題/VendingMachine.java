package ���̋@���K�ۑ�;

public class VendingMachine {

	private Items items; // ���i
    private Deposit deposit; // �����z

    // �R���X�g���N�^
    VendingMachine() {
        items = new Items();
        deposit = new Deposit();
    }

    // ����
    void deposit1(int amount) {
        deposit.deposit(amount);
    }

    // �Œቿ�i���i�ȏ�̓��������邩����
    boolean hasMinDeposit() {
        if (deposit.amount() < items.minPrice()) {
            return false;
        }
        return true;
    }

    // �w���\���i��\��
    void showAvailablePurchases() {
        items.createAvailablePurchases(deposit.amount());
        items.showAvailablePurchase();
    }

    // �w���\���i�ł��邩����
    boolean isAvailablePurchases(String itemName) {
        return items.isAvailablePurchase(itemName, deposit);
    }

    // �w�����i��\��
    void selectItem(String itemName) {
        System.out.println(itemName + "�ł��I");
    }

    // �ۋ�
    void charge(String itemName) {
        int saleAmount = items.saleAmount(itemName);
        deposit.charge(saleAmount);
        System.out.println("����́A" + deposit.amount() + "�~�ł��B");
    }

	

}
