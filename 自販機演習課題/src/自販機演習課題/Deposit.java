package ���̋@���K�ۑ�;

public class Deposit {
	private int deposit; // �����z

    // �R���X�g���N�^�i�����l0�~�j
    Deposit() {
        deposit = 0;
    }

    // ����
    void deposit(int amount) {
        deposit = deposit + amount;
    }

    // ���ݓ����z
    int amount() {
        return this.deposit;
    }

    // �ۋ�
    void charge(int amount) {
        int charge = this.deposit - amount;
        this.deposit = charge;
    }
}
