package ���̋@���K�ۑ�;

public class ManagementDisplay {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
		//���i�̐���
		ProductList productlist = new ProductList();
		
		boolean flg = true;
		while (flg) {
			
			productlist.showlist();
			
			int total = productlist.total();
		
		
		//���i�I����
		ProductSelectPhase psp = new ProductSelectPhase();
		
		int selectnum = psp.Main(total);
		
		Shohin selected = productlist.shohinout(selectnum);
		
		//�s���I����
		ActionSelectPhase asp = new ActionSelectPhase();
		Integer temp = asp.Main();
		switch (temp) {
		case 1:
			//���z���͂�
			AmountInputPhase aip = new AmountInputPhase();
			
			int amount = selected.getprice();
			aip.Main(amount);
			//�J����ʂ�
			OpenSelectPhase osp = new OpenSelectPhase();
			
			String detail = selected.getdetail();
			String comment = selected.getcomment();
			osp.Main(detail,comment);
			break;
		case 2:
			continue;
		case 9:
			flg = false;
			break;
		default:
			;
			break;
		}
		}
	}

}
