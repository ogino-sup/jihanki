package 自販機演習課題;

import java.util.ArrayList;
import java.util.List;

public class ListProduct {
	
	//商品名
	//価格
	//在庫数
	
	public List listproduct main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//商品名
		ArrayList<String>product = new ArrayList<>();
			product.add("水");
			product.add("コーヒー");
			
		//価格
		ArrayList<String>price = new ArrayList<>();
			price.add("100");
			price.add("200");
			
		//商品表示
		for (int i=0; i<product.size(); i++) {
			System.out.println("|"+(i+1)+"|"+product.get(i));
		}
		
		return product; 
	}

	public List<Items> getItemList() {
		List<Items> list = new ArrayList<Items>();
		
		list.add(new Item("水", 100, "透明感のある"));
		list.add(new Item("コーヒー", 200, "深みのある"));
		
		return list;
	}
}
