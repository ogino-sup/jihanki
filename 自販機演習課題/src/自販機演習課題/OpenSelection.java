package ���̋@���K�ۑ�;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OpenSelection {

	public void main(String detail, String word) {
		
		//���i�J���I����ʂ̕\��
				System.out.println("1|�ڍׂ�����");
				System.out.println("2|�J����");
				System.out.println("3|�J���Ȃ�");
				
		//�J���I����͎�t�ƌ���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		Integer onum = null;

		do {
			System.out.print("�ǂ����܂����H:");
			try {
			input = br .readLine();
			onum=Integer.valueOf(input);
			
			if(onum==1) {System.out.println("detail");
			//	product.DisplayDetail();
			}
			}catch(IOException e1) {
			
			}catch(NumberFormatException e2) {
				System.out.println("�����œ��͂��Ă�������");
			}
			
			}while(onum == 2 || onum == 3);

		//�R�����g�\��
		if(onum == 2) {System.out.println("word");
			//product.DisplayComment();}
		}
	}

}
