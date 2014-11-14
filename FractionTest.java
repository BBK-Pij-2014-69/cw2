
public class FractionTest {
    public static void main(String[] args) {

        new Fraction(2,0);// test divide by zero - should print an error and exit
	Fraction f = new Fraction(3,10); // Multiply
	Fraction a = new Fraction(11,10); // Add
	Fraction s = new Fraction(-1,10); // Subtract
	Fraction d = new Fraction(5,6); // Divide
	Fraction g = new Fraction(1,2);
	Fraction h = new Fraction(3,5);
	if (!f.equals(g.multiply(h))) System.out.println("Multiply failed");// test Multiply
        if (!a.equals(g.add(h))) System.out.println("Add failed");// test Add
        if (!s.equals(g.subtract(h))) System.out.println("Subtract failed");// test Subtract
        if (!d.equals(g.divide(h))) System.out.println("divide failed");// test Divide
    	// tests 
	test(new Fraction(1, 2),new Fraction(1, 2),"error test 1");
	test(new Fraction(1, 2),new Fraction(3, 6),"error test 2");
	test(new Fraction(-1, 2),new Fraction(1, -2),"error test 3");
	test(new Fraction(-1, -2),new Fraction(1, 2),"error test 4");
	test(new Fraction(4, -8),new Fraction(1, 2),"error test 5");
	// testing toString
	System.out.println(f.toString());
	Fraction b = new Fraction(5,1);
	System.out.println(b.toString());
	//testing negate
	Fraction x = new Fraction(2,4);
	Fraction y = x.negate();
	System.out.println(y.toString());
    }

    static void test(Fraction f1, Fraction f2, String msg){
    	if (! f1.equals(f2))
		System.out.println(msg);
    }
}
