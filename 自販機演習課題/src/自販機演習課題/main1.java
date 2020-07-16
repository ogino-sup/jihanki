package 自販機演習課題;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

;public class main1 {
	public static void main(String[] args) {
        // 商品の初期化
        LinkedHashMap<String, Integer> items = new LinkedHashMap<String, Integer>();
        items.put("1|水|",100);
        items.put("2|コーヒー|", 150);
        items.put("3|サイダー|", 200);
        
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

        // 商品選択
        System.out.println("・商品選択");
        //System.out.println("1|水|100円");
        System.out.println("商品を選択してください。");
        Map<String, Integer> availablePurchases = new HashMap<String, Integer>();
        for (String itemKey: items.keySet()) {
            if(deposit >= items.get(itemKey)) {
            System.out.println(itemKey + ":" + items.get(itemKey) + "円");
            availablePurchases.put(itemKey, items.get(itemKey));
            }
        }

        // 販売
        String itemName;
        while(true) {
            itemName = scanner.next();
            if (availablePurchases.containsKey(itemName)){
                break;
            }
            System.out.println("商品名の指定が誤っています。商品名を指定し直してください。");
        }
        scanner.close();
        System.out.println(itemName + "です！");

        // 課金機能
        deposit = deposit - availablePurchases.get(itemName).intValue();
        System.out.println("おつりは、" + deposit + "円です。");

      //商品開封選択画面の表示
		System.out.println("1|詳細を見る");
		System.out.println("2|開ける");
		System.out.println("3|開けない");
		
//開封選択入力受付と検証
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String input;
Integer onum = null;

do {
	System.out.print("どうしますか？:");
	try {
	input = br .readLine();
	onum=Integer.valueOf(input);
	
	if(onum==1) { 
	//	product.DisplayDetail();
	}
	}catch(IOException e1) {
	
	}catch(NumberFormatException e2) {
		System.out.println("数字で入力してください");
	}
	
	}while(onum == 2 || onum == 3);

//コメント表示
if(onum == 2) {
	//product.DisplayComment();}
}
	


    

	}
}
