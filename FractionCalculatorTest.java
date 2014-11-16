public class FractionCalculatorTest {
    public static void main(String[] args) {
	    FractionCalculator test = new FractionCalculator();
	    String a = ("3/4 + 1/-3 * 7 / 5");
	    Fraction calculatorValue = new Fraction(0,1);
	    calculatorValue = test.evaluate(calculatorValue,a);
	    System.out.println(calculatorValue.toString());
	    calculatorValue = new Fraction(0,1);
	    String b = ("8");
	    calculatorValue = test.evaluate(calculatorValue,b);
	    System.out.println(calculatorValue.toString());
    }
}