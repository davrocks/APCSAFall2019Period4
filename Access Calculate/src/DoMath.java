/* Davin Singh
 * APCSA 4th period
 * August 29, 2019
 * Call math methods from Calculate library
 * Client code or runner code
 */
public class DoMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(Calculate.square(12));
			System.out.println(Calculate.cube(3));
			System.out.println(Calculate.average(4,5));
			System.out.println(Calculate.average(4,5,7));
			System.out.println(Calculate.toDegrees(3.14159));
			System.out.println(Calculate.toRadians(180));
			System.out.println(Calculate.discriminant(2,4,3));
			System.out.println(Calculate.toImproperFrac(1,5,7));
			System.out.println(Calculate.toMixedNum(12,7));
			System.out.println(Calculate.foil(2, 3, 6, -7, "n"));
			System.out.println(Calculate.isDivisibleBy(51,3));
			System.out.println(Calculate.absValue(-0.15));
			System.out.println(Calculate.absValue(0.15));
			System.out.println(Calculate.max(0.75, -25));
			System.out.println(Calculate.max(73, -25, 63));
			System.out.println(Calculate.max(-0.75, 25, -3));
			System.out.println(Calculate.max(-3, -3, -3));
			System.out.println(Calculate.min(-0.75, 25));
			System.out.println(Calculate.min(5, -3));
			System.out.println(Calculate.min(-3, -3));
			System.out.println(Calculate.round2(-1.525));
			System.out.println(Calculate.round2(-1.524));
			System.out.println(Calculate.round2(1664.999999));
			System.out.println(Calculate.exponent(2,0));
			
			
	}

}
