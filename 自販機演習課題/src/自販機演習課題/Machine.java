package ���̋@���K�ۑ�;

public class Machine {private int num;
private String drink;
private int price;
private int money;
private String detail = "������";
private String comment = "�������閡�킢";
private String name;
Machine(int num,String drink,int price){

this.num = num;
this.drink = drink;
this.price = price;

}

public void machine() {
    System.out.println("���i�ԍ�:" + num );
    System.out.println("���i��:" + drink );
    System.out.println("�l�i:" + price +"�~");
}
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u

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
