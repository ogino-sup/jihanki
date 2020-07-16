package ���̋@���K�ۑ�;

import java.util.HashMap;
import java.util.Map;

public class Items {
	private Map<String, Integer> items; // ���i���X�g
	private Map<String, Integer> availablePurchases; // �w���\���i

	 // �R���X�g���N�^�i���i���X�g�̏������j
    Items() {
        this.items = new HashMap<String, Integer>();
        items.put("��", 100);
        items.put("�R�[�q�[", 150);
        items.put("�T�C�_�[",200);
    }

    // �Œ�w�����z�̎擾
    int minPrice() {
        int minPrice = 0;
        int loopCount = 0;
        for (String itemKey : items.keySet()) {
            minPrice = validMinPrice(loopCount, minPrice, itemPrice(itemKey));
            loopCount++;
        }
        return minPrice;
    }

    // �Œ�w�����z�̔���
    int validMinPrice(int loopCount, int minPrice, int price) {
        if (loopCount == 0 || minPrice > price) {
            minPrice = price;
        }
        return minPrice;
    }

    // ���i���z
    private int itemPrice(String itemKey) {
        return items.get(itemKey);
    }

    // �w���\���i���z
    private int availablePurchasePrice(String itemKey) {
        return availablePurchases.get(itemKey);
    }

    // �w���\���i���X�g�̎擾
    void createAvailablePurchases(int deposit) {
        availablePurchases = new HashMap<String, Integer>();
        for (String itemKey : items.keySet()) {
            addAvailablePurchase(deposit, itemKey);
        }
    }

    // �w���\���i���X�g�̒ǉ�
    private void addAvailablePurchase(int deposit, String itemKey) {
        if (deposit >= items.get(itemKey)) {
            availablePurchases.put(itemKey, items.get(itemKey));
        }
    }

    // �w���\���i�̕\��
    void showAvailablePurchase() {
        for (String itemKey : availablePurchases.keySet()) {
            System.out.println(itemKey + ":" + items.get(itemKey) + "�~");
        }
    }

    // �w���\���i�ł��邩�̔���
    boolean isAvailablePurchase(String itemName, Deposit deposit) {
        return availablePurchases.containsKey(itemName);
    }

    // �̔����i
    int saleAmount(String itemName) {
        return availablePurchasePrice(itemName);
    }
}

