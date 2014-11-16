public class FractionCalculator{
	public char operator = ' ';
	
	public static void main(String[] args) {
		FractionCalculator myCalculator = new FractionCalculator();
		System.out.println (" ^^^Welcome to Kieren Millar's Fraction Calculator!!!^^^");
		System.out.println ("This fraction calculator will calculate invidual fractions");
		System.out.println ("or a string of fractions (eg: 3/4 + 1/-3 * 7 / 5).");
		System.out.println ("Enter a, A or abs for the absolute value of the fraction");
		System.out.println ("Enter n, N or neg to negate the fraction");
		System.out.println ("Enter c, C or clear to reset the calculator");
		System.out.println ("Enter q, Q or quit to exit the program");
		Fraction calculatorValue = new Fraction(0,1);
		String function = "";
		while (!function.equals("q") || !function.equals("Q") || !function.equals("quit")){
			System.out.println("Calculator Value: " + calculatorValue.toString());
			System.out.print("please enter text: ");
			function = System.console().readLine();
			if (function.equals("n") || function.equals("N") || function.equals("neg")){
				calculatorValue = calculatorValue.negate();
			}else if (function.equals("c") || function.equals("C") || function.equals("clear")){
				calculatorValue = new Fraction(0,1);
			}else if (function.equals("q") || function.equals("Q") || function.equals("quit")){
				System.out.println("GoodBye!");
				System.exit(0);
			}else if (function.equals("a") || function.equals("A") || function.equals("abs")){
				System.out.println("Absolute Value: " + calculatorValue.absValue());
			}else if (function.equals("/") || function.equals("*") || function.equals("-") || function.equals("+")){
				myCalculator.operator = function.charAt(0);
			}else{
				calculatorValue = myCalculator.evaluate(calculatorValue,function);
			}
		}
	}
	
	public Fraction evaluate(Fraction fraction,String inputString){
		boolean finished;
		Fraction temp;
		int count = 0;
		do{
			finished = true;
			String str = "";
			// Gets operator value
			if ((count > 0) && (inputString.indexOf(' ') != -1)){
				operator = inputString.charAt(inputString.indexOf(' ')+1);
				inputString = inputString.substring(inputString.indexOf(' ')+3);
			}
			//checks whether single fraction or multiple fractions
			if (inputString.indexOf(' ') != -1){
				str = inputString.substring(0,(inputString.indexOf(' ')));
				finished = false;
			}else{
				str = inputString;
			}
			// converts string to Fraction
			if (str.indexOf('/') != -1 || str.indexOf('*') != -1 || str.indexOf('-') != -1 || str.indexOf('+') != -1){
				int a = Integer.parseInt(str.substring(0,str.indexOf('/')));
				int b = Integer.parseInt(str.substring(str.indexOf('/')+1));
				temp = new Fraction(a,b);
			}else{
				int a = Integer.parseInt(str);
				temp = new Fraction(a,1);
			}
			//Calculates the result
			if (operator == '*'){
				temp = fraction.multiply(temp);
			}else if (operator == '-'){
				temp = fraction.subtract(temp);
			}else if (operator == '+'){
				temp = fraction.add(temp);
			}else if (operator == '/'){
				temp = fraction.divide(temp);
			}
			fraction = temp;
			count ++;//used to stop the operator from being changed on first iteration
		}while (!finished);
		operator = ' ';//resests the operator
		return temp;
	}
}