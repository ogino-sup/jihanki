package ���̋@���K�ۑ�;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

;public class main1 {
	public static void main(String[] args) {
        // ���i�̏�����
        LinkedHashMap<String, Integer> items = new LinkedHashMap<String, Integer>();
        items.put("1|��|",100);
        items.put("2|�R�[�q�[|", 150);
        items.put("3|�T�C�_�[|", 200);
        
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

        // ���i�I��
        System.out.println("�E���i�I��");
        //System.out.println("1|��|100�~");
        System.out.println("���i��I�����Ă��������B");
        Map<String, Integer> availablePurchases = new HashMap<String, Integer>();
        for (String itemKey: items.keySet()) {
            if(deposit >= items.get(itemKey)) {
            System.out.println(itemKey + ":" + items.get(itemKey) + "�~");
            availablePurchases.put(itemKey, items.get(itemKey));
            }
        }

        // �̔�
        String itemName;
        while(true) {
            itemName = scanner.next();
            if (availablePurchases.containsKey(itemName)){
                break;
            }
            System.out.println("���i���̎w�肪����Ă��܂��B���i�����w�肵�����Ă��������B");
        }
        scanner.close();
        System.out.println(itemName + "�ł��I");

        // �ۋ��@�\
        deposit = deposit - availablePurchases.get(itemName).intValue();
        System.out.println("����́A" + deposit + "�~�ł��B");

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
	
	if(onum==1) { 
	//	product.DisplayDetail();
	}
	}catch(IOException e1) {
	
	}catch(NumberFormatException e2) {
		System.out.println("�����œ��͂��Ă�������");
	}
	
	}while(onum == 2 || onum == 3);

//�R�����g�\��
if(onum == 2) {
	//product.DisplayComment();}
}
	


    

	}
}
