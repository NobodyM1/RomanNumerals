
public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		int IXCM = checkIfCharacters_IXCM_repeat(romanNum);
		if(IXCM == 1){
			return 1337;
		}
		int VLD = checkIfCharacters_VLD_repeated(romanNum);
		if(VLD == 1){
			return 1020304050;
		}
		int decimal = 0;
		// Used in checking numbers like IV = 4
		int lastNumber = 0;
	
		for(int i=romanNum.length() -1; i>=0; i--){
			
			char compare = romanNum.charAt(i);
			
			if(compare == 'M'){
				decimal= checkNumber(1000, lastNumber, decimal);
				lastNumber = 1000;
			}
			
			if(compare == 'D'){
				decimal= checkNumber(500, lastNumber, decimal);
				lastNumber = 500;
			}
			
			if(compare == 'C'){
				decimal= checkNumber(100, lastNumber, decimal);
				lastNumber = 100;
			}
			
			if(compare == 'L'){
				decimal= checkNumber(50, lastNumber, decimal);
				lastNumber = 50;
			}
			
			if(compare == 'X'){
				decimal= checkNumber(10, lastNumber, decimal);
				lastNumber = 10;
			}
			
			if(compare == 'V'){
				decimal= checkNumber(5, lastNumber, decimal);
				lastNumber = 5;
			}
			
			if(compare == 'I'){
				decimal= checkNumber(1, lastNumber, decimal);
				lastNumber = 1;
			}
			
		}
		
		return decimal;
		
	}
	
	public static int checkNumber(int decimal, int lastNumber, int newNumber){
		if(lastNumber > decimal){
			return newNumber - decimal;
		}
		else {
			return newNumber + decimal;
		}
	}
	
	public static int checkIfCharacters_IXCM_repeat(String romanNum){
		
		if(romanNum.matches("(.*)IIII(.*)")== true){
			return 1;
		}
		if(romanNum.matches("(.*)XXXX(.*)")== true){
			return 1;
		}
		if(romanNum.matches("(.*)CCCC(.*)")== true){
			return 1;
		}
		if(romanNum.matches("(.*)MMMM(.*)")== true){
			return 1;
		}
		return 0;
	}
	
	public static int checkIfCharacters_VLD_repeated(String romanNum){
		if(romanNum.matches("(.*)VV(.*)")== true){
			return 1;
		}
		if(romanNum.matches("(.*)LL(.*)")== true){
			return 1;
		}
		if(romanNum.matches("(.*)DD(.*)")== true){
			return 1;
		}
		return 0;
	}
}
