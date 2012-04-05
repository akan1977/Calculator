package net.slipp;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class StringCalculator {

	public int Fun_Add(String text) {

		if (text.isEmpty()) {
			return 0;
		} else {
			int StrCount = text.length();
			int k = 0;
			int k1=0;
			if (StrCount > 1) {

				for (int i = 0; i <= StrCount - 1; i++) {
					if (text.charAt(i) == ',') {
						k = k + 1;
					}else if(text.charAt(i) == '\n'){
						k1 = k1 + 1;
						
					}
				}

				if ( k1==0 && k == 1) {

					String[] numbers = text.split(",");
					return Integer.parseInt(numbers[0])
							+ Integer.parseInt(numbers[1]);

				} else if(k1==0 && k==2) {
					String[] numbers = text.split(",");
					return Integer.parseInt(numbers[0])
							+ Integer.parseInt(numbers[1])
							+ Integer.parseInt(numbers[2]);
				}else if(k1==0 && k==0){
					
					Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
					m.find();
					String customDelimeter =m.group(1);
					String[] numbers=m.group(2).split(customDelimeter);
					
				 
				 
				
				}
				
				
				
				
				
				 
				
				
				
				
				
				
			}

			int numer = Integer.parseInt(text);
			return numer;

		}

	}

}
