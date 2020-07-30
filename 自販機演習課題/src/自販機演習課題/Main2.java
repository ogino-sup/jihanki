package ©”Ì‹@‰‰K‰Û‘è;

import java.io.*;
import java.util.*;

public class Main2 {
	
	
	public static void main(String[] args) {
		//¤•i–¼
		ArrayList <String> name = new ArrayList<>();
		name.add("…");
		name.add("ƒR[ƒq[");
		//‰¿Ši
		ArrayList<String>price = new ArrayList<>();
		price.add("100");
		price.add("200");
		
		int first =0;
		// TODO ©“®¶¬‚³‚ê‚½ƒƒ\ƒbƒhEƒXƒ^ƒu
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
				check = true;
				break;
				 // w“üÅ’á‹àŠz‚Ìê‡A’Ç‰Á“ü‹à
		        int deposit = 0;
		        int minSaleAmount = -1;
		        Scanner scanner = new Scanner(System.in);
		        do {
		            // “ü‹àˆ—
		            System.out.println("‚¨‹à‚ğ“ü‚ê‚Ä‰º‚³‚¢B");
		            deposit = deposit + scanner.nextInt();

		            // ‹àŠzƒ`ƒFƒbƒNiÅ’áw“ü‹àŠzj
		            int loopCount = 0;
		            for (String itemKey: items.keySet()) {
		                if(loopCount == 0 || minSaleAmount > items.get(itemKey)) {
		                    minSaleAmount = items.get(itemKey);
		                }
		                loopCount++;
		            }
		        } while(deposit < minSaleAmount);
			case 2 :
				//¤•i•\¦
				System.out.println("E¤•i‘I‘ğ");
				System.out.println("]]]]]");
				for (int i=0; i<name.size(); i++) {
					System.out.println("|"+(i+1)+"|"+name.get(i));
						}
				System.out.println("]]]]]");
				System.out.println("¤•i‚ğ‘I‘ğ‚µ‚Ä‚­‚¾‚³‚¢");
				check = true;
				break;
			}
		}
		
		
		
		
	}

}
