/*
 * Problem 9:-
 * 
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * 
 * a2 + b2 = c2
 * 
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 * 
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */

package ProjectEuler;

public class triplet {
	public static void main(String[]args) {
		int sum=1000,a=0,b=0,c=0;
		for(a=0;a<sum;a++){
			for(b=0;b<sum;b++) {
				for(c=0;c<sum;c++) {
					if (a < b && b < c && a + b + c == sum
	                        && (c * c == a * a + b * b)) {
	                    System.out.print(a * b * c);
					}
				}
			}
		}
	}
}		