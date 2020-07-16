package 自販機演習課題;

import java.util.Scanner; 

public class sub { 
    private static int change; 

    public static void main(String[] args) { 
        Machine machine1 = new Machine(1,"水",100); 
        Machine machine2 = new Machine(2,"コーヒー",150); 
        Machine machine3 = new Machine(3,"サイダー",200); 
         
         
        machine1.machine(); 
        machine2.machine(); 
        machine3.machine(); 
         
        System.out.println("商品名番号を選択してください"); 
         
        Scanner scan = new Scanner(System.in); 
        int number = scan.nextInt(); 
        Machine selected = null;
        switch(number){
            case 1:
                selected = machine1;
                break;
            case 2:
                selected = machine2;
                break;
            case 3:
                selected = machine3;
                break;
        } 
        if(selected == null){
            System.out.println("1-3の数字を入力して下さい");
            return;
        }
        selected.machine();
        System.out.println("お金を入れてください"); 
        int money = scan.nextInt(); 
        int rest = selected.change(money);
        if(rest >= 0)
            System.out.println("お釣りは" + rest + "円です");
        else
            System.out.println("お金が足りません");
        
    } 
}