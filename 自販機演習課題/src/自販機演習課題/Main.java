package ���̋@���K�ۑ�;

import java.util.Scanner;

public class Main {
	// ���C�����W�b�N
    public static void main(String[] args) {
        // �@���i�̏�����
        VendingMachine vendingMachine = new VendingMachine();

        // �w���Œ���z�̏ꍇ�A�ǉ�����
        Scanner scanner = new Scanner(System.in);
        do {
            // �A����
            System.out.println("���������ĉ������B");
            int amount = scanner.nextInt();
            vendingMachine.deposit1(amount);

            // �B���z�`�F�b�N�i�Œ�w�����z�j
        } while (!vendingMachine.hasMinDeposit());

        // �C�w���\���i��\��
        System.out.println("");
        System.out.println("�w���\�ȏ��i�ł��B");
        vendingMachine.showAvailablePurchases();

        // �D���i��I��
        String itemName;
        do {
            System.out.println("");
            System.out.println("���i������͂��ĉ������B");
            itemName = scanner.next();
        } while (!vendingMachine.isAvailablePurchases(itemName));
        vendingMachine.selectItem(itemName);
        scanner.close();

        // �E�ۋ��@�\
        vendingMachine.charge(itemName);
    }
}
