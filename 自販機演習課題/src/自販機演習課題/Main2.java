package 自販機演習課題;

import java.io.*;
import java.util.*;

public class Main2 {
	
	
	public static void main(String[] args) {
		//商品名
		ArrayList <String> name = new ArrayList<>();
		name.add("水");
		name.add("コーヒー");
		//価格
		ArrayList<String>price = new ArrayList<>();
		price.add("100");
		price.add("200");
		
		int first =0;
		// TODO 自動生成されたメソッド・スタブ
		boolean check = true;
		while(check) {
		System.out.println("・機能選択");
		System.out.println("‐‐‐‐‐");
		System.out.println("1:金額入力");
		System.out.println("2:商品選択");
		System.out.println("9:戻る");
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
				check = true;
				break;
				 // 購入最低金額の場合、追加入金
		        int deposit = 0;
		        int minSaleAmount = -1;
		        Scanner scanner = new Scanner(System.in);
		        do {
		            // 入金処理
		            System.out.println("お金を入れて下さい。");
		            deposit = deposit + scanner.nextInt();

		            // 金額チェック（最低購入金額）
		            int loopCount = 0;
		            for (String itemKey: items.keySet()) {
		                if(loopCount == 0 || minSaleAmount > items.get(itemKey)) {
		                    minSaleAmount = items.get(itemKey);
		                }
		                loopCount++;
		            }
		        } while(deposit < minSaleAmount);
			case 2 :
				//商品表示
				System.out.println("・商品選択");
				System.out.println("‐‐‐‐‐");
				for (int i=0; i<name.size(); i++) {
					System.out.println("|"+(i+1)+"|"+name.get(i));
						}
				System.out.println("‐‐‐‐‐");
				System.out.println("商品を選択してください");
				check = true;
				break;
			}
		}
		
		
		
		
	}

}
