package ���̋@���K�ۑ�;

import java.util.ArrayList;
import java.util.List;

public class ListProduct {
	
	//���i��
	//���i
	//�݌ɐ�
	
	public List listproduct main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
		//���i��
		ArrayList<String>product = new ArrayList<>();
			product.add("��");
			product.add("�R�[�q�[");
			
		//���i
		ArrayList<String>price = new ArrayList<>();
			price.add("100");
			price.add("200");
			
		//���i�\��
		for (int i=0; i<product.size(); i++) {
			System.out.println("|"+(i+1)+"|"+product.get(i));
		}
		
		return product; 
	}

	public List<Items> getItemList() {
		List<Items> list = new ArrayList<Items>();
		
		list.add(new Item("��", 100, "�������̂���"));
		list.add(new Item("�R�[�q�[", 200, "�[�݂̂���"));
		
		return list;
	}
}
