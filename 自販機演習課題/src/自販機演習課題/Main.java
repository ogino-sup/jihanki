package 自販機演習課題;

import java.util.Scanner;

public class Main {
	// メインロジック
    public static void main(String[] args) {
        // �@商品の初期化
        VendingMachine vendingMachine = new VendingMachine();

        // 購入最低金額の場合、追加入金
        Scanner scanner = new Scanner(System.in);
        do {
            // �A入金
            System.out.println("お金を入れて下さい。");
            int amount = scanner.nextInt();
            vendingMachine.deposit1(amount);

            // �B金額チェック（最低購入金額）
        } while (!vendingMachine.hasMinDeposit());

        // �C購入可能商品を表示
        System.out.println("");
        System.out.println("購入可能な商品です。");
        vendingMachine.showAvailablePurchases();

        // �D商品を選択
        String itemName;
        do {
            System.out.println("");
            System.out.println("商品名を入力して下さい。");
            itemName = scanner.next();
        } while (!vendingMachine.isAvailablePurchases(itemName));
        vendingMachine.selectItem(itemName);
        scanner.close();

        // �E課金機能(おつりを返す)
        vendingMachine.charge(itemName);
    }
}
