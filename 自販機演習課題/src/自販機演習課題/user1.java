package 自販機演習課題;

public class user1 {
	
	public static void main(String[] args) {
		for (int i=0; i < 100; i++) {
		System.out.println("金額が不足しています");
		}
		
		
		
		// Vending(自販機)オブジェクトを作成
		vending drink =new vending("Water", 100);
		
		//setPayment(支払い設定機能)を使う
		drink.setPayment(200);
		
		//getgoods(商品取得機能)を使い結果を出力
		System.out.println("You bought a "+ drink.getgoods() +"_");
		
		//getchange(おつり取得機能)を使い結果を出力
		System.out.println("change"+ drink.getChange()+"yen");
	}

}
