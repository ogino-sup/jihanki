package 自販機演習課題;

import java.util.HashMap;
import java.util.Map;

public class Items {
	private Map<String, Integer> items; // 商品リスト
	private Map<String, Integer> availablePurchases; // 購入可能商品

	 // コンストラクタ（商品リストの初期化）
    Items() {
        this.items = new HashMap<String, Integer>();
        items.put("水", 100);
        items.put("コーヒー", 150);
        items.put("サイダー",200);
    }

    // 最低購入金額の取得
    int minPrice() {
        int minPrice = 0;
        int loopCount = 0;
        for (String itemKey : items.keySet()) {
            minPrice = validMinPrice(loopCount, minPrice, itemPrice(itemKey));
            loopCount++;
        }
        return minPrice;
    }

    // 最低購入金額の判定
    int validMinPrice(int loopCount, int minPrice, int price) {
        if (loopCount == 0 || minPrice > price) {
            minPrice = price;
        }
        return minPrice;
    }

    // 商品金額
    private int itemPrice(String itemKey) {
        return items.get(itemKey);
    }

    // 購入可能商品金額
    private int availablePurchasePrice(String itemKey) {
        return availablePurchases.get(itemKey);
    }

    // 購入可能商品リストの取得
    void createAvailablePurchases(int deposit) {
        availablePurchases = new HashMap<String, Integer>();
        for (String itemKey : items.keySet()) {
            addAvailablePurchase(deposit, itemKey);
        }
    }

    // 購入可能商品リストの追加
    private void addAvailablePurchase(int deposit, String itemKey) {
        if (deposit >= items.get(itemKey)) {
            availablePurchases.put(itemKey, items.get(itemKey));
        }
    }

    // 購入可能商品の表示
    void showAvailablePurchase() {
        for (String itemKey : availablePurchases.keySet()) {
            System.out.println(itemKey + ":" + items.get(itemKey) + "円");
        }
    }

    // 購入可能商品であるかの判定
    boolean isAvailablePurchase(String itemName, Deposit deposit) {
        return availablePurchases.containsKey(itemName);
    }

    // 販売価格
    int saleAmount(String itemName) {
        return availablePurchasePrice(itemName);
    }
}

