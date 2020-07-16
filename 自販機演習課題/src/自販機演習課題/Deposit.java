package 自販機演習課題;

public class Deposit {
	private int deposit; // 入金額

    // コンストラクタ（初期値0円）
    Deposit() {
        deposit = 0;
    }

    // 入金
    void deposit(int amount) {
        deposit = deposit + amount;
    }

    // 現在入金額
    int amount() {
        return this.deposit;
    }

    // 課金
    void charge(int amount) {
        int charge = this.deposit - amount;
        this.deposit = charge;
    }
}
