public class FractionCalculator{
	
	public Fraction evaluate(Fraction fraction,String inputString){
		do{
			boolean finished = true;
			if (!inputString.indexOf(' ')==null){
				String str = inputString.substring(0,(inputString.indexOf(' ')));
				Character operator = inputString.charAt(inputString.indexOf(' ')+1);
				inputString = inputString.substring(inputString.indexOf(' ')+3);
				finished = false;
			}else{
				String str = inputString;
			}
			int a = Integer.parseInt(str.substring(0,str.indexOf('/')));
			int b = Integer.parseInt(str.substring(str.indexOf('/')+1));
			Fraction temp = new Fraction(a,b);
			if (operator == '*'){
				temp = fraction.multiply(temp);
			}else if (operator == '-'){
				temp = fraction.subtract(temp);
			}else if (operator == '+'){
				temp = fraction.add(temp);
			}else{
				temp = fraction.divide(temp);
			}
			return temp;
		}while (!finished);
	}
}