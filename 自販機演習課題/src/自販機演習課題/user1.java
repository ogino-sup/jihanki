package ���̋@���K�ۑ�;

public class user1 {
	
	public static void main(String[] args) {
		for (int i=0; i < 100; i++) {
		System.out.println("���z���s�����Ă��܂�");
		}
		
		
		
		// Vending(���̋@)�I�u�W�F�N�g���쐬
		vending drink =new vending("Water", 100);
		
		//setPayment(�x�����ݒ�@�\)���g��
		drink.setPayment(200);
		
		//getgoods(���i�擾�@�\)���g�����ʂ��o��
		System.out.println("You bought a "+ drink.getgoods() +"_");
		
		//getchange(����擾�@�\)���g�����ʂ��o��
		System.out.println("change"+ drink.getChange()+"yen");
	}

}
