public class RationalClient {

    //Create a new rational equal to 1/2
    public static void main(String[] args) {
        Rational r = new Rational(4, 8);
        System.out.println(r); // 1/2

        // We can use dot notation to access the integer values
        // of the numerator and denominator directly
        System.out.println(r.numerator); // 1
        System.out.println(r.denominator); // 2

//       // A basic test for adding Rationals
        Rational s = new Rational(1, 3);
        System.out.println("\nAdd Tests");
        System.out.println(s); // 1/3
        Rational t = Rational.add(r, s);
        System.out.println(t); // 5/6


         s = new Rational(1, 3);
        System.out.println("\nSubtract Tests");
         t = Rational.subtract(r, s);
        System.out.println(t); // 1/6

        Rational o = new Rational(3,3);
        t = Rational.subtract(o, s);
        System.out.println(t); // 2/3

        System.out.println("\nMultiply Tests");
         o = new Rational(1,2);
        t = Rational.multiply(o, s);
        System.out.println(t); // 1/6

        System.out.println("\nDivide Tests");
        o = new Rational(1,1);
        Rational g = new Rational (1,2);
        t = Rational.divide(o, g);
        System.out.println(t); // 1/6

        System.out.println("\nGCF Tests");
        System.out.println(Rational.greatestCommonFactor(24,36));
        System.out.println(Rational.greatestCommonFactor(18,27));

        System.out.println("\nSimplify Tests");
        System.out.println(Rational.simplify(r));





//
//        // A more advanced test for adding Rational that won't work
//        // until the greatestCommonFactor and simplify methods work
//        Rational x = new Rational(1, 6);
//        Rational y = Rational.add(t, x);
//        System.out.println(y); // 1/1
    }
}
