package 自販機演習課題;

import java.io.*;
import java.util.*;

public class Main2 {
	
	int number =0;
	public static void main(String[] args) {
		Main2 jihanki = new Main2();
		jihanki.main();
		
	}
	private void main() {
		//商品名
		ArrayList <String> name = new ArrayList<>();
		name.add("水");
		name.add("コーヒー");
		//価格
		ArrayList<Integer>price = new ArrayList<>();
		price.add(100);
		price.add(200);
		//詳細表示
		ArrayList <String> detail = new ArrayList<>();
		detail.add("『大地の恵みを体に』");
		detail.add("『さわやかでフルーティーな味わい』");
		
		int deposit = 0;
		int first =0;
		int second =0;
		//trueな限りループ
		boolean check = true;
		while(check) {
		System.out.println("・機能選択");
		System.out.println("‐‐‐‐‐");
		System.out.println("1:金額入力");
		System.out.println("2:商品選択");
		System.out.println("9:終了する");
		System.out.println("‐‐‐‐‐");
		System.out.println("番号を選択してください");
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
				 // 購入最低金額の場合、追加入金
		       // int deposit = 0;
		        int minSaleAmount = price.get(0);
		        Scanner scanner = new Scanner(System.in);
		        do {
		            // 入金処理
		            System.out.println("お金を入れて下さい。");
		            deposit = deposit + scanner.nextInt();

		            // 金額チェック（最低購入金額）
//		            int loopCount = 0;
//		            for (Integer itemKey: price) {
//		                if(loopCount == 0 || minSaleAmount > itemKey) {
//		                    minSaleAmount = itemKey;
//		                }
//		                loopCount++;
//		            }
		        } while(deposit < minSaleAmount);
		        if (100<= deposit && deposit <200) { 
		        	System.out.println("|1|水|100円|");
		        	System.out.println("商品番号を押してください");
		        	 Scanner scan = new Scanner(System.in); 
				        this.number = scan.nextInt(); 
		        	switch (number) {
		        	//水が選択されたとき
		        	case 1 :
		        		System.out.println("水です"); 
		        		// おつり
			        	int i = 0;
			            deposit = deposit - price.get(i);
			            System.out.println("おつりは、" + deposit + "円です。");
			        	break;
			        
			        default :
			        	System.out.println("正しい数字を入力して下さい");
						break;
		        	}
		        	
		        }
		        
		        if(200<=deposit) {
		        	for (int i=0; i<name.size(); i++) {
					System.out.println("|"+(i+1)+"|"+name.get(i)+"|"+price.get(i)+"円|");
						}
		        	System.out.println("商品番号を押してください");
			        Scanner scan = new Scanner(System.in); 
			        this.number = scan.nextInt(); 
			        switch (number) {
			        case 1 :
			        	System.out.println("水です"); 	
			        	// おつり
			        	int i = 0;
			            deposit = deposit - price.get(i);
			            System.out.println("おつりは、" + deposit + "円です。");
			        	break;
			        case 2 :
			        	System.out.println("コーヒーです");
			        	// おつり
			        	int i1 = 1;
			            deposit = deposit - price.get(i1);
			            System.out.println("おつりは、" + deposit + "円です。");
			        	break;
			        
			        default: 		        	
			            System.out.println("1~2の数字を入力して下さい");
			        
			            break;
			        }
		        }
		      //商品開封
				System.out.println("・商品開封");
				System.out.println("‐‐‐‐‐");
				System.out.println(name.get(number-1));
				System.out.println("|1|商品の詳細を表示|");
				System.out.println("|2|開封する|");
				System.out.println("|3|開封しない|");
				System.out.println("‐‐‐‐‐");
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
					System.out.println("『プシュー』");
					break;
					
					case 3:
					System.out.println("『開けるのをやめます』");
				}
			       check = true;
			       
		    break;
		        
			case 2 :
				boolean kakunin = true;
				while(kakunin) {
				//商品表示
				System.out.println("・商品選択");
				System.out.println("‐‐‐‐‐");
				for (int i=0; i<name.size(); i++) {
					System.out.println("|"+(i+1)+"|"+name.get(i)+"|"+price.get(i)+"円|");
						}
				System.out.println("‐‐‐‐‐");
	//			System.out.println("商品を選択してください");
				 System.out.println("商品番号を押してください"); 
		         
			        Scanner sc = new Scanner(System.in); 
			        this.number = sc.nextInt(); 
			        
			        switch(number){
			            case 1:
			            	Scanner scannera = new Scanner(System.in);
			            	
			            	 do {
			                     // 入金処理
			                     System.out.println("お金を入れて下さい。");
			                    deposit = deposit + scannera.nextInt();
			                 
			                 } while(deposit < 100);
			            	// おつり
					            deposit = deposit - price.get(0);
					            System.out.println("おつりは、" + deposit + "円です。");
			                     
			            	 kakunin =false;
			                break;
			            case 2:			            
			            	Scanner scannerb = new Scanner(System.in);
			            	
			            	 do {
			                     // 入金処理
			                     System.out.println("お金を入れて下さい。");
			                    deposit = deposit + scannerb.nextInt();			                 			                     
			                 } while(deposit < 200);
			            	// おつり					        	
					            deposit = deposit - price.get(1);
					            System.out.println("おつりは、" + deposit + "円です。");
			                     
			            	 kakunin =false;
			            	 break;    
			        
			        	default: 		        	
			           System.out.println("1~2の数字を入力して下さい");
			           kakunin =true;
			           break;
			        }
			        
				}
				
				//商品開封
				System.out.println("・商品開封");
				System.out.println("‐‐‐‐‐");
				System.out.println(name.get(number-1));
				System.out.println("|1|商品の詳細を表示|");
				System.out.println("|2|開封する|");
				System.out.println("|3|開封しない|");
				System.out.println("‐‐‐‐‐");
				BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
				try {
				String a =br2.readLine();
				 second = Integer.valueOf(a);
				}catch(IOException e) {
					e.printStackTrace();
				}
				
				switch(second) {
					case 1:
					System.out.println(detail.get(number-1));	
					break;
					
					case 2:
					System.out.println("『プシュー』");
					break;
					
					case 3:
					System.out.println("『開けるのをやめます』");
				}
			       check = true;
			       break;
			        
			}
		}
	}
		
}


