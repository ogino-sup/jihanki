package ���̋@���K�ۑ�;

import java.io.*;
import java.util.*;

public class Main2 {
	
	
	public static void main(String[] args) {
		//���i��
		ArrayList <String> name = new ArrayList<>();
		name.add("��");
		name.add("�R�[�q�[");
		//���i
		ArrayList<String>price = new ArrayList<>();
		price.add("100");
		price.add("200");
		
		int first =0;
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		boolean check = true;
		while(check) {
		System.out.println("�E�@�\�I��");
		System.out.println("�]�]�]�]�]");
		System.out.println("1:���z����");
		System.out.println("2:���i�I��");
		System.out.println("9:�߂�");
		System.out.println("�]�]�]�]�]");
		
		System.out.println("�ԍ���I�����Ă�������");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
		String a =br.readLine();
		 first = Integer.valueOf(a);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
			switch (first) {
			case 9:
				check = false;
				break;
				
			case 1 :
				check = true;
				break;
				 // �w���Œ���z�̏ꍇ�A�ǉ�����
		        int deposit = 0;
		        int minSaleAmount = -1;
		        Scanner scanner = new Scanner(System.in);
		        do {
		            // ��������
		            System.out.println("���������ĉ������B");
		            deposit = deposit + scanner.nextInt();

		            // ���z�`�F�b�N�i�Œ�w�����z�j
		            int loopCount = 0;
		            for (String itemKey: items.keySet()) {
		                if(loopCount == 0 || minSaleAmount > items.get(itemKey)) {
		                    minSaleAmount = items.get(itemKey);
		                }
		                loopCount++;
		            }
		        } while(deposit < minSaleAmount);
			case 2 :
				//���i�\��
				System.out.println("�E���i�I��");
				System.out.println("�]�]�]�]�]");
				for (int i=0; i<name.size(); i++) {
					System.out.println("|"+(i+1)+"|"+name.get(i));
						}
				System.out.println("�]�]�]�]�]");
				System.out.println("���i��I�����Ă�������");
				check = true;
				break;
			}
		}
		
		
		
		
	}

}
