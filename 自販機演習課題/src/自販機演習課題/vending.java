package 自販機演習課題;

//自動販売機(Vending)クラス

public class vending {
	
		//自動販売機(Vending)が扱う属性
		String goods; //商品
		int price;    //価格
		int payment;  //支払い
		
		//初期設定機能(コンストラクタ)
		vending(String g, int p ) {
			goods = g;   //属性goodsにgの値を設定
			price = p;   //属性priceにpの値を設定
			System.out.println("Vending was constructed !");
			System.out.println("Goods:"+ goods);
			System.out.println("Price:"+ price + "yen");
		}

		//支払い設定機能
	public void setPayment(int p) {
			payment = p;
			System.out.println(payment +"yen was received.");
		}
		
		//商品取得機能
	public String getgoods() {
			return goods;
		}
		
		//おつり取得機能
	public int getChange() {
			return payment - price;
		}
}
