package ���̋@���K�ۑ�;

import java.util.Scanner; 

public class sub { 
    private static int change; 

    public static void main(String[] args) { 
        Machine machine1 = new Machine(1,"��",100); 
        Machine machine2 = new Machine(2,"�R�[�q�[",150); 
        Machine machine3 = new Machine(3,"�T�C�_�[",200); 
         
         
        machine1.machine(); 
        machine2.machine(); 
        machine3.machine(); 
         
        System.out.println("���i���ԍ���I�����Ă�������"); 
         
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
            System.out.println("1-3�̐�������͂��ĉ�����");
            return;
        }
        selected.machine();
        System.out.println("���������Ă�������"); 
        int money = scan.nextInt(); 
        int rest = selected.change(money);
        if(rest >= 0)
            System.out.println("���ނ��" + rest + "�~�ł�");
        else
            System.out.println("����������܂���");
        
    } 
}