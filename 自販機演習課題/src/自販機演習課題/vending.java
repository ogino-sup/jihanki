package ���̋@���K�ۑ�;

//�����̔��@(Vending)�N���X

public class vending {
	
		//�����̔��@(Vending)����������
		String goods; //���i
		int price;    //���i
		int payment;  //�x����
		
		//�����ݒ�@�\(�R���X�g���N�^)
		vending(String g, int p ) {
			goods = g;   //����goods��g�̒l��ݒ�
			price = p;   //����price��p�̒l��ݒ�
			System.out.println("Vending was constructed !");
			System.out.println("Goods:"+ goods);
			System.out.println("Price:"+ price + "yen");
		}

		//�x�����ݒ�@�\
	public void setPayment(int p) {
			payment = p;
			System.out.println(payment +"yen was received.");
		}
		
		//���i�擾�@�\
	public String getgoods() {
			return goods;
		}
		
		//����擾�@�\
	public int getChange() {
			return payment - price;
		}
}
