package 自販機演習課題;

public class VendingMachine {

	private Items items; // 商品
    private Deposit deposit; // 入金額

    // コンストラクタ
    VendingMachine() {
        items = new Items();
        deposit = new Deposit();
    }

    // 入金
    void deposit1(int amount) {
        deposit.deposit(amount);
    }

    // 最低価格商品以上の入金があるか判定
    boolean hasMinDeposit() {
        if (deposit.amount() < items.minPrice()) {
            return false;
        }
        return true;
    }

    // 購入可能商品を表示
    void showAvailablePurchases() {
        items.createAvailablePurchases(deposit.amount());
        items.showAvailablePurchase();
    }

    // 購入可能商品であるか判定
    boolean isAvailablePurchases(String itemName) {
        return items.isAvailablePurchase(itemName, deposit);
    }

    // 購入商品を表示
    void selectItem(String itemName) {
        System.out.println(itemName + "です！");
    }

    // 課金
    void charge(String itemName) {
        int saleAmount = items.saleAmount(itemName);
        deposit.charge(saleAmount);
        System.out.println("おつりは、" + deposit.amount() + "円です。");
    }

	

}
