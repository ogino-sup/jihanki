package ©”Ì‹@‰‰K‰Û‘è;

import java.io.*;
import java.util.*;

public class Main2 {
	
	int number =0;
	public static void main(String[] args) {
		Main2 jihanki = new Main2();
		jihanki.main();
		
	}
	private void main() {
		//¤•i–¼
		ArrayList <String> name = new ArrayList<>();
		name.add("…");
		name.add("ƒR[ƒq[");
		//‰¿Ši
		ArrayList<Integer>price = new ArrayList<>();
		price.add(100);
		price.add(200);
		//Ú×•\¦
		ArrayList <String> detail = new ArrayList<>();
		detail.add("w‘å’n‚ÌŒb‚İ‚ğ‘Ì‚Éx");
		detail.add("w‚³‚í‚â‚©‚Åƒtƒ‹[ƒeƒB[‚È–¡‚í‚¢x");
		
		int first =0;
		int second =0;
		//true‚ÈŒÀ‚èƒ‹[ƒv
		boolean check = true;
		while(check) {
		System.out.println("E‹@”\‘I‘ğ");
		System.out.println("]]]]]");
		System.out.println("1:‹àŠz“ü—Í");
		System.out.println("2:¤•i‘I‘ğ");
		System.out.println("9:–ß‚é");
		System.out.println("]]]]]");
		System.out.println("”Ô†‚ğ‘I‘ğ‚µ‚Ä‚­‚¾‚³‚¢");
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
				 // w“üÅ’á‹àŠz‚Ìê‡A’Ç‰Á“ü‹à
		        int deposit = 0;
		        int minSaleAmount = price.get(0);
		        Scanner scanner = new Scanner(System.in);
		        do {
		            // “ü‹àˆ—
		            System.out.println("‚¨‹à‚ğ“ü‚ê‚Ä‰º‚³‚¢B");
		            deposit = deposit + scanner.nextInt();

		            // ‹àŠzƒ`ƒFƒbƒNiÅ’áw“ü‹àŠzj
//		            int loopCount = 0;
//		            for (Integer itemKey: price) {
//		                if(loopCount == 0 || minSaleAmount > itemKey) {
//		                    minSaleAmount = itemKey;
//		                }
//		                loopCount++;
//		            }
		        } while(deposit < minSaleAmount);
		        for (int i=0; i<name.size(); i++) {
					System.out.println("|"+(i+1)+"|"+name.get(i)+"|"+price.get(i)+"‰~|");
						}
		        System.out.println("¤•i”Ô†‚ğ‰Ÿ‚µ‚Ä‚­‚¾‚³‚¢");
		        Scanner scan = new Scanner(System.in); 
		        this.number = scan.nextInt(); 
		        switch (number) {
		        case 1 :
		        	System.out.println("…‚Å‚·"); 	
		        	break;
		        case 2 :
		        	System.out.println("ƒR[ƒq[‚Å‚·");
		        	break;
		        }
		        check = true;
				break;
			case 2 :
				boolean kakunin = true;
				while(kakunin) {
				//¤•i•\¦
				System.out.println("E¤•i‘I‘ğ");
				System.out.println("]]]]]");
				for (int i=0; i<name.size(); i++) {
					System.out.println("|"+(i+1)+"|"+name.get(i)+"|"+price.get(i)+"‰~|");
						}
				System.out.println("]]]]]");
	//			System.out.println("¤•i‚ğ‘I‘ğ‚µ‚Ä‚­‚¾‚³‚¢");
				 System.out.println("¤•i”Ô†‚ğ‰Ÿ‚µ‚Ä‚­‚¾‚³‚¢"); 
		         
			        Scanner sc = new Scanner(System.in); 
			        this.number = sc.nextInt(); 
			        
			        switch(number){
			            case 1:
			            	int nyukina =0;
			            	Scanner scannera = new Scanner(System.in);
			            	
			            	 do {
			                     // “ü‹àˆ—
			                     System.out.println("‚¨‹à‚ğ“ü‚ê‚Ä‰º‚³‚¢B");
			                    nyukina = nyukina + scannera.nextInt();

			                     
			                 } while(nyukina < 100);
			            	 kakunin =false;
			                break;
			            case 2:
			            	int nyukinb =0;
			            	Scanner scannerb = new Scanner(System.in);
			            	
			            	 do {
			                     // “ü‹àˆ—
			                     System.out.println("‚¨‹à‚ğ“ü‚ê‚Ä‰º‚³‚¢B");
			                    nyukinb = nyukinb + scannerb.nextInt();

			                     
			                 } while(nyukinb < 200);
			            	 kakunin =false;
			            	 break;    
			        
			        	default: 		        	
			           System.out.println("1~2‚Ì”š‚ğ“ü—Í‚µ‚Ä‰º‚³‚¢");
			           kakunin =true;
			           break;
			        }
			        
				}
				
				//¤•iŠJ••
				System.out.println("E¤•iŠJ••");
				System.out.println("]]]]]");
				System.out.println(name.get(number-1));
				System.out.println("|1|¤•i‚ÌÚ×‚ğ•\¦|");
				System.out.println("|2|ŠJ••‚·‚é|");
				System.out.println("|3|ŠJ••‚µ‚È‚¢|");
				System.out.println("]]]]]");
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
					System.out.println("wƒvƒVƒ…[x");
					break;
					
					case 3:
					System.out.println("wŠJ‚¯‚é‚Ì‚ğ‚â‚ß‚Ü‚·x");
				}
			       check = true;
			       break;
			        
			}
		}
	}
		
}


