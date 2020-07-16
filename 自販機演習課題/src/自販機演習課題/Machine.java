package 自販機演習課題;

public class Machine {private int num;
private String drink;
private int price;
private int money;
private String detail = "感動水";
private String comment = "感動する味わい";
private String name;
Machine(int num,String drink,int price){

this.num = num;
this.drink = drink;
this.price = price;

}

public void machine() {
    System.out.println("商品番号:" + num );
    System.out.println("商品名:" + drink );
    System.out.println("値段:" + price +"円");
}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}
	
	public Machine(String name) {
		this.name = name;
	}
	
//Override
public String getname() {
    return name;
	}

//Override
public int getprice() {
    return price;
	}

//Override
public int change(int money){
    return money - price;
	}

//Override
public String getdetail() {
	return detail;
	}
//Override
public String getcomment() {
	return comment;
	}
}
