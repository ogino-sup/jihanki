package ���̋@���K�ۑ�;

import java.io.*;
import java.util.*;

public class Main2 {
	
	int number =0;
	public static void main(String[] args) {
		Main2 jihanki = new Main2();
		jihanki.main();
		
	}
	private void main() {
		//���i��
		ArrayList <String> name = new ArrayList<>();
		name.add("��");
		name.add("�R�[�q�[");
		//���i
		ArrayList<Integer>price = new ArrayList<>();
		price.add(100);
		price.add(200);
		//�ڍו\��
		ArrayList <String> detail = new ArrayList<>();
		detail.add("�w��n�̌b�݂�̂Ɂx");
		detail.add("�w����₩�Ńt���[�e�B�[�Ȗ��킢�x");
		
		int first =0;
		int second =0;
		//true�Ȍ��胋�[�v
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
//				check = true;
//				break;
				 // �w���Œ���z�̏ꍇ�A�ǉ�����
		        int deposit = 0;
		        int minSaleAmount = price.get(0);
		        Scanner scanner = new Scanner(System.in);
		        do {
		            // ��������
		            System.out.println("���������ĉ������B");
		            deposit = deposit + scanner.nextInt();

		            // ���z�`�F�b�N�i�Œ�w�����z�j
//		            int loopCount = 0;
//		            for (Integer itemKey: price) {
//		                if(loopCount == 0 || minSaleAmount > itemKey) {
//		                    minSaleAmount = itemKey;
//		                }
//		                loopCount++;
//		            }
		        } while(deposit < minSaleAmount);
		        for (int i=0; i<name.size(); i++) {
					System.out.println("|"+(i+1)+"|"+name.get(i)+"|"+price.get(i)+"�~|");
						}
		        System.out.println("���i�ԍ��������Ă�������");
		        Scanner scan = new Scanner(System.in); 
		        this.number = scan.nextInt(); 
		        switch (number) {
		        case 1 :
		        	System.out.println("���ł�"); 	
		        	break;
		        case 2 :
		        	System.out.println("�R�[�q�[�ł�");
		        	break;
		        }
		        check = true;
				break;
			case 2 :
				boolean kakunin = true;
				while(kakunin) {
				//���i�\��
				System.out.println("�E���i�I��");
				System.out.println("�]�]�]�]�]");
				for (int i=0; i<name.size(); i++) {
					System.out.println("|"+(i+1)+"|"+name.get(i)+"|"+price.get(i)+"�~|");
						}
				System.out.println("�]�]�]�]�]");
	//			System.out.println("���i��I�����Ă�������");
				 System.out.println("���i�ԍ��������Ă�������"); 
		         
			        Scanner sc = new Scanner(System.in); 
			        this.number = sc.nextInt(); 
			        
			        switch(number){
			            case 1:
			            	int nyukina =0;
			            	Scanner scannera = new Scanner(System.in);
			            	
			            	 do {
			                     // ��������
			                     System.out.println("���������ĉ������B");
			                    nyukina = nyukina + scannera.nextInt();

			                     
			                 } while(nyukina < 100);
			            	 kakunin =false;
			                break;
			            case 2:
			            	int nyukinb =0;
			            	Scanner scannerb = new Scanner(System.in);
			            	
			            	 do {
			                     // ��������
			                     System.out.println("���������ĉ������B");
			                    nyukinb = nyukinb + scannerb.nextInt();

			                     
			                 } while(nyukinb < 200);
			            	 kakunin =false;
			            	 break;    
			        
			        	default: 		        	
			           System.out.println("1~2�̐�������͂��ĉ�����");
			           kakunin =true;
			           break;
			        }
			        
				}
				
				//���i�J��
				System.out.println("�E���i�J��");
				System.out.println("�]�]�]�]�]");
				System.out.println(name.get(number-1));
				System.out.println("|1|���i�̏ڍׂ�\��|");
				System.out.println("|2|�J������|");
				System.out.println("|3|�J�����Ȃ�|");
				System.out.println("�]�]�]�]�]");
				BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
				try {
				String a =br1.readLine();
				 second = Integer.valueOf(a);
				}catch(IOException e) {
					e.printStackTrace();
				}
				
				switch(second) {
					case 1:
					System.out.println(detail.get(number-1));	
					break;
					
					case 2:
					System.out.println("�w�v�V���[�x");
					break;
					
					case 3:
					System.out.println("�w�J����̂���߂܂��x");
				}
			       check = true;
			       break;
			        
			}
		}
	}
		
}


